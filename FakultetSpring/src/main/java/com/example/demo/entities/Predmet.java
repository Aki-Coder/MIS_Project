package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Predmet {
	
	@JsonProperty
	private int idPredmet;
	@JsonProperty
	private int espb;
	@JsonProperty
	private String naziv;
	@JsonProperty
	private int semestar;
	public Predmet(@JsonProperty int idPredmet, 
			       @JsonProperty int espb, 
			       @JsonProperty String naziv, 
			       @JsonProperty int semestar) {
		super();
		this.idPredmet = idPredmet;
		this.espb = espb;
		this.naziv = naziv;
		this.semestar = semestar;
	}
	public int getIdPredmet() {
		return idPredmet;
	}
	public void setIdPredmet(int idPredmet) {
		this.idPredmet = idPredmet;
	}
	public int getEspb() {
		return espb;
	}
	public void setEspb(int espb) {
		this.espb = espb;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSemestar() {
		return semestar;
	}
	public void setSemestar(int semestar) {
		this.semestar = semestar;
	} 
	
	
}
