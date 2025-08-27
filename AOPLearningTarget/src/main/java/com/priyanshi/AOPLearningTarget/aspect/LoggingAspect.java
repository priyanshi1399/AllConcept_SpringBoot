package com.priyanshi.AOPLearningTarget.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {

     /*   //this is for target class level
    @Before("target(com.priyanshi.AOPLearningTarget.service.EmployeeUtil)")
    public void beforeMethod(){
        System.out.println("inside beforeMethod aspect");
    }*/

    //this is for interface level
    @Before("target(com.priyanshi.AOPLearningTarget.service.IEmployee)")
    public void beforeMethod() {
        System.out.println("inside beforeMethod aspect");
    }


    @Around("execution(*com.priyanshi.AOPLearningTarget.service.EmployeeUtil.*())")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("inside before Method Aspect Aroundone" +joinPoint.getSignature());
        Object result=joinPoint.proceed();
        System.out.println("inside after method" +joinPoint.getSignature());
        return result;
    }
}


