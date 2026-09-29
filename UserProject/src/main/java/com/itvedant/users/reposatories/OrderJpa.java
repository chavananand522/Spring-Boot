package com.itvedant.users.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itvedant.users.entities.Orders;

@Repository
public interface OrderJpa extends JpaRepository<Orders, Integer> {
	
}
