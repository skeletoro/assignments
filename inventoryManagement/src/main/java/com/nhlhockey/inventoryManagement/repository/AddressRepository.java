package com.nhlhockey.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.nhlhockey.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long>  {

}
