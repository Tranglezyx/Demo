package com.tr.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author trangle
 */
@Aspect
public class TestAspect {

    @Pointcut("execution(* com.tr.aop.service.*.* (..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before ===== ");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after ===== ");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning ===== ");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing ===== ");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around ===== ");
        return joinPoint.proceed(joinPoint.getArgs());
    }
}
