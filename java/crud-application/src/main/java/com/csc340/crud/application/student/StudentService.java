package com.csc340.crud.application.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student getAllStudents() {
		return studentRepository.getById(1);
	}
	
}
