package com.org.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TScandiumHospitalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TScandiumHospitalServiceApplication.class, args);
	}

}
