package com.in.restaurant.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<String> signUp(Map<String, String> requestMap);

}
