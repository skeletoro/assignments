package com.nhlhockey.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>  {

}
