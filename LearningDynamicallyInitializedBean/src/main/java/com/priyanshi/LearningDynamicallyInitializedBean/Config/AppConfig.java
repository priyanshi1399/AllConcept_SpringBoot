package com.priyanshi.LearningDynamicallyInitializedBean.Config;

import com.priyanshi.LearningDynamicallyInitializedBean.Entity.OfflineOrder;
import com.priyanshi.LearningDynamicallyInitializedBean.Entity.OnlineOrder;
import com.priyanshi.LearningDynamicallyInitializedBean.Entity.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Order createOrder(@Value("${isOnlineOrder}") boolean isOnlineOrder ){
        if(isOnlineOrder){
            return new OnlineOrder();
        }
        else{
            return new OfflineOrder();
        }

    }
}
