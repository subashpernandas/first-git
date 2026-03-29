package com.example.first_git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController  {

    @GetMapping("/get")
    public String getCall() {
        return "GET";
    }
}
