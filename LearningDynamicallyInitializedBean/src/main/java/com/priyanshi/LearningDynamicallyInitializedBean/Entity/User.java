package com.priyanshi.LearningDynamicallyInitializedBean.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class User {

  /*  @Qualifier("onlineOrderObject")
    @Autowired
    Order onlineOrderObj;


    @Qualifier("offlineOrderObject")
    @Autowired
    Order offlineOrderObj;*/

    Order order;

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(){
        order.createOrder();
        return ResponseEntity.ok("");
    }


    /* this is to change at client Value not by configuration by RequestParam

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(@RequestParam boolean isOnlineOrder){
        if(isOnlineOrder){
            onlineOrderObj.createOrder();
        }
        else{
            offlineOrderObj.createOrder();
        }
        return ResponseEntity.ok("");
    }
*/





}
