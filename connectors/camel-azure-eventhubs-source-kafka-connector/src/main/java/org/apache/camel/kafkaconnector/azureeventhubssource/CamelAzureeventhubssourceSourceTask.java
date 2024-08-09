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
package org.apache.camel.kafkaconnector.azureeventhubssource;

import static org.apache.camel.kafkaconnector.azureeventhubssource.CamelAzureeventhubssourceSourceConnectorConfig.CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_CONF;
import static org.apache.camel.kafkaconnector.azureeventhubssource.CamelAzureeventhubssourceSourceConnectorConfig.CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_CONF;
import static org.apache.camel.kafkaconnector.azureeventhubssource.CamelAzureeventhubssourceSourceConnectorConfig.CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_CONF;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.component.azure.eventhubs.EventHubsEndpoint;
import org.apache.camel.kafkaconnector.CamelSourceTask;
import org.apache.camel.kafkaconnector.azureeventhubssource.checkpoint.EventHubOffsetCheckpointStore;
import org.apache.camel.kafkaconnector.azureeventhubssource.checkpoint.EventHubSourcePartition;
import org.apache.kafka.common.config.ConfigException;


public class CamelAzureeventhubssourceSourceTask extends CamelSourceTask {
    private EventHubOffsetCheckpointStore checkpointStore;

    public CamelAzureeventhubssourceSourceTask() {
        setEndpointCustomizer(endpoint -> {
            if (checkpointStore != null && endpoint instanceof EventHubsEndpoint eventHubsEndpoint) {
                eventHubsEndpoint.getConfiguration().setCheckpointStore(checkpointStore);
            }
        });
    }

    @Override
    protected CamelAzureeventhubssourceSourceConnectorConfig getCamelSourceConnectorConfig(Map<String, String> props) {
        return new CamelAzureeventhubssourceSourceConnectorConfig(props);
    }

    @Override
    public void start(Map<String, String> properties) {
        final var config = getCamelSourceConnectorConfig(properties);
        if (!isBlobCheckpointStorageEnabled(config)) {
            checkpointStore = new EventHubOffsetCheckpointStore(context.offsetStorageReader());
        }
        super.start(properties);
    }

    @Override
    protected String getSourceKamelet() {
        return "kamelet:azure-eventhubs-source";
    }

    @Override
    protected Map<String, ?> toSourcePartition(Exchange exchange) {
        if (checkpointStore != null) {
            return EventHubSourcePartition.of(exchange).toMap();
        }
        return super.toSourcePartition(exchange);
    }

    @Override
    protected Map<String, ?> toSourceOffset(Exchange exchange) {
        if (checkpointStore != null) {
            return checkpointStore.getSourceOffset(exchange);
        }
        return super.toSourceOffset(exchange);
    }

    private static boolean isBlobCheckpointStorageEnabled(CamelAzureeventhubssourceSourceConnectorConfig config) {
        final var blobAccountName = config.getString(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_CONF);
        final var blobContainerName = config.getPassword(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_CONF);
        final var blobAccessKey = config.getPassword(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_CONF);
        if (blobAccountName == null && blobContainerName == null && blobAccessKey == null) {
            return false;
        }
        if (blobAccountName == null) {
            throw incompleteBlobStorageConfigExeception(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCOUNT_NAME_CONF);
        }
        if (blobContainerName == null) {
            throw incompleteBlobStorageConfigExeception(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_CONTAINER_NAME_CONF);
        }
        if (blobAccessKey == null) {
            throw incompleteBlobStorageConfigExeception(CAMEL_SOURCE_AZUREEVENTHUBSSOURCE_KAMELET_BLOB_ACCESS_KEY_CONF);
        }
        return true;
    }

    private static ConfigException incompleteBlobStorageConfigExeception(String missingConfigName) {
        throw new ConfigException(missingConfigName, null, "Incomplete Azure Blob Storage configuration");
    }
}
