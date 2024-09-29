package com.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{


}
