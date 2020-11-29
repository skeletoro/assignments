package com.nhlhockey.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
