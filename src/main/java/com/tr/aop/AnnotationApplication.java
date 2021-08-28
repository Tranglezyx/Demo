package com.tr.aop;

import com.tr.aop.aspect.TestAspect;
import com.tr.aop.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author trangle
 */
@ComponentScan("com.tr.aop")
@EnableAspectJAutoProxy
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationApplication.class);
        TestService demoService = applicationContext.getBean(TestService.class);
        TestAspect testAspect = applicationContext.getBean(TestAspect.class);
        System.out.println(demoService.getMsg("aspect"));
    }
}
