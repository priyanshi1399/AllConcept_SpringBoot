package com.priyanshi.AOPLearning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspectAnnotationExample {

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeMethod(){
        System.out.println("inside method aspect and this is example of @annotation");
    }

}
