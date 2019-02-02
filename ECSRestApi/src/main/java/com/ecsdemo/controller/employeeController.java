package com.ecsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecsdemo.Pojo.employee;
import com.ecsdemo.Service.EmployeeService;


@RestController
@RequestMapping("employee")
@CrossOrigin
public class employeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping()
	public ResponseEntity<List<employee>> getEmployee(){
		List<employee> employeeList= employeeService.getEmployee();
		return ResponseEntity.ok(employeeList);
	}
}
