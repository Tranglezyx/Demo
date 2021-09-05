package com.tr.ext.listener;

import com.tr.demo.entity.User;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author trangle
 */
@Component
public class TestAnnotationListener {

    @EventListener
    public void listen(User user){
        System.out.println(user.toString());
    }
}
