/*	This application uses the Jackson JSON library to automatically
 marshal instances of type Greeting into JSON.
 Jackson is included by default by the web starter.
 */
package com.example.rest.service.resource;

public class Greeting {
        private final long id;
        private final String content;

        public Greeting(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }
        public String getContent() {
            return content;
        }
    }
