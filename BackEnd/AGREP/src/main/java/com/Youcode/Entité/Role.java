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
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rol;
	
	@Column(name="name",nullable = false)
	@NotBlank(message="Enter  role name")
	private String name;
 
	
	@OneToMany(mappedBy="role",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List <User> user;


	public int getId_rol() {
		return id_rol;
	}


	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}


	public Role(int id_rol, @NotBlank(message = "Enter  role name") String name, List<User> user) {
		super();
		this.id_rol = id_rol;
		this.name = name;
		this.user = user;
	}


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Role [id_rol=" + id_rol + ", name=" + name + ", user=" + user + "]";
	}


	
}
