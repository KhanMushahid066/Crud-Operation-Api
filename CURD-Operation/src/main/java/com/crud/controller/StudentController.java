package com.crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("api/v1")
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@PostMapping("/CreateStudent")
	public Student createStd(@RequestBody Student sd) {
		return studentservice.createStd(sd);
		
	}
 
}
