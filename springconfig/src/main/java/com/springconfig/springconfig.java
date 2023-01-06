package com.springconfig;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author hazel
 */


@SpringBootApplication
@EnableConfigServer
public class springconfig {
    public static void main(String[] args) {
        SpringApplication.run(springconfig.class, args);
    }
}