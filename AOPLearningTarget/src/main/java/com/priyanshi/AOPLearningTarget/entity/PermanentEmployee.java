package com.priyanshi.AOPLearningTarget.entity;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("permanentEmployee")
public class PermanentEmployee implements IEmployee{

    @Override
    public void fetchEmployeeMethod() {
        System.out.println("inside permanent fetch method");
    }




}
