package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	
	private StudentRepository  studentRepository ;

	
	
	public StudentService (StudentRepository  studentRepository) {
		
		this.studentRepository = studentRepository;
		
	}
	  
	
	public Student createStudent(Student studentReq) {
		
		Student studentResp= studentRepository.save(studentReq);
		return studentResp;
	}


	public Student getStudent(long id) {
	Optional<Student> studentResp	=studentRepository.findById(id);
	 
      if (studentResp.isPresent()) {
	
	           return studentResp.get();
          }
      
      return null;
	
	}


	public java.util.List<Student> getAllStudent() {
		
		List<Student> studentList=studentRepository.findAll();
		return studentList;
	}


	public Student updateStudent(long id,Student studentReq) {
		
		Optional<Student> existingStudent =studentRepository.findById(id);
		 if (existingStudent.isEmpty()) {
				
	           return null;
        }
		 
		 Student studentToSave= existingStudent.get();
		  studentToSave.setName(studentReq.getName());
		  studentToSave.setRoll(studentReq.getRoll());
		  studentToSave.setSubject(studentReq.getSubject());
		  studentToSave.setEmail(studentReq.getEmail());
		  studentToSave.setAge(studentReq.getAge());
		  return studentRepository.save( studentToSave);
		 
	}


	public Boolean deleteStudent(long id) {
	    Boolean isStudent= studentRepository.existsById(id);
	    
	    if (!isStudent) {
	    	
	    	return false;
	    }
	    
	    studentRepository.deleteById(id);
	    
	    return true;
	
	}


	

}
