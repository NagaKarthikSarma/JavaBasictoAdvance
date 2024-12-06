package com.org.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QArgonEurekhaServiceRegistry1Application {

	public static void main(String[] args) {
		SpringApplication.run(QArgonEurekhaServiceRegistry1Application.class, args);
	}

}
