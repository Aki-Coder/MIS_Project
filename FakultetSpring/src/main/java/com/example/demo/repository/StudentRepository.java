package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Predmet;
import model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	//prikazi mi predmete koje slusam
	public List<Predmet> findByStudent(Student s);
	//u vidu tabele podatke o predmetima
	

}
