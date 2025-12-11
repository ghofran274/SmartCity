package com.cities.smartCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cities.smartCity.repository.CitoyenRepository;
import com.cities.smartCity.entity.Citoyen;

@SpringBootApplication
public class SmartCityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCityApplication.class, args);
	}
}

