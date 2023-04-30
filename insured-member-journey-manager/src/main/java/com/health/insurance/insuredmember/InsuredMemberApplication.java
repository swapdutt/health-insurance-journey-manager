package com.health.insurance.insuredmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InsuredMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuredMemberApplication.class, args);
    }

}
