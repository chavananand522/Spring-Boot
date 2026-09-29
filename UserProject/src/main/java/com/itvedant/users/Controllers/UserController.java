package com.itvedant.users.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.itvedant.users.entities.User;
import com.itvedant.users.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/add")
	public User insert(@RequestBody User user) {
		return service.add(user);
	}

	@GetMapping("/get/{id}")
	public User get(@PathVariable Integer id) {
		return service.read(id);
	}

	@GetMapping("/getall")
	public List<User> getAll() {
		return service.readAll();
	}

	@GetMapping("/login")
	public boolean login(@RequestParam String name, @RequestParam String password) {
		return service.login(name, password);
	}
	
	@GetMapping("/signin/{name}/{password}")
	public String signIn(@PathVariable String name, @PathVariable String password) {
		boolean status =service.signIn(name,password);
		if(status) {
			return "Login Successful";
		}else {
			return "Invalid Cradentials";
		}
	}
	
	@GetMapping ("/getpages/{pn}/{s}")
	public Page<User> getPages(@PathVariable int pn,@PathVariable int s){
		return service.getUserByPages(pn, s);
	}

}
