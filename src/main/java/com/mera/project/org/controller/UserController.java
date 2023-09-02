package com.mera.project.org.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.mera.project.org.model.User;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api")
public class UserController {

    @GetMapping(value = "/test")
    public ResponseEntity<User> test() {
        return ResponseEntity.ok(new User("Justin", "test", 1));
    }

    @GetMapping(value = "/test2")
    public ResponseEntity<User> test2() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.exchange("https://dummyjson.com/products/1", HttpMethod.GET, null, Object.class);
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
        System.out.println(response.getStatusCode());
        return ResponseEntity.ok(new User("Justin", "test", 1));
    }
}
