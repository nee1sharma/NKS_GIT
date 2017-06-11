package com.sharma.nks.spbo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sharma.nks.spbo.beans.Student;

@Controller
public class GreetingController {

	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String facade(){
		return "Hello world with boot.";
	}
	
	@ResponseBody
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> students(){
		Student s1=new Student("S2017RP001", 21, "Sharma", "Krishna", "5", "A");
		Student s2=new Student("S2017RP011", 1, "Verma", "Mahesh", "5", "A");
		Student s3=new Student("S2017RP012", 4, "Devi", "Parvati", "5", "B");
		List<Student> listStudent=new ArrayList<>();
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);

		return listStudent;
	}
}
