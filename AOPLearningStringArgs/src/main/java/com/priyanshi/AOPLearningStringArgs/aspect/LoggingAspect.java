package com.priyanshi.AOPLearningStringArgs.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("args(String,int)")
    public void beforeMethod(){
        System.out.println("inside beforeAspectMethod");
    }
}
