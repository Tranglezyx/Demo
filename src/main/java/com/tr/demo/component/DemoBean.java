package com.tr.demo.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author trangle
 */
public class DemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    public void initMethod(){
        System.out.println("Bean初始化方法 ====== ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("设置Bean工厂 ======= ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("设置Bean Name ====== ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("参数设置完毕处理 ======== ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("上下文设置 ======== ");
    }
}
