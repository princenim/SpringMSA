package com.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hazel
 */

//@Configuration
//public class GatewayConfig {
//    //2. 자바 코드로 라우팅 하기
//
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
//
//        //해당 id(서비스)로 들어오고, 해당 path의 패턴을 따를때 저 uri 보낸다.
//        return builder.routes().route("first-service", r-> r.path("/first-service/**").uri("http://localhost:8762")).
//                route("second-service", r-> r.path("/second-service/**").uri("http://localhost:8763")).build();
//    }
//}
