package com.priyanshi.CustomInterceptorsAfterController;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyCustomInterceptor {


    @Around("@annotation(com.priyanshi.CustomInterceptorsAfterController.MyCustomAnnotation)")
    public void invoke(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("do something before actual method");

        Method method=((MethodSignature)joinPoint.getSignature()).getMethod();
        if(method.isAnnotationPresent(MyCustomAnnotation.class)){
            MyCustomAnnotation annotation=method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("name from annotation: "+annotation.name());
        }

        joinPoint.proceed();
        System.out.println("do something after actual method");
    }
}
