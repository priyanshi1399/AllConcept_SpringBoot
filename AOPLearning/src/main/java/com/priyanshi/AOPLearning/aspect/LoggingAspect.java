package com.priyanshi.AOPLearning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    /*
    @Before("execution(public String com.priyanshi.AOPLearning.entity.Employee.fetchEmployee())")
    public void beforeMethod(){
        System.out.println("inside beforeMethodAspect");
    }
    */

    //wildcard
   /* @Before("execution(* com.priyanshi.AOPLearning.entity.Employee.fetchEmployee())")
    public void beforeMethod(){
        System.out.println("inside beforeMethodAspect");
    }*/

    // its for methood for 0 or more item
    @Before("execution( String com.priyanshi.AOPLearning.entity.Employee.fetchEmployee(..))")
    public void beforeMethod(){
        System.out.println("inside beforeMethodAspect");
    }



}
