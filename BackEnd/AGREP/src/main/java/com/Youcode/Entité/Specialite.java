package com.Youcode.Entité;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="specialité")
public class Specialite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_spec;
	
	@Column(name="name",nullable = false)
	@NotBlank(message="Enter specialité")
	private String S_name;
	
	
	@Column(name="reference",nullable = false)
	@NotBlank(message="Enter  the reference ")
	private String refrence;
	
	
	@OneToMany(mappedBy="spec",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List <Medcin> medcin;


	public int getId_spec() {
		return id_spec;
	}


	public void setId_spec(int id_spec) {
		this.id_spec = id_spec;
	}


	public String getS_name() {
		return S_name;
	}


	public void setS_name(String s_name) {
		S_name = s_name;
	}


	public String getRefrence() {
		return refrence;
	}


	public void setRefrence(String refrence) {
		this.refrence = refrence;
	}


	public List<Medcin> getMedcin() {
		return medcin;
	}


	public void setMedcin(List<Medcin> medcin) {
		this.medcin = medcin;
	}


	public Specialite(int id_spec, @NotBlank(message = "Enter specialité") String s_name,
			@NotBlank(message = "Enter  the reference ") String refrence, List<Medcin> medcin) {
		super();
		this.id_spec = id_spec;
		S_name = s_name;
		this.refrence = refrence;
		this.medcin = medcin;
	}


	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Specialite [id_spec=" + id_spec + ", S_name=" + S_name + ", refrence=" + refrence + ", medcin=" + medcin
				+ "]";
	}
	
	
	
}
