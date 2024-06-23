package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoService;

@RestController
class HelloController {

    @Autowired
    private DemoService service;

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/hello")
    String hello() {
        var msg = service.hello();
        return msg;
    }

}