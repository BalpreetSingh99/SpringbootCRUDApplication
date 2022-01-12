package com.example.demoos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired 
	private StudentRepository studentRepository;
	public List<Student> getStudents(){
		List<Student> list = new ArrayList<>();
		for(Student student: this.studentRepository.findAll()) {
		    list.add(student);	
		}
		return list;
	}
	public void postStudent(Student s) {
		Student s2=new Student(s.getId(),s.getName(),s.getEmail());
		this.studentRepository.save(s2);
	}
	public void deleteStudent(Integer id) {
		this.studentRepository.deleteById(id);
	}
}
