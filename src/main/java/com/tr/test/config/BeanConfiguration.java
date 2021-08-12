package com.tr.test.config;

import com.tr.test.aspect.TestAspect;
import com.tr.test.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author trangle
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public TestAspect testAspect(){
        return new TestAspect();
    }

    @Bean
    public TestService demoService(){
        return new TestService();
    }
}
