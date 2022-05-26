package com.prog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.entity.Student;
import com.prog.repo.StudentRepo;

@Controller
public class MainController {
	private final StudentRepo srepo;

	public MainController(StudentRepo srepo) {
	
		this.srepo = srepo;
	}
	@GetMapping("/")
	public String view() {
		return "/index";
	}
	@GetMapping("/insert")
	public String view1(Student student) {
		return "index";
	}	
	@PostMapping("/add")
	public String view2(Student stud,Model m) {
		srepo.save(stud);
		m.addAttribute("msg","record inserted successfully....");
		return "index";
	}
	@GetMapping("/display")
	public String view3(Model m) {
	List list=	srepo.findAll();
	if(!list.isEmpty()) {
		m.addAttribute("data",list);
	}else {
		m.addAttribute("msg","record not found");
	}
		return "displayPage";
	}
}
