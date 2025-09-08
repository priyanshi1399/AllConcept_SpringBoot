package com.priyanshi.AsyncExceptionHandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncExceptionHandlingApplication.class, args);
	}

}
