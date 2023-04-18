package com.health.insurance.serviceregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistrationManagerApplication.class, args);
    }

}
