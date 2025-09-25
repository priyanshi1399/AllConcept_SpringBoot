package com.priyanshi.CustomInterceptorsAfterController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CustomInterceptorsAfterControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomInterceptorsAfterControllerApplication.class, args);
	}

}
