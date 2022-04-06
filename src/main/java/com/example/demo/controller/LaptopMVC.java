package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Laptop;

@Controller
public class LaptopMVC {
@GetMapping("/laptop")
public String laptopmvc(Model model) {
	List<Laptop> lst =new ArrayList<Laptop>();
	
	lst.add(new Laptop(12,"dell inspiron","Core i7 12th Generation","DELL",(float) 12121.0));
	lst.add(new Laptop(12,"dell AlienWare","Core i9 12th Generation","DELL",(float) 14646.0));
	model.addAttribute("laptop", lst);
	return "laptop";
}
}    
