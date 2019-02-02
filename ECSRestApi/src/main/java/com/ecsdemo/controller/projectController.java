package com.ecsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecsdemo.Pojo.project;
import com.ecsdemo.Service.ProjectService;
@RestController
@RequestMapping("project")
@CrossOrigin
public class projectController {
	
	@Autowired
	ProjectService projectService;
	@GetMapping()
	public ResponseEntity<List<project>> getEmployee(){
		List<project> prjectList= projectService.getProject();
		return ResponseEntity.ok(prjectList);
	}
}
