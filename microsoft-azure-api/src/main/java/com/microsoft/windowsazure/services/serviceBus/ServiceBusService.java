/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.windowsazure.services.serviceBus;

import com.microsoft.windowsazure.services.core.Configuration;

/**
 * 
 * Access service bus functionality.
 * 
 */
public class ServiceBusService {

    private ServiceBusService() {
        // class is not instantiated
    }

    /**
     * Creates an instance of the <code>ServiceBusContract</code> API.
     * 
     */
    public static ServiceBusContract create() {
        return Configuration.getInstance().create(ServiceBusContract.class);
    }

    /**
     * Creates an instance of the <code>ServiceBusContract</code> API using the specified configuration.
     * 
     * @param config
     *            A <code>Configuration</code> object that represents the configuration for the service bus service.
     * 
     */
    public static ServiceBusContract create(Configuration config) {
        return config.create(ServiceBusContract.class);
    }

    /**
     * Creates an instance of the <code>ServiceBusContract</code> API.
     * 
     */
    public static ServiceBusContract create(String profile) {
        return Configuration.getInstance().create(profile, ServiceBusContract.class);
    }

    /**
     * Creates an instance of the <code>ServiceBusContract</code> API using the specified configuration.
     * 
     * @param config
     *            A <code>Configuration</code> object that represents the configuration for the service bus service.
     * 
     */
    public static ServiceBusContract create(String profile, Configuration config) {
        return config.create(profile, ServiceBusContract.class);
    }
}
