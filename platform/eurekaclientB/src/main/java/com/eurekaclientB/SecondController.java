package com.eurekaclientB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hazel
 */

@RestController
@RequestMapping("second-service")
public class SecondController {

    @RequestMapping("")
    public String check(){
        return "hello";

    }
}
