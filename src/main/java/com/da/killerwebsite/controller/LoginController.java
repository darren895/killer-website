package com.da.killerwebsite.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    private String appId;

    private String secret;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam("code") String code){

    }
}
