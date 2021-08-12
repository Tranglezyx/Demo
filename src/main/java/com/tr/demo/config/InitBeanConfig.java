package com.tr.demo.config;

import com.tr.demo.component.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author trangle
 */
@Configuration
public class InitBeanConfig {

    @Bean(initMethod = "initMethod")
    public DemoBean demoBean(){
        return new DemoBean();
    }

}
