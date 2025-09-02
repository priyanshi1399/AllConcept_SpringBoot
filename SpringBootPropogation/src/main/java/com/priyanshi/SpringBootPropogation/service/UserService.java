package com.priyanshi.SpringBootPropogation.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class UserService {
    @Autowired
    UserDAO userDAOObj;

    @Transactional
    public void method1(){
        System.out.println("is transaction active:"+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("some initial DB operation");
        userDAOObj.method2();
        System.out.println("some final DB operation");
    }

    public void updateUserFromNonTransactionMethod(){
        System.out.println("is transaction active:"+ TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction name : "+ TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("some initial DB operation");

        System.out.println("some final DB operation");
    }
}
