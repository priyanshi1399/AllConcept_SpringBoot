package com.priyanshi.SpringBootLearningTransactional.entity;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

@Component
public class UserProgrammaticApproach1 {

    PlatformTransactionManager userTransactionManager;

    UserProgrammaticApproach1(){
        this.userTransactionManager=userTransactionManager;
    }

    public void updateUserProgrammatic(){
        TransactionStatus status=userTransactionManager.getTransaction(null);

        try{
            //some initial set of db operation
            System.out.println("Insert query run1");
            System.out.println("Update Query run1");
            userTransactionManager.commit(status);
        }
        catch(Exception e){
            userTransactionManager.rollback(status);
        }
    }
}
