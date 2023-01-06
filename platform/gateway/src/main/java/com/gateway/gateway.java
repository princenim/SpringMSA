package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author hazel
 */


@SpringBootApplication
@EnableEurekaClient
public class gateway {
    public static void main(String[] args) {
        SpringApplication.run(gateway.class, args);

    }
}