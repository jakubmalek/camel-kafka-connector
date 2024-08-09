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

/**
 * The source offset information about the Azure EventHub checkpoint.
 */
record EventHubCheckpointOffset(Map<String, Object> value) {
    private static final Logger LOG = LoggerFactory.getLogger(EventHubOffsetCheckpointStore.class);

    private static final String OFFSET = "offset";
    private static final String SEQUENCE_NUMBER = "sequenceNo";

    static EventHubCheckpointOffset of(Checkpoint checkpoint) {
        var value = new HashMap<String, Object>();
        Optional.ofNullable(checkpoint.getOffset()).ifPresent(it -> value.put(OFFSET, it));
        Optional.ofNullable(checkpoint.getSequenceNumber()).ifPresent(it -> value.put(SEQUENCE_NUMBER, it));
        return new EventHubCheckpointOffset(unmodifiableMap(value));
    }

    static Optional<EventHubCheckpointOffset> tryParse(final Map<?, ?> value) {
        final var result = new HashMap<String, Object>();
        if (value.get(OFFSET) instanceof Number offset) {
            result.put(OFFSET, offset.longValue());
        }
        if (value.get(SEQUENCE_NUMBER) instanceof Number sequenceNumber) {
            result.put(SEQUENCE_NUMBER, sequenceNumber.longValue());
        }
        if (result.isEmpty()) {
            LOG.warn("Invalid checkpoint-value {}", value);
            return Optional.empty();
        }
        return Optional.of(new EventHubCheckpointOffset(unmodifiableMap(result)));
    }

    Long offset() {
        if (value.get(OFFSET) instanceof Long offset) {
            return offset;
        }
        return null;
    }

    Long sequenceNumber() {
        if (value.get(SEQUENCE_NUMBER) instanceof Long sequenceNumber) {
            return sequenceNumber;
        }
        return null;
    }
}