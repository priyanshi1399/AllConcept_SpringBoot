package com.priyanshi.AOPLearning.entity;

import com.priyanshi.AOPLearning.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Employee {

    @Autowired
    EmployeeUtil employeeUtil;

  /*  @GetMapping(path="/fetchEmployee")
    public String fetchEmployee(){
        employeeUtil.employeeHelperMethod();
        return "item fetched";
    }*/

    @GetMapping(path="/fetchEmployee2")
    public String fetchEmployee(){
        return "item fetched";
    }
}
