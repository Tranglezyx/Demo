package com.tr.ext.listener;

import com.tr.ext.event.TestApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author trangle
 */
@Component
public class TestApplicationListener implements ApplicationListener<TestApplicationEvent> {

    @Override
    public void onApplicationEvent(TestApplicationEvent event) {
        System.out.println("监听事件 --- " + event.toString() + " -- 监听线程 : " + Thread.currentThread().getName());
    }
}
