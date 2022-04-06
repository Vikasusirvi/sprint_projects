package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepo;

@Service
public class LaptopService {
    @Autowired
	LaptopRepo laptoprepo;
	public Laptop saveLaptop(Laptop laptop) {
		return laptoprepo.save(laptop);
	}
	public ResponseEntity<List<Laptop>> getLaptops() {
	    List<Laptop> lst = laptoprepo.findAll();
	    if(lst.size()==0) {
	    	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	    }
	    else {
	    	return ResponseEntity.status(HttpStatus.OK).body(lst);
	    }
	}
	public Optional<Laptop> getLaptopByID(Integer id){
		return laptoprepo.findById(id);
	}
	public void deleteLaptop(Integer id) {
		laptoprepo.deleteById(id);
	}
	
}
