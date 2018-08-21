package com.capgemini.ForgotPasswordMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capgemini.ForgotPasswordMvc")
public class ForgotPasswordMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForgotPasswordMvcApplication.class, args);
	}
}
