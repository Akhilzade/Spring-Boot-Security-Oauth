package com.test.controller;

import com.test.model.User;
import com.test.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserServices services;

	@PostMapping("/add")
	public User save(@RequestBody User user){

		return services.save(user);
	}

	@GetMapping("/get")
	public List<User> get(){

		return services.getAll();
	}

//	@RequestMapping("/user")
//	public Principal user(@RequestBody Principal principal){
//
//		return principal;
//	}

}
