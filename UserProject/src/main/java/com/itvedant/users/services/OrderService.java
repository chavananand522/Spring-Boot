package com.itvedant.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itvedant.users.entities.Orders;
import com.itvedant.users.reposatories.OrderJpa;

@Service
public class OrderService {

	@Autowired
	 OrderJpa jpa;

	public Orders add(Orders order) {
		return jpa.save(order);
	}
	
	public Orders get(Integer id) {
		return jpa.findById(id).orElse(null);
	}
}
