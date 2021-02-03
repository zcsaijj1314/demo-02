package com.example.demo02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello security!";
    }

    @GetMapping("/db/hello")
    public String helloDba() {
        return "hello dba!";
    }

    @GetMapping("/admin/hello")
    public String helloAdmin() {
        return "hello admin!";
    }
}
