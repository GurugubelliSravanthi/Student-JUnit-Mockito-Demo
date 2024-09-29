package com.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.entity.User;
import com.crudapp.service.userService;

@RestController
@RequestMapping("/")
public class controller2 {

	@Autowired
	private userService us;

	@GetMapping("/user2")
	public List<User> getusers() {
		return us.getuser();
	}

}
