package com.vineet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vineet.Model.Student;
import com.vineet.service.Studentservice;

@RestController
public class StudentController {

	@Autowired
	private Studentservice studentservice ;
	

	@PostMapping("/student")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){
		
		Student std = studentservice.saveStudent(student);
		
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
		
		
	}
}
