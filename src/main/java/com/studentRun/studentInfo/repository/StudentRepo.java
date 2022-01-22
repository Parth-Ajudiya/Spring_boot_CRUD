package com.studentRun.studentInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentRun.studentInfo.student.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	
}
