package com.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudapp.entity.User;
import com.crudapp.repository.UserRepo;
@Service
public class userService {
	@Autowired
	UserRepo exit;

	public List<User> getuser() {
		return exit.findAll();
	}

	public User getUser(@PathVariable int id) {
		return exit.findById(id).orElse(null);
	}

	public User getadd(@RequestBody User obj) {
		return exit.save(obj);
	}

	public User getUpdate(@PathVariable int id, @RequestBody User obj) {
		User newuser = exit.findById(id).orElse(null);
		newuser.setName(obj.getName());
		return exit.save(newuser);
	}

	public void getdelete(@PathVariable int id) {
		User obj = exit.findById(id).orElse(null);
		exit.delete(obj);

	}
}
