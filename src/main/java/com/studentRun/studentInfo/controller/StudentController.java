package com.studentRun.studentInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.studentRun.studentInfo.service.StudentService;
import com.studentRun.studentInfo.student.Student;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<Student> emp = service.allStu();
		m.addAttribute("emp",emp);
		return "index";
	}
	
	@GetMapping("/addstu")
	public String addStu()
	{
		return "addstudent";
	}
	
	@PostMapping("/resister")
	public String regStu(Student s)
	{
		service.addStu(s);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m)
	{
		Student ss = service.editById(id);
		m.addAttribute("emp", ss);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateStu(Student s)
	{
		service.addStu(s);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.deleteStu(id);
		
		return "redirect:/";
	}
}
