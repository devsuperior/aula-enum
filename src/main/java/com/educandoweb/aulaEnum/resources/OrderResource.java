package com.educandoweb.aulaEnum.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.aulaEnum.entities.Order;
import com.educandoweb.aulaEnum.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
}
