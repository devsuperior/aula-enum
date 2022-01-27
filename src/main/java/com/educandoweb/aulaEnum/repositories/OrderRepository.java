package com.educandoweb.aulaEnum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.aulaEnum.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
