package com.eurekaclientA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hazel
 */

@SpringBootApplication
@EnableEurekaClient
public class eurekaclientA {
    public static void main(String[] args) {
        SpringApplication.run(eurekaclientA.class, args);
        //push test 2
    }
}