package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudent(String name);

}
