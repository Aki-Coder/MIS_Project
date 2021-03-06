package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PredmetJSON;
import com.example.demo.services.StudentService;


@RestController
public class StudentController {
	

	@Autowired
	StudentService ss;
	
	@RequestMapping(path="/findMyPredmets", produces="application/json")
	public ResponseEntity<List<PredmetJSON>>findMySubject(@RequestParam("idStudent") Integer idStudent){
		return ss.getSubjetForStudent(idStudent);
	}

}
