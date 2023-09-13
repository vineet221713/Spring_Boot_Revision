package com.vineet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vineet.JPAReoposetry.StudentDAO;
import com.vineet.Model.Student;

@Service
public class StudentServiceImpl implements Studentservice{
 
	@Autowired
	StudentDAO dao;
	
	@Override
	public Student saveStudent(Student student) {
		Student saveStd= dao.save(student);
		return saveStd ;
	}

}
