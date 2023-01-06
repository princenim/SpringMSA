package com.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hazel
 */


@RestController
@RefreshScope
public class CheckController {
    //설정파일 repository에서 가져올

    @Value("${hazel.profile.comment}")
    private String ingnoh;

    @GetMapping("")
    public String hello() {
        return ingnoh;
    }
}
