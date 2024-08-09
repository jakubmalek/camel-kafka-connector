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

import com.azure.messaging.eventhubs.models.PartitionOwnership;

/**
 * The source offset information about the Azure EventHub partition ownership.
 */
record EventHubPartitionOwnershipOffset(Map<String, Object> value) {
    private static final Logger LOG = LoggerFactory.getLogger(EventHubPartitionOwnershipOffset.class);

    private static final String OWNER_ID = "ownerId";
    private static final String LAST_MODIFIED_TIME = "lastModified";
    private static final String ETAG = "etag";

    static EventHubPartitionOwnershipOffset of(PartitionOwnership partitionOwnership) {
        var key = new HashMap<String, Object>();
        Optional.ofNullable(partitionOwnership.getOwnerId()).ifPresent(it -> key.put(OWNER_ID, it));
        Optional.ofNullable(partitionOwnership.getLastModifiedTime()).ifPresent(it -> key.put(LAST_MODIFIED_TIME, it));
        Optional.ofNullable(partitionOwnership.getETag()).ifPresent(it -> key.put(ETAG, it));
        return new EventHubPartitionOwnershipOffset(unmodifiableMap(key));
    }

    static Optional<EventHubPartitionOwnershipOffset> tryParse(final Map<?, ?> value) {
        final var result = new HashMap<String, Object>();
        if (value.get(OWNER_ID) instanceof String ownerId) {
            result.put(OWNER_ID, ownerId);
        }
        if (value.get(LAST_MODIFIED_TIME) instanceof Number lastModified) {
            result.put(LAST_MODIFIED_TIME, lastModified.longValue());
        }
        if (value.get(ETAG) instanceof String etag) {
            result.put(ETAG, etag);
        }
        if (result.isEmpty()) {
            LOG.warn("Invalid checkpoint-value {}", value);
            return Optional.empty();
        }
        return Optional.of(new EventHubPartitionOwnershipOffset(unmodifiableMap(result)));
    }

    String ownerId() {
        if (value.get(OWNER_ID) instanceof String ownerId) {
            return ownerId;
        }
        return null;
    }

    Long lastModifiedTime() {
        if (value.get(LAST_MODIFIED_TIME) instanceof Long lastModifiedTime) {
            return lastModifiedTime;
        }
        return null;
    }

    String eTag() {
        if (value.get(ETAG) instanceof String eTag) {
            return eTag;
        }
        return null;
    }
}
