package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hazel
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaserver {
    public static void main(String[] args) {
        SpringApplication.run(eurekaserver.class, args);
    }
}