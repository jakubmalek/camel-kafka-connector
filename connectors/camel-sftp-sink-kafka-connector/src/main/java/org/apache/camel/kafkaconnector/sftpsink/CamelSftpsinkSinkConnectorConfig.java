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
package org.apache.camel.kafkaconnector.sftpsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSftpsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SFTPSINK_KAMELET_HOST_CONF = "camel.kamelet.sftp-sink.host";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_HOST_DOC = "Hostname of the FTP server";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PORT_CONF = "camel.kamelet.sftp-sink.port";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PORT_DOC = "Port of the FTP server";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PORT_DEFAULT = "22";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_CONF = "camel.kamelet.sftp-sink.username";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_DOC = "The username to access the FTP server";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_CONF = "camel.kamelet.sftp-sink.password";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_DOC = "The password to access the FTP server";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_CONF = "camel.kamelet.sftp-sink.directoryName";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_DOC = "The starting directory";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_CONF = "camel.kamelet.sftp-sink.passiveMode";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_DOC = "Sets passive mode connection";
    public static final Boolean CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_DEFAULT = false;
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_CONF = "camel.kamelet.sftp-sink.fileExist";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_DOC = "How to behave in case of file already existent. There are 4 enums and the value can be one of Override, Append, Fail or Ignore";
    public static final String CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_DEFAULT = "Override";

    public CamelSftpsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSftpsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SFTPSINK_KAMELET_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SFTPSINK_KAMELET_HOST_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SFTPSINK_KAMELET_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SFTPSINK_KAMELET_PORT_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SFTPSINK_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SFTPSINK_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SFTPSINK_KAMELET_DIRECTORY_NAME_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SFTPSINK_KAMELET_PASSIVE_MODE_DOC);
        conf.define(CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SFTPSINK_KAMELET_FILE_EXIST_DOC);
        return conf;
    }
}