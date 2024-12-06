package com.org.karthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QArgonEurekhaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QArgonEurekhaServiceRegistryApplication.class, args);
	}

}
