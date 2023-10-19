package com.csc340.crud.application.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> getStudent(int id) {
		return studentRepository.findById(id);
	}
	
	public Student addStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
}
