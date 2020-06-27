package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentJSON {
	@JsonProperty
	private int idStudent;
	@JsonProperty
	private String brojIndexa;
	@JsonProperty
	private String ime;
	@JsonProperty
	private String jmbg;
	@JsonProperty
	private String prezime;
	public StudentJSON(@JsonProperty int idStudent, @JsonProperty String brojIndexa,@JsonProperty String ime,@JsonProperty String jmbg,@JsonProperty String prezime) {
		super();
		this.idStudent = idStudent;
		this.brojIndexa = brojIndexa;
		this.ime = ime;
		this.jmbg = jmbg;
		this.prezime = prezime;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	
	
	
}
