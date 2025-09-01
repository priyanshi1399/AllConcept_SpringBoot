package com.priyanshi.AOPLearningWroking.controller;


import com.priyanshi.AOPLearningWroking.service.EmployeeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class EmployeeController {

    @Autowired
    EmployeeUtil employeeutil;

    @GetMapping(path="/fetchEmployee")
    public String fetchEmployee(){
        employeeutil.EmployeeHelperMethod();
        return "item fetched";
    }
}
