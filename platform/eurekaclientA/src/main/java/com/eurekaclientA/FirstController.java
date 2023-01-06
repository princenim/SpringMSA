package com.eurekaclientA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hazel
 */


@RestController
@RequestMapping("first-service")
public class FirstController {

    @RequestMapping("")
    public String check() {
        return "client A";
    }

    @GetMapping("/test")
    public String loadBalancerTest(HttpServletRequest request) {
        return String.format("fisrt service on %s", request.getServerPort());
    }

}
