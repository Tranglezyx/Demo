package com.tr.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/common/test")
    public void test(){
        System.out.println("test---");
    }
}
