package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Predmet;



public interface PredmetRepository extends JpaRepository<Predmet, Integer> {
	
	//prikazi predmete koje predajem
	@Query("select p from Predmet p where p.profesor.idProfesor like :idProfesor")
	public List<Predmet> findByProfesor(@Param("idProfesor") Integer idProfesor);
	
	
	@Query("select s from Student s inner join s.predmets p where p.naziv like :naziv")
	public List<Predmet> findByStudent( @Param("naziv") String naziv);
//	//prikazi mi predmete koje slusam
//	public List<Predmet> findByStudent(Student s);
//	//izaberi mi predmet
	
//	@Query("select p from Predmet p where p.idPredmet like :idPredmet")
//	public Predmet findByPredmet(@Param("idPredmet") Integer idPredmet);
		
	
	
	
	
	
	
}
