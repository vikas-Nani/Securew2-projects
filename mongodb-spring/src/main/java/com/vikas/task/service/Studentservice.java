package com.vikas.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.task.model.Student;
import com.vikas.task.repository.StudentInterface;

@Service
public class Studentservice {
	@Autowired
	StudentInterface sturepo;

	public List<Student> getall() {
		
		return sturepo.findAll();
	}

	public void addstudent(Student stu) {
		sturepo.insert(stu);
		
	}

	public Student getbyid(String id) {
		return sturepo.findById(id).get();

	}
	public void updatestudent(Student stu) {
		sturepo.save(stu);
		
	}
	

}
