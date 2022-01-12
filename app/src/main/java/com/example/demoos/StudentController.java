package com.example.demoos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/welcome")
	public List<Student> get() {

			return this.studentService.getStudents();
	}
	
	@PostMapping("/welcome")
	public String post(Student s) {
		this.studentService.postStudent(s);
		return "success";
	}
	
	@DeleteMapping("/welcome")
	public String delete(Integer id) {
		this.studentService.deleteStudent(id);
		return "success";
	}
}
