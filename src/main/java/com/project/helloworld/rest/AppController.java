package com.project.helloworld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("helloworld")
    public String getHelloWorld(){
        return "Hello World!!!";
    }
}
