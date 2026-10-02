package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/students")
@Controller
public class StudentController {
	private StudentService studentService; 
	
	public StudentController(StudentService studentService ) {
		this .studentService=studentService;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Student>createStudent(@RequestBody Student student) {
		
		
		Student createdStudent =studentService.createStudent(student) ;
	     
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(createdStudent);
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable long id){
		Student studentResp =studentService.getStudent(id);
		
        if (studentResp==null) {
			
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(studentResp);
		
	}
	
	@GetMapping("/getAll")
	
	public ResponseEntity<List<Student>> getAllStudent(){
	
		List<Student> studentList =studentService.getAllStudent();
	
	if (studentList.isEmpty()) {
		
		return ResponseEntity.notFound().build();
	}
	
		
		return ResponseEntity.ok(studentList);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable long id,@RequestBody Student studentReq){
		Student studentResp =studentService.updateStudent(id, studentReq);
		
		if (studentResp==null) {
			
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(studentResp);
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id){
		Boolean isDelete =studentService.deleteStudent(id);
		
		if (!isDelete ) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok("recored deleted");
	}
	

}
