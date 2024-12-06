package com.org.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class OPhosporousQuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OPhosporousQuestionServiceApplication.class, args);
	}

}
