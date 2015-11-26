/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package demo.hw.client;


import org.apache.cxf.common.i18n.Exception;
import org.apache.hello_world_soap_http.Greeter;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public final class SpringClient {

    private SpringClient() {
    }

    public static void main(String args[]) throws Exception {
        // START SNIPPET: client
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"});

        Greeter port = (Greeter) context.getBean("client");

        String resp;


        for (int i = 0; i < 11; i++) {
            try {
                System.out.println("Invoking greetMe... " + i);
                resp = port.greetMe(System.getProperty("user.name"));
                System.out.println("This should never get reached, but does after com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext#errorsCounter is exceeded");
                System.out.println("Server responded with: " + resp);
            } catch (RuntimeException e) {
                System.out.println("should always happen, api is incompatible");
            }
        }

        System.exit(0);
        // END SNIPPET: client
    }
}
