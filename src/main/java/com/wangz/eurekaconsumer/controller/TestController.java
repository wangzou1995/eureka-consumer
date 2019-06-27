package com.wangz.eurekaconsumer.controller;

import com.wangz.eurekaconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/test/{id}")
    public String get(@PathVariable(name = "id") int id){
        return testService.get(id);
    }
}
