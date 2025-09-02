package com.priyanshi.SpringBootLearningTransactional.entity;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class UserProgrammaticApproach2 {

    TransactionTemplate transactiontemplate;

    public UserProgrammaticApproach2(TransactionTemplate transactiontemplate){
        this.transactiontemplate=transactiontemplate;
    }

    public void updateUserProgrammatic(){
        TransactionCallback<TransactionStatus>  dbOperationTask=(TransactionStatus status)->{
            System.out.println("Insert Query ran");
            System.out.println("Update Query ran");
            return status;
        };
        TransactionStatus status=transactiontemplate.execute(dbOperationTask);
    }
}
