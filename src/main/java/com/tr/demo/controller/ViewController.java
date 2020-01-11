package com.tr.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ViewController {

    @RequestMapping("/view")
    public String view(Map<String, Object> paramMap) {
        paramMap.put("name", "zhangSan");
        paramMap.put("age", 28);
        return "hello";
    }
}
