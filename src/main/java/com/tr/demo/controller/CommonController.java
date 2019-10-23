package com.tr.demo.controller;

import com.tr.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 公共测试Controller
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @PostMapping("/event-message")
    public boolean testMessagePublishEvent(@RequestBody String message) {
        eventPublisher.publishEvent(message);
        return true;
    }

    @PostMapping("/event-user")
    public boolean testUserPublishEvent(@RequestBody User user) {
        eventPublisher.publishEvent(user);
        return true;
    }

    @PostMapping("/event-map")
    public boolean testMapPublishEvent(@RequestBody Map<String, String> map) {
        eventPublisher.publishEvent(map);
        return true;
    }
}
