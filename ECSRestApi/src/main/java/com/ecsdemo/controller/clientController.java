package com.ecsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecsdemo.Pojo.client;
import com.ecsdemo.Service.ClientService;

@RestController
@RequestMapping("client")
@CrossOrigin
public class clientController {
	@Autowired
	ClientService clientService;
	@GetMapping()
	public ResponseEntity<List<client>> getEmployee(){
		List<client> clientList= clientService.getClient();
		return ResponseEntity.ok(clientList);
	}
}
