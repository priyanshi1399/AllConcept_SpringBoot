package com.priyanshi.AOPLearning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectWithin {

    @Before("within(com.priyanshi.AOPLearning.entity.Employee)")
    public void beforeExecution(){

        System.out.println("inside before within");
    }

}
