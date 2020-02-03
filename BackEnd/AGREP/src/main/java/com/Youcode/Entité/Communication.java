package com.Youcode.Entité;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Communication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_communication;

	public int getId_communication() {
		return id_communication;
	}

	public void setId_communication(int id_communication) {
		this.id_communication = id_communication;
	}
	

}
