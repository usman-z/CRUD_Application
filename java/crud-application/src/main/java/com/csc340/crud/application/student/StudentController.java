package com.csc340.crud.application.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	
	@GetMapping("/all")
	public String getStudents(Model model) {
        model.addAttribute("studentList",
        		studentService.getStudents());
        return "student/list-students";
	}
	
    @GetMapping("/id={studentId}")
    public String getStudent(@PathVariable int studentId, Model model) {
        model.addAttribute("student",
        		studentService.getStudent(studentId));
        return "student/student-detail";
    }
	
    @PostMapping("/create")
    public String createStudent(Student student) {
    	studentService.saveStudent(student);
        return "redirect:/student/all";
    }
	
    @PostMapping("/update")
    public String updateStudent(Student student) {
    	studentService.saveStudent(student);
        return "redirect:/student/all";
    }
	
	
    @GetMapping("/delete/id={studentId}")
    public String deleteStudent(@PathVariable int studentId, Model model) {
    	studentService.deleteStudent(studentId);
        return "redirect:/student/all";
    }
    
    @GetMapping("/new-student")
    public String newStudentForm(Model model) {
        return "student/new-student";
    }
    
    @GetMapping("/update/id={studentId}")
    public String updateStudentForm(@PathVariable int studentId, Model model) {
        model.addAttribute("student",
        		studentService.getStudent(studentId));
        return "student/update-student";
    }
}
