package com.priyanshi.LearningDynamicallyInitializedBean.Entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Qualifier("offlineOrderObject")
//@Component

public class OfflineOrder implements  Order {


    public OfflineOrder(){
        System.out.println("Offline Order instance Initialized");
    }

    public void createOrder(){
        System.out.println("created offline Order");
    }
}
