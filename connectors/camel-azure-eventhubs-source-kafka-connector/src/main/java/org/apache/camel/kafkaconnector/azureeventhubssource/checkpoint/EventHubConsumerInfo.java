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

import static java.util.Collections.unmodifiableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.azure.messaging.eventhubs.models.Checkpoint;
import com.azure.messaging.eventhubs.models.PartitionOwnership;

/**
 * The source offset information about the Azure EventHub consumer.
 */
record EventHubConsumerInfo(Map<String, String> value) {
    private static final Logger LOG = LoggerFactory.getLogger(EventHubOffsetCheckpointStore.class);

    private static final String NAMESPACE = "namespace";
    private static final String EVENT_HUB = "eventHub";
    private static final String CONSUMER_GROUP = "consumerGroup";

    static EventHubConsumerInfo of(String namespace, String eventHub, String consumerGroup) {
        var value = new HashMap<String, String>();
        Optional.ofNullable(namespace).ifPresent(it -> value.put(NAMESPACE, it));
        Optional.ofNullable(eventHub).ifPresent(it -> value.put(EVENT_HUB, it));
        Optional.ofNullable(consumerGroup).ifPresent(it -> value.put(CONSUMER_GROUP, it));
        return new EventHubConsumerInfo(unmodifiableMap(value));
    }

    static EventHubConsumerInfo of(Checkpoint checkpoint) {
        return of(checkpoint.getFullyQualifiedNamespace(),
            checkpoint.getEventHubName(),
            checkpoint.getConsumerGroup());
    }

    static EventHubConsumerInfo of(PartitionOwnership partitionOwnership) {
        return of(partitionOwnership.getFullyQualifiedNamespace(),
            partitionOwnership.getEventHubName(),
            partitionOwnership.getConsumerGroup());
    }

    static Optional<EventHubConsumerInfo> tryParse(Map<?, ?> value) {
        String fullyQualifiedNamespace = null;
        String eventHubName = null;
        String consumerGroup = null;
        if (value.get(NAMESPACE) instanceof String it) {
            fullyQualifiedNamespace = it;
        }
        if (value.get(NAMESPACE) instanceof String it) {
            eventHubName = it;
        }
        if (value.get(CONSUMER_GROUP) instanceof String it) {
            consumerGroup = it;
        }
        if (fullyQualifiedNamespace == null && eventHubName == null && consumerGroup == null) {
            LOG.warn("Invalid offset-key {}", value);
            return Optional.empty();
        }
        return Optional.of(of(fullyQualifiedNamespace, eventHubName, consumerGroup));
    }

    String namespace() {
        return value.get(NAMESPACE);
    }

    String eventHub() {
        return value.get(EVENT_HUB);
    }

    String consumerGroup() {
        return value.get(CONSUMER_GROUP);
    }
}
