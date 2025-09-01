package com.priyanshi.AOPLearningWroking.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(*com.priyanshi.AOPLearningWorking.EmployeeUtil.*())")
    public void beforeMethod() throws Throwable{
        System.out.println("inside before method aspect");
    }

    @After("execution(*com.priyanshi.AOPLearningWroking.EmployeeUtil.*())")
    public void afterMethod() throws Throwable{
        System.out.println("inside after method aspect");
    }

}
