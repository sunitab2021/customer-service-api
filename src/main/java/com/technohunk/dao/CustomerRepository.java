package com.technohunk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technohunk.dao.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
