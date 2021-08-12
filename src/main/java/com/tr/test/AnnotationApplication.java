package com.tr.test;

import com.tr.test.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author trangle
 */
@ComponentScan("com.tr.test")
@EnableAspectJAutoProxy
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationApplication.class);
        TestService demoService = applicationContext.getBean(TestService.class);
        System.out.println(demoService.getMsg("aspect"));
    }
}
