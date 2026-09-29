package com.itvedant.users.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.users.entities.Orders;
import com.itvedant.users.services.OrderService;

@RestController
@RequestMapping ("/orders")
public class OrderController {

	@Autowired
	OrderService service;
	
	
	@PostMapping("/add")
	public Orders post(@RequestBody Orders order) {
		return service.add(order);
	}
	
	@GetMapping("/get/{id}")
	public Orders add(@PathVariable Integer id) {
		return service.get(id);
	}
	
}
