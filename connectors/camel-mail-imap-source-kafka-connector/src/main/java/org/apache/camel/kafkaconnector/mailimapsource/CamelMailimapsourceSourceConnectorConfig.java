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
package org.apache.camel.kafkaconnector.mailimapsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMailimapsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_CONF = "camel.kamelet.mail-imap-source.host";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_DOC = "The IMAP server host Example: imap.gmail.com";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_CONF = "camel.kamelet.mail-imap-source.port";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_DOC = "The IMAP server port";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_DEFAULT = "993";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.mail-imap-source.username";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_DOC = "The username to access the mail box";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.mail-imap-source.password";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_DOC = "The password to access the mail box";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_CONF = "camel.kamelet.mail-imap-source.fetchSize";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_DOC = "The number of messages fetched for each poll (-1 for no limits)";
    public static final Integer CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_DEFAULT = 10;
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_CONF = "camel.kamelet.mail-imap-source.delay";
    public static final String CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_DOC = "The delay between fetches in milliseconds";
    public static final Integer CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_DEFAULT = 60000;

    public CamelMailimapsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMailimapsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_HOST_DOC);
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PORT_DOC);
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_FETCH_SIZE_DOC);
        conf.define(CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_MAILIMAPSOURCE_KAMELET_DELAY_DOC);
        return conf;
    }
}