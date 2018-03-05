package com.example.demo.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/resonate")
public class StudentController {
	
	@Autowired
	StudentService service;

	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student) {
		
		return ResponseEntity.ok(service.saveStudent(student));
		
	}
	
	@GetMapping("/student/{name}")
	public ResponseEntity<Student> getStudent(@Valid @PathVariable (value = "name") String name) {
		Student student = service.getStudent(name);
		return ResponseEntity.ok(student);
		
	}
}
