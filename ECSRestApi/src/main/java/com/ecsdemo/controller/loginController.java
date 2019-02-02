package com.ecsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecsdemo.Pojo.login;
import com.ecsdemo.Service.LoginService;


@RestController
@CrossOrigin
@RequestMapping("/ecsDemo")
public class loginController {
	
			@Autowired
			LoginService service;
			
			@PostMapping("/login")
			public ResponseEntity<login> Login(@RequestBody login login) {
				boolean isValid= service.login(login);
				if(isValid)
				{
					return ResponseEntity.ok(login);
				}
				else {
					 return new ResponseEntity<login>(HttpStatus.BAD_REQUEST);
				}
			}
	}
