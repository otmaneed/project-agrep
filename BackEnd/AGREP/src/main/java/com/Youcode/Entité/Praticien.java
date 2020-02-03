package com.Youcode.Entité;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Praticien extends User{
	
	
	@Column(name="f_name",nullable = false)
	@NotBlank(message="Enter f_name")
	private String f_name;
	
	@Column(name="l_name",nullable = false)
	@NotBlank(message="Enter l_name")
	private String l_name;
	
	
	
	
	@OneToMany(mappedBy="praticien",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List <Rendez_vous> rdvs;


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}




	public List<Rendez_vous> getRdvs() {
		return rdvs;
	}


	public void setRdvs(List<Rendez_vous> rdvs) {
		this.rdvs = rdvs;
	}


	public Praticien(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role,
			@NotBlank(message = "Enter f_name") String f_name, @NotBlank(message = "Enter l_name") String l_name,
			List<Rendez_vous> rdvs) {
		super(id, username, password, role);
		this.f_name = f_name;
		this.l_name = l_name;
		this.rdvs = rdvs;
	}


	public Praticien() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Praticien(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Praticien [f_name=" + f_name + ", l_name=" + l_name + ", rdvs=" + rdvs + "]";
	}


	
}
