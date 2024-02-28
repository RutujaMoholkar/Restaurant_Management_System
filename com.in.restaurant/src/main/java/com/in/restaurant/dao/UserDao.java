package com.in.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.in.restaurant.model.User;

//here we have to pass model name and data type of primary key
public interface UserDao extends JpaRepository<User, Integer> {

    // we can implement this method in model
    User findByEmailId(@Param("email") String email);

}
