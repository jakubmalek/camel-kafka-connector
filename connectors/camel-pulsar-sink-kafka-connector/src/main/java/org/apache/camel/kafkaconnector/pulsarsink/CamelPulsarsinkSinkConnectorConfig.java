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
 */package org.apache.camel.kafkaconnector.pulsarsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelPulsarsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_CONF = "camel.kamelet.pulsar-sink.topic";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_DOC = "The topic name or regexp";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TENANT_CONF = "camel.kamelet.pulsar-sink.tenant";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TENANT_DOC = "The Tenant Name";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TENANT_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_CONF = "camel.kamelet.pulsar-sink.topicType";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_DOC = "The topic type.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_CONF = "camel.kamelet.pulsar-sink.namespaceName";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_DOC = "The Pulsar Namespace Name";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_CONF = "camel.kamelet.pulsar-sink.serviceUrl";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_DOC = "The Pulsar Service URL to point while creating the client from URI.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_CONF = "camel.kamelet.pulsar-sink.authenticationClass";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_DOC = "The Authentication FQCN to be used while creating the client from URI.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_CONF = "camel.kamelet.pulsar-sink.authenticationParams";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_DOC = "The Authentication Parameters to be used while creating the client from URI.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_CONF = "camel.kamelet.pulsar-sink.batchingEnabled";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_DOC = "Control whether automatic batching of messages is enabled for the producer.";
    public static final Boolean CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_CONF = "camel.kamelet.pulsar-sink.batchingMaxMessages";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_DOC = "The maximum size to batch messages.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF = "camel.kamelet.pulsar-sink.batchingMaxPublishDelayMicros";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC = "The maximum time period within which the messages sent will be batched if batchingEnabled is true.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_CONF = "camel.kamelet.pulsar-sink.blockIfQueueFull";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_DOC = "Whether to block the producing thread if pending messages queue is full or to throw a ProducerQueueIsFullError.";
    public static final Boolean CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_DEFAULT = false;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_CONF = "camel.kamelet.pulsar-sink.compressionType";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_DOC = "Compression type to use.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_CONF = "camel.kamelet.pulsar-sink.initialSequenceId";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_DOC = "The first message published will have a sequence Id of initialSequenceId 1.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_DEFAULT = -1;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_CONF = "camel.kamelet.pulsar-sink.lazyStartProducer";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel’s routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_CONF = "camel.kamelet.pulsar-sink.maxPendingMessages";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_DOC = "Size of the pending massages queue. When the queue is full, by default, any further sends will fail unless blockIfQueueFull=true.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_DEFAULT = 1000;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF = "camel.kamelet.pulsar-sink.maxPendingMessagesAcrossPartitions";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC = "The maximum number of pending messages for partitioned topics. The maxPendingMessages value will be reduced if (number of partitions maxPendingMessages) exceeds this value. Partitioned topics have a pending message queue for each partition.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT = 50000;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_CONF = "camel.kamelet.pulsar-sink.messageRoutingMode";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_DOC = "Message Routing Mode to use.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_DEFAULT = "RoundRobinPartition";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_CONF = "camel.kamelet.pulsar-sink.producerName";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_DOC = "Name of the producer. If unset, lets Pulsar select a unique identifier.";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_CONF = "camel.kamelet.pulsar-sink.sendTimeoutMs";
    public static final String CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_DOC = "Send timeout in milliseconds.";
    public static final Integer CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_DEFAULT = 30000;

    public CamelPulsarsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelPulsarsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_TENANT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_TENANT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSARSINK_KAMELET_TENANT_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSARSINK_KAMELET_TOPIC_TYPE_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSARSINK_KAMELET_NAMESPACE_NAME_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PULSARSINK_KAMELET_SERVICE_URL_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_CLASS_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_AUTHENTICATION_PARAMS_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_ENABLED_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_BATCHING_MAX_PUBLISH_DELAY_MICROS_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_BLOCK_IF_QUEUE_FULL_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_INITIAL_SEQUENCE_ID_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_MAX_PENDING_MESSAGES_ACROSS_PARTITIONS_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_MESSAGE_ROUTING_MODE_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_PRODUCER_NAME_DOC);
        conf.define(CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_CONF, ConfigDef.Type.INT, CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PULSARSINK_KAMELET_SEND_TIMEOUT_MS_DOC);
        return conf;
    }
}