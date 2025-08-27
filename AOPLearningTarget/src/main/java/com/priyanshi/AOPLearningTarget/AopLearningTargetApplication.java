package com.priyanshi.AOPLearningTarget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopLearningTargetApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopLearningTargetApplication.class, args);
	}

}
