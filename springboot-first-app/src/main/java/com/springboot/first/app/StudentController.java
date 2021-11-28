package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// Path: http://localhost:3000/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ashiqul Islam", "Shajal");
	}

	// Path: http://localhost:3000/students
	@GetMapping("students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Muktaadir", "Soyeb"));
		students.add(new Student("Md.Ashiqul Islam", "Shajal"));
		students.add(new Student("Bhabatush", "Debnath"));
		students.add(new Student("Dada", "Dadi"));

		return students;

	}

	// Path: http://localhost:3000/student/{fistName}/{lastName}
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String pFirstName,
			@PathVariable("lastName") String pLastName) {
		return new Student(pFirstName, pLastName);
	}

	// REST API to handle query parameter
	// Path: http://localhost:3000/student/query?fistName=lastName
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "fistName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}

}
