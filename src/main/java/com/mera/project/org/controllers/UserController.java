package com.mera.project.org.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequestMapping("/v1/api")
@RestController
public class UserController {

    @GetMapping("/health")
    public String healthCheck() {
        System.out.println("request received");
        return "This is response from server";
    }

    @GetMapping("/health2")
    public List<String> healthCheck2() {
        System.out.println("request received");
        return List.of("abc", "def", "xyz");
    }
}
