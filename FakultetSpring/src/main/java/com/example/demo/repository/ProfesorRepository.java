package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Predmet;
import model.Profesor;
import model.Student;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
	
	//prikazi predmete koje predajem
	public List<Predmet> findByProfesor(Profesor p);
	//izaberi mi predmet
	
	@Query("select p from Predmet p where p.idPredmet like :idPredmet")
	public Predmet findByPredmet(@Param("idPredmet") Integer idPredmet);
	
	public Predmet findById(Predmet p);
	
	//izberi studente sa predmeta
	public List<Student> findByPredmet(Predmet p);
	
	public Student findById(Student s);
	
	//i za studenta za taj predmet 
	@Query("select s from Student s innner join s.predmets.naziv p where p.naziv like : naziv")
	public Predmet nadjiStudentaZaPredmet(@Param("naziv") String naziv); 
	
	//unesi ocenu
	@Query("select p from Predmet p inner join p.ispits i where i.predmet.ocena like :ocena")
	public Predmet unesiOcenu(@Param("ocena")Integer ocena);
	
	
	
	
	
}
