package com.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crudapp.entity.User;
import com.crudapp.repository.UserRepo;

@RestController
@RequestMapping("/")
public class UserController {
	
//	@GetMapping("/dolly")
//	public String doly() {
//		return "hello Spring Boot!";
//	}
//	@GetMapping("/adm/{id}")
//	public String getdolly(@PathVariable String id) {
//		return "hello,"+id;
//	}
//	
	@Autowired
	UserRepo exit;
	
	@GetMapping("/users")
	public List<User>getuser(){
		return exit.findAll();
	}
	@GetMapping("/users/{id}")
		public User getUser(@PathVariable int id) {
		return exit.findById(id).orElse(null);
	}
	@PostMapping("/users")
	public User getadd(@RequestBody User obj ) {
		return exit.save(obj);
	}
	@PutMapping("/users/{id}")
	public User getUpdate(@PathVariable int id, @RequestBody User obj ) {
	User newuser = exit.findById(id).orElse(null);
	newuser.setName(obj.getName());
	return exit.save(newuser);
	}
	@DeleteMapping("/users/{id}")
	public void getdelete(@PathVariable int id) {
		User obj = exit.findById(id).orElse(null);
		 exit.delete(obj);
		
	}
}
