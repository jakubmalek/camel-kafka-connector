/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.azureeventhubssource.checkpoint;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.camel.Exchange;
import org.apache.kafka.connect.storage.OffsetStorageReader;

import com.azure.messaging.eventhubs.CheckpointStore;
import com.azure.messaging.eventhubs.models.Checkpoint;
import com.azure.messaging.eventhubs.models.PartitionOwnership;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * The implementation of the {@link CheckpointStore} using Kafka Connect offset topic.
 * <p>
 * The checkpoints and partition ownership data is being stored in connector offset.
 * The source partition is the name of the event hub, passed in the configuration.
 * </p>
 */
public final class EventHubOffsetCheckpointStore implements CheckpointStore {
    private final OffsetStorageReader offsetStorageReader;
    private final Map<EventHubSourcePartition, EventHubSourceOffset> offsets;

   public EventHubOffsetCheckpointStore(final OffsetStorageReader offsetStorageReader) {
        this.offsetStorageReader = offsetStorageReader;
        offsets = new ConcurrentHashMap<>();
    }

   /**
    * Returns the current source offset.
    *
    * @return the source offset value
    */
    public Map<String, ?> getSourceOffset(Exchange exchange) {
       final var partitionId = EventHubSourcePartition.of(exchange);
       return getOffset(partitionId).toMap();
   }

    @Override
    public Flux<PartitionOwnership> listOwnership(String fullyQualifiedNamespace, String eventHubName, String consumerGroup) {
        final var eventHubConsumerInfo = EventHubConsumerInfo.of(fullyQualifiedNamespace, eventHubName, consumerGroup);
        return Flux.fromStream(offsets.entrySet().stream()
            .map(entry -> entry.getValue().getPartitionOwnership(entry.getKey(), eventHubConsumerInfo))
            .mapMulti(Optional::ifPresent));
    }

    @Override
    public Flux<PartitionOwnership> claimOwnership(final List<PartitionOwnership> requestedPartitionOwnerships) {
        return Flux.fromIterable(requestedPartitionOwnerships)
            .map(partitionOwnership -> {
                final var sourcePartition = new EventHubSourcePartition(partitionOwnership.getPartitionId());
                getOffset(sourcePartition).putPartitionOwnership(partitionOwnership);
                return partitionOwnership;
            });
    }

    @Override
    public Flux<Checkpoint> listCheckpoints(String fullyQualifiedNamespace, String eventHubName, String consumerGroup) {
        final var eventHubConsumerInfo = EventHubConsumerInfo.of(fullyQualifiedNamespace, eventHubName, consumerGroup);
        return Flux.fromStream(offsets.entrySet().stream()
            .map(entry -> entry.getValue().getCheckpoint(entry.getKey(), eventHubConsumerInfo))
            .mapMulti(Optional::ifPresent));
    }

    @Override
    public Mono<Void> updateCheckpoint(final Checkpoint checkpoint) {
        final var sourceParition = new EventHubSourcePartition(checkpoint.getPartitionId());
        return Mono.defer(() -> {
            getOffset(sourceParition).putCheckpoint(checkpoint);
            return Mono.empty();
        });
    }

    private EventHubSourceOffset getOffset(EventHubSourcePartition partitionId) {
        return offsets.computeIfAbsent(partitionId, this::loadOffset);
    }

    private EventHubSourceOffset loadOffset(final EventHubSourcePartition sourceParition) {
        final var result = new EventHubSourceOffset();
        final var offset = offsetStorageReader.offset(sourceParition.toMap());
        if (offset != null) {
            result.load(offset);
        }
        return result;
    }
}
