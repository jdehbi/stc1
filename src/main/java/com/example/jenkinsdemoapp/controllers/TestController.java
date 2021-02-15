package com.example.jenkinsdemoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jenkinsdemoapp.models.Record;
import com.example.jenkinsdemoapp.repo.RecordRepo;

@RestController
@CrossOrigin("http://localhost:4200")
public class TestController {
	
	@Autowired
	RecordRepo recordRepo;

	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("welcome to - STC 09/02/2021  Demo project for CICD Pipeline ", HttpStatus.OK);
	}
	
	@GetMapping("/records")
	public ResponseEntity<List<Record>> getAllRecords(){
		return new ResponseEntity<List<Record>>(recordRepo.findAll(), HttpStatus.OK); 
	}
	
	@PostMapping("/records")
	public ResponseEntity<Record> postRecord(@RequestBody Record record){
		return new ResponseEntity<Record>(recordRepo.save(record), HttpStatus.OK);
	}
	
}
