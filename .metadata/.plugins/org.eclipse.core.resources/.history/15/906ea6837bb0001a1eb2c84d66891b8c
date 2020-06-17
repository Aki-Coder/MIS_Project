package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Ispit;

public interface IspitRepository extends JpaRepository<Ispit, Integer> {

	@Query("select i from Ispit i where i.predmet.naziv like :naziv")
	public List<Ispit> findByIspitZaPredmet(@Param("naziv") String naziv);
}
