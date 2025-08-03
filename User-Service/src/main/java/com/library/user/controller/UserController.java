package com.library.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.user.dto.UserDTO;
import com.library.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserController {
	
	@Autowired
	private final UserService user;
	
	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody UserDTO UserDTO){
		return new ResponseEntity<>(user.create(UserDTO),HttpStatus.CREATED);
	}
}
