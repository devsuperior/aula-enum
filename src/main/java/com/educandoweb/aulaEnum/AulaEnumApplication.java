package com.educandoweb.aulaEnum;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.educandoweb.aulaEnum.entities.Order;
import com.educandoweb.aulaEnum.repositories.OrderRepository;

@SpringBootApplication
public class AulaEnumApplication implements CommandLineRunner {
	
	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AulaEnumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order o1 = new Order(null, Instant.parse("2021-12-20T21:04:00Z"));
		Order o2 = new Order(null, Instant.parse("2022-01-23T22:05:07Z"));
		Order o3 = new Order(null, Instant.parse("2022-01-24T12:15:07Z"));
		
		repository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
}
