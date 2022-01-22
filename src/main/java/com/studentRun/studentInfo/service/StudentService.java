package com.studentRun.studentInfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentRun.studentInfo.repository.StudentRepo;
import com.studentRun.studentInfo.student.Student;


@Service
public class StudentService 
{
	@Autowired
	private StudentRepo repo;
	
	public void addStu(Student s)
	{
		repo.save(s);
	}
	
	public List<Student> allStu()
	{
		return repo.findAll();
	}
	
	public Student editById(int id)
	{
		Optional<Student> s = repo.findById(id);
		if(s.isPresent())
		{
			return s.get();
		}
		return null;
	}
	
	public void deleteStu(int id)
	{
		repo.deleteById(id);
	}
}
