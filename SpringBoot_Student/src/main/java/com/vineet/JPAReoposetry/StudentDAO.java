package com.vineet.JPAReoposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vineet.Model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

	
}
