package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import model.Predmet;


@Repository
public interface PredmetRepository extends JpaRepository<Predmet, Integer> {
	
	//prikazi predmete koje predajem
	@Query("select p from Predmet p where p.profesor.idProfesor like :idProfesor")
	public List<Predmet> findByProfesors(@Param("idProfesor") Integer idProfesor);
	
	//prikazi predmete koje slusam
	@Query("select p from Predmet p inner join p.students s where s.idStudent like :idStudent")
	public List<Predmet> findByStudents(@Param("idStudent") Integer idStudent);
	


	

	
	
	
	
	
	
}
