package com.priyanshi.AOPLearning.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Employee {

    @GetMapping(path="/fetchEmployee")
    public String fetchEmployee(){
        return "item fetched";
    }
}
