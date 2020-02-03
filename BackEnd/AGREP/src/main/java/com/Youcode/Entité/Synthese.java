package com.Youcode.Entité;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Syntheses")
public class Synthese {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_synthese;


@Column(name="commentaire",nullable = false)
@NotBlank(message="Enter  the reference ")
private String commantaire;


@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date jour;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn (name="id_dossier",nullable = false)
private DossierM dossierm;

public int getId_synthese() {
	return id_synthese;
}

public void setId_synthese(int id_synthese) {
	this.id_synthese = id_synthese;
}

public String getCommantaire() {
	return commantaire;
}

public void setCommantaire(String commantaire) {
	this.commantaire = commantaire;
}

public Date getJour() {
	return jour;
}

public void setJour(Date jour) {
	this.jour = jour;
}

public DossierM getDossierm() {
	return dossierm;
}

public void setDossierm(DossierM dossierm) {
	this.dossierm = dossierm;
}

public Synthese(int id_synthese, @NotBlank(message = "Enter  the reference ") String commantaire, Date jour,
		DossierM dossierm) {
	super();
	this.id_synthese = id_synthese;
	this.commantaire = commantaire;
	this.jour = jour;
	this.dossierm = dossierm;
}

public Synthese() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Synthese [id_synthese=" + id_synthese + ", commantaire=" + commantaire + ", jour=" + jour + ", dossierm="
			+ dossierm + "]";
}



}
