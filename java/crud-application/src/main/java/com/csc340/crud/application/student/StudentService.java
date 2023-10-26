package com.csc340.crud.application.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	/**
	 * Get all Students
	 * @return a List of Students
	 */
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	/**
	 * Get a Student by their Student ID
	 * @param id, Student ID
	 * @return Student that associates with the given Student ID
	 */
	public Student getStudent(int id) {
		return studentRepository.getReferenceById(id);
	}
	
	/**
	 * Save a Student entry
	 * @param newStudent, a Student
	 */
	public void saveStudent(Student newStudent) {
		studentRepository.save(newStudent);
	}
	
	/**
	 * Delete a Student entry
	 * @param id, Student ID
	 */
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
}
