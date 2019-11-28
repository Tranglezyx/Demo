package com.tr.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@RestController
public class CommonController {

    @GetMapping("/common/test")
    public void test(){
        System.out.println("test---");
    }

    @PostMapping("/common/exception")
    public void exception() throws ValidationException {
        throw new ValidationException("exception---");
    }
}
