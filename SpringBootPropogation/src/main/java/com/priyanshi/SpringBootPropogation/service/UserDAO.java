package com.priyanshi.SpringBootPropogation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class UserDAO {


    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public void method2() {

        //Execute db queries
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionname = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println("***************************************");
        System.out.println("Propagation required is parentActive: " + isTransactionActive);
        System.out.println("current Transaction name " + currentTransactionname);
    }


}
