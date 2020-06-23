package model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	//bi-directional many-to-many association to Ispit
	@ManyToMany
	@JoinTable(
		name="student_has_ispit"
		, joinColumns={
			@JoinColumn(name="Student_idStudent")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Ispit_idIspit")
			}
		)
	@JsonProperty
	private List<Ispit> ispits;

	//bi-directional many-to-many association to Predmet
	@ManyToMany
	@JoinTable(
		name="student_has_predmet"
		, joinColumns={
			@JoinColumn(name="Student_idStudent")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Predmet_idPredmet")
			}
		)
	@JsonProperty
	private List<Predmet> predmets;

	public Student() {
	}

	public int getIdStudent() {
		return this.idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getBrojIndexa() {
		return this.brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<Ispit> getIspits() {
		return this.ispits;
	}

	public void setIspits(List<Ispit> ispits) {
		this.ispits = ispits;
	}

	public List<Predmet> getPredmets() {
		return this.predmets;
	}

	public void setPredmets(List<Predmet> predmets) {
		this.predmets = predmets;
	}

}