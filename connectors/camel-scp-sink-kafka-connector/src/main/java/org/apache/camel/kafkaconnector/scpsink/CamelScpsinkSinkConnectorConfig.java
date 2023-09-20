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
package org.apache.camel.kafkaconnector.scpsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelScpsinkSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_CONF = "camel.kamelet.scp-sink.serverName";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_DOC = "The hostname of the FTP server";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_CONF = "camel.kamelet.scp-sink.serverPort";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_DOC = "The port of the FTP server";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_USERNAME_CONF = "camel.kamelet.scp-sink.username";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_USERNAME_DOC = "Username for accessing FTP Server";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_CONF = "camel.kamelet.scp-sink.password";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_DOC = "Password for accessing FTP Server";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_CONF = "camel.kamelet.scp-sink.privateKeyFile";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_DOC = "Set the private key file so that the SFTP endpoint can do private key verification.";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_CONF = "camel.kamelet.scp-sink.privateKeyPassphrase";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_DOC = "Set the private key file passphrase so that the SFTP endpoint can do private key verification.";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_DEFAULT = null;
    public static final String CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_CONF = "camel.kamelet.scp-sink.strictHostKeyChecking";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_DOC = "Sets whether to use strict host key checking.";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_DEFAULT = "false";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_CONF = "camel.kamelet.scp-sink.useUserKnownHostsFile";
    public static final String CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DOC = "If knownHostFile has not been explicit configured then use the host file from System.getProperty(user.home)/.ssh/known_hosts.";
    public static final Boolean CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DEFAULT = true;

    public CamelScpsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelScpsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SCPSINK_KAMELET_SERVER_NAME_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SCPSINK_KAMELET_SERVER_PORT_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_FILE_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_PRIVATE_KEY_PASSPHRASE_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_STRICT_HOST_KEY_CHECKING_DOC);
        conf.define(CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SCPSINK_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DOC);
        return conf;
    }
}