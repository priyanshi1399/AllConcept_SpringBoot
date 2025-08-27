package com.priyanshi.AOPLearning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectWithinAnnotation {

    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeMethod(){

        System.out.println("inside beforeMethod  and this is within annotation example");
    }
}
