package com.patika.kitapyurdumregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KitapyurdumRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KitapyurdumRegistryApplication.class, args);
    }

}
