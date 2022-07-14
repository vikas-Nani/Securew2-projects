package com.vikas.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.task.model.Student;
import com.vikas.task.service.Studentservice;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	Studentservice stuser;
	@GetMapping("/")
	public List<Student> getAll(){
		return stuser.getall();
	}
	@PostMapping("/save")
	public void addstu(@RequestBody Student stu) {
		stuser.addstudent(stu);
	}
}
