package com.priyanshi.AOPLearningTarget.aspect;

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
    public void beforeMethod(){
        System.out.println("inside beforeMethod aspect");
    }
}
