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
package org.apache.camel.kafkaconnector.ftpsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelFtpsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_CONF = "camel.kamelet.ftp-source.connectionHost";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_DOC = "The hostname of the FTP server.";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_CONF = "camel.kamelet.ftp-source.connectionPort";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_DOC = "The port of the FTP server.";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_DEFAULT = "21";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.ftp-source.username";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_DOC = "The username to access the FTP server.";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.ftp-source.password";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_DOC = "The password to access the FTP server.";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_CONF = "camel.kamelet.ftp-source.directoryName";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_DOC = "The starting directory";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_CONF = "camel.kamelet.ftp-source.passiveMode";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_DOC = "Specifes to use passive mode connection.";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_DEFAULT = false;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_CONF = "camel.kamelet.ftp-source.recursive";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_DOC = "If a directory, look for files in all the sub-directories as well.";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_CONF = "camel.kamelet.ftp-source.idempotent";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_DOC = "Skip already-processed files.";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_DEFAULT = true;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_CONF = "camel.kamelet.ftp-source.binary";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_DOC = "Specifies the file transfer mode, BINARY or ASCII. Default is ASCII (false).";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_DEFAULT = false;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_CONF = "camel.kamelet.ftp-source.autoCreate";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_DOC = "Automatically create starting directory.";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_DEFAULT = true;
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_CONF = "camel.kamelet.ftp-source.delete";
    public static final String CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_DOC = "If true, the file will be deleted after it is processed successfully.";
    public static final Boolean CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_DEFAULT = false;

    public CamelFtpsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelFtpsourceSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_HOST_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FTPSOURCE_KAMELET_CONNECTION_PORT_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FTPSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_FTPSOURCE_KAMELET_DIRECTORY_NAME_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_PASSIVE_MODE_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_RECURSIVE_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_IDEMPOTENT_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_BINARY_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_AUTO_CREATE_DOC);
        conf.define(CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_FTPSOURCE_KAMELET_DELETE_DOC);
        return conf;
    }
}