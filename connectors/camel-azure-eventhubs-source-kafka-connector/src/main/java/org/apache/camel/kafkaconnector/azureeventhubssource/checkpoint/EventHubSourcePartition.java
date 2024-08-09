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

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.component.azure.eventhubs.EventHubsConstants;

/**
 * The source partition of Azure EventHub source connector.
 *
 * @param partitionId the id of the EventHub partition
 */
public record EventHubSourcePartition(String partitionId) {
    private static final String PARTITION_ID = "partitionId";

    /**
     * Returns {@link EventHubSourcePartition} from the given {@link Exchange}.
     * The partition id is extracted from the CamelAzureEventHubsPartitionId header.
     *
     * @param exchange the exchange for which source partition is returned
     * @return {@link EventHubSourcePartition}
     */
    public static EventHubSourcePartition of(Exchange exchange) {
        return new EventHubSourcePartition(exchange.getMessage().getHeader(EventHubsConstants.PARTITION_ID, String.class));
    }

    /**
     * Returns map representation of the source partition.
     *
     * @return {@link Map}
     */
    public Map<String, String> toMap() {
        return Map.of(PARTITION_ID, partitionId);
    }
}