package com.capgemini.ForgotPassword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capgemini.ForgotPassword")
public class ForgotPasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForgotPasswordApplication.class, args);
	}
}
