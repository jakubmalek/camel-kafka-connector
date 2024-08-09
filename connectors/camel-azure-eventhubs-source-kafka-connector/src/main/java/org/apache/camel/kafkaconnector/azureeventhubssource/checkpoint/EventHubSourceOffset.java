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

import static java.util.stream.Collectors.toUnmodifiableMap;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.azure.messaging.eventhubs.models.Checkpoint;
import com.azure.messaging.eventhubs.models.PartitionOwnership;

/**
 * The source offset of the Azure EventHub source connector.
 *
 * The source offset is partitioned by {@link EventHubSourcePartition}.
 */
record EventHubSourceOffset(Map<EventHubConsumerInfo, EventHubCheckpointOffset> checkpoints,
                            Map<EventHubConsumerInfo, EventHubPartitionOwnershipOffset> partitionOwnerships) {
    private static final String CHECKPOINT_KEY = "checkpoint";
    private static final String OWNERSHIP_KEY = "ownership";

    EventHubSourceOffset() {
        this(new ConcurrentHashMap<>(), new ConcurrentHashMap<>());
    }

    void load(Map<String, ?> offset) {
        if (offset.get(CHECKPOINT_KEY) instanceof Map<?, ?> checkpointsOffsets) {
            loadCheckpoints(checkpointsOffsets);
        }
        if (offset.get(OWNERSHIP_KEY) instanceof Map<?, ?> partitionOwnerships) {
            loadPartitionOwnerships(partitionOwnerships);
        }
    }

    private void loadCheckpoints(Map<?, ?> checkpointsOffsets) {
        checkpointsOffsets.forEach((k, v) -> {
            if (k instanceof Map<?, ?> key && v instanceof Map<?, ?> value) {
                EventHubConsumerInfo.tryParse(key)
                    .ifPresent(consumerInfo -> EventHubCheckpointOffset.tryParse(value)
                        .ifPresent(checkpointOffset -> checkpoints.put(consumerInfo, checkpointOffset)));
            }
        });
    }

    private void loadPartitionOwnerships(Map<?, ?> partitionOwnershipsOffsets) {
        partitionOwnershipsOffsets.forEach((k, v) -> {
            if (k instanceof Map<?, ?> key && v instanceof Map<?, ?> value) {
                EventHubConsumerInfo.tryParse(key)
                    .ifPresent(consumerInfo -> EventHubPartitionOwnershipOffset.tryParse(value)
                        .ifPresent(partitionOwnershipOffset -> partitionOwnerships.put(consumerInfo, partitionOwnershipOffset)));
            }
        });
    }

    void putCheckpoint(Checkpoint checkpoint) {
        checkpoints.put(EventHubConsumerInfo.of(checkpoint), EventHubCheckpointOffset.of(checkpoint));
    }

    Optional<Checkpoint> getCheckpoint(EventHubSourcePartition sourcePartition, EventHubConsumerInfo eventHubConsumerInfo) {
        return Optional.ofNullable(checkpoints.get(eventHubConsumerInfo))
            .map(value -> toCheckpoint(sourcePartition, eventHubConsumerInfo, value));
    }

    void putPartitionOwnership(PartitionOwnership partitionOwnership) {
        partitionOwnerships.put(EventHubConsumerInfo.of(partitionOwnership), EventHubPartitionOwnershipOffset.of(partitionOwnership));
    }

    Optional<PartitionOwnership> getPartitionOwnership(EventHubSourcePartition sourcePartition, EventHubConsumerInfo eventHubConsumerInfo) {
        return Optional.ofNullable(partitionOwnerships.get(eventHubConsumerInfo))
            .map(value -> toPartitionOwnership(sourcePartition, eventHubConsumerInfo, value));
    }

    Map<String, ?> toMap() {
        return Map.of(
            CHECKPOINT_KEY,
            checkpoints.entrySet().stream().collect(toUnmodifiableMap(
                entry -> entry.getKey().value(),
                entry -> entry.getValue().value())),
            OWNERSHIP_KEY,
            partitionOwnerships.entrySet().stream().collect(toUnmodifiableMap(
                entry -> entry.getKey().value(),
                entry -> entry.getValue().value())));
    }

    private static Checkpoint toCheckpoint(EventHubSourcePartition sourcePartition,
                                           EventHubConsumerInfo eventHubConsumerInfo,
                                           EventHubCheckpointOffset checkpointOffset) {
        final var checkpoint = new Checkpoint();
        checkpoint.setEventHubName(eventHubConsumerInfo.eventHub());
        checkpoint.setFullyQualifiedNamespace(eventHubConsumerInfo.namespace());
        checkpoint.setConsumerGroup(eventHubConsumerInfo.consumerGroup());
        checkpoint.setPartitionId(sourcePartition.partitionId());
        checkpoint.setOffset(checkpointOffset.offset());
        checkpoint.setSequenceNumber(checkpointOffset.sequenceNumber());
        return checkpoint;
    }

    private static PartitionOwnership toPartitionOwnership(EventHubSourcePartition sourcePartition,
                                                           EventHubConsumerInfo eventHubConsumerInfo,
                                                           EventHubPartitionOwnershipOffset partitionOwnershipOffset) {
        final var partitionOwnership = new PartitionOwnership();
        partitionOwnership.setEventHubName(eventHubConsumerInfo.eventHub());
        partitionOwnership.setFullyQualifiedNamespace(eventHubConsumerInfo.namespace());
        partitionOwnership.setConsumerGroup(eventHubConsumerInfo.consumerGroup());
        partitionOwnership.setPartitionId(sourcePartition.partitionId());
        partitionOwnership.setOwnerId(partitionOwnershipOffset.ownerId());
        partitionOwnership.setLastModifiedTime(partitionOwnershipOffset.lastModifiedTime());
        partitionOwnership.setETag(partitionOwnershipOffset.eTag());
        return partitionOwnership;
    }
}
