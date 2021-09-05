package com.tr.ext;

import com.tr.demo.entity.User;
import com.tr.ext.event.TestApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author trangle
 */
@ComponentScan("com.tr.ext")
@Configuration
public class ExtApplication {

    public static void main(String[] args) {
        listenEventApp();
    }

    public static void listenEventApp() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtApplication.class);
        applicationContext.publishEvent(new TestApplicationEvent("测试事件----"));
        applicationContext.publishEvent(new User());
    }

    @Bean
    public Executor executor() {
        return new ThreadPoolTaskExecutor();
    }
}
