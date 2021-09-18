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
package org.apache.camel.kafkaconnector.jmsamqp10sink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJmsamqp10sinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_CONF = "camel.kamelet.jms-amqp-10-sink.destinationType";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_DOC = "The JMS destination type (i.e.: queue or topic)";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_DEFAULT = "queue";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_CONF = "camel.kamelet.jms-amqp-10-sink.destinationName";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_DOC = "The JMS destination name";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URICONF = "camel.kamelet.jms-amqp-10-sink.remoteURI";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URIDOC = "The JMS URL Example: amqp://my-host:31616";
    public static final String CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URIDEFAULT = null;

    public CamelJmsamqp10sinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJmsamqp10sinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_TYPE_DOC);
        conf.define(CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JMSAMQP10SINK_KAMELET_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URICONF, ConfigDef.Type.STRING, CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URIDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JMSAMQP10SINK_KAMELET_REMOTE_URIDOC);
        return conf;
    }
}