package com.csc340.crud.application.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	
	@GetMapping("/get")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@GetMapping("/get/{studentId}")
	public Optional<Student> getStudentById(@PathVariable int studentId) {
		return studentService.getStudent(studentId);
	}
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student newStudent) {
		return studentService.addStudent(newStudent);
	}
	
	@PostMapping("/update/{studentId}")
	public void updateStudent(@RequestBody Student student, @PathVariable int studentId) {
		studentService.deleteStudent(studentId);
		studentService.updateStudent(student);
	}
	
	@GetMapping("/delete/{studentId}")
	public void deleteStudentById(@PathVariable int studentId) {
		studentService.deleteStudent(studentId);
	}

}
