package com.priyanshi.LearningDynamicallyInitializedBean.Entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Qualifier("onlineOrderObject")
@Component
public class OnlineOrder implements Order {


    public OnlineOrder(){
        System.out.println("Online Order Instance Initialized");
    }

    public void createOrder() {
        System.out.println("created Online Order");
    }
}
