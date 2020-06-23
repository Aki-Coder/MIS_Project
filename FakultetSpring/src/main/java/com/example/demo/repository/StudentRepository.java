package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Predmet;
import model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	


	@Query("select s from Student s inner join s.predmets p where p.profesor.idProfesor like :idProfesor"
			+ " and p.naziv like :naziv")
	public List<Student> getStudents(@Param("idProfesor")Integer idProfesor, @Param("naziv") String naziv);
	

}
