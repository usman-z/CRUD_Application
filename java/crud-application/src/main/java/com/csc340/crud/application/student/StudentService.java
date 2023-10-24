package com.csc340.crud.application.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public Student getStudent(int id) {
		return studentRepository.getReferenceById(id);
	}
	
	public void saveStudent(Student newStudent) {
		studentRepository.save(newStudent);
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
}
