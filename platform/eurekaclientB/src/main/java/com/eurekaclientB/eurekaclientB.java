package com.eurekaclientB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hazel
 */

@SpringBootApplication
@EnableEurekaClient
public class eurekaclientB {
    public static void main(String[] args) {
        SpringApplication.run(eurekaclientB.class, args);
    }
}