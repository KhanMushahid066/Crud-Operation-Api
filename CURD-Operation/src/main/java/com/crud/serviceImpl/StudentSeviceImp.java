package com.crud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;

@Service
public class StudentSeviceImp implements StudentService{
	
	@Autowired
	private StudentRepository studentrespository;

	@Override 
	public Student createStd(Student sd) {
		
		return studentrespository.save(sd);
	}

}
