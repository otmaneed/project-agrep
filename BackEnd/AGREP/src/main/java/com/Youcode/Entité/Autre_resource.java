package com.Youcode.Entité;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="autres_resources")

public class Autre_resource extends Praticien{
	
	@Column(name="services",nullable = false)
	@NotBlank(message="Enter service")
	private String service;

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	

	public Autre_resource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autre_resource(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role,
			@NotBlank(message = "Enter f_name") String f_name, @NotBlank(message = "Enter l_name") String l_name,
			List<Rendez_vous> rdvs) {
		super(id, username, password, role, f_name, l_name, rdvs);
		// TODO Auto-generated constructor stub
	}

	public Autre_resource(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}

	public Autre_resource(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role,
			@NotBlank(message = "Enter f_name") String f_name, @NotBlank(message = "Enter l_name") String l_name,
			List<Rendez_vous> rdvs, @NotBlank(message = "Enter service") String service) {
		super(id, username, password, role, f_name, l_name, rdvs);
		this.service = service;
	}

	@Override
	public String toString() {
		return "Autre_resource [service=" + service + "]";
	}


	
}
