package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.IspitRepository;

import model.Ispit;

@Controller
@RequestMapping(value="/studentController")
public class StudentController {
	
	@Autowired
	IspitRepository ir;
	
	@RequestMapping(value = "/pregleIspita",method = RequestMethod.GET)
	public String pregledajIspiteZaPredmet(HttpServletRequest request,String nazivIspita) {
		List<Ispit> ispiti = ir.findByIspitZaPredmet(nazivIspita);
		request.getSession().setAttribute("ispiti",ispiti);
		return "";
	}
	

}
