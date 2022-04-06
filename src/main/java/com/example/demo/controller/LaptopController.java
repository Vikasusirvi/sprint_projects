package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Laptop;
import com.example.demo.service.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService laptopservice;
	
	@PostMapping("/laptop")
	public Laptop saveLaptop(@RequestBody   Laptop laptop) {
		return laptopservice.saveLaptop(laptop);
	}
	@GetMapping("/laptops")
	public ResponseEntity<List<Laptop>> getLaptops(){
		return laptopservice.getLaptops();
	}
	@GetMapping("/laptop/{id}")
	public Optional<Laptop> getLaptopById(@PathVariable Integer id){
		return laptopservice.getLaptopByID(id);
	}
	@DeleteMapping("/laptop/{id}")
	public void deleteLaptop(@PathVariable Integer id) {
		laptopservice.deleteLaptop(id);
	}
	
	
	
	
	
}
