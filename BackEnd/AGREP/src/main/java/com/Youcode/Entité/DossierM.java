package com.Youcode.Entité;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="DossierM")
public class DossierM {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id_dossier;
		
		 @Column(name="name",nullable = false)
		 @NotBlank(message="Enter name")
		 private String name;
		 
		 @Column(name="syntheseDP",nullable = false)
		 @NotBlank(message="Enter  une synthese")
		 private String syntheseDP; 
		
		 
	    @OneToMany(mappedBy="dossierm",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
		private List <Synthese> synthese;
	 
	   @OneToOne
	   @JoinColumn (name="dossier_pat",nullable = false)
		private  Patient patient  ;

		public int getId_dossier() {
			return id_dossier;
		}

		public void setId_dossier(int id_dossier) {
			this.id_dossier = id_dossier;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSyntheseDP() {
			return syntheseDP;
		}

		public void setSyntheseDP(String syntheseDP) {
			this.syntheseDP = syntheseDP;
		}

		public List<Synthese> getSynthese() {
			return synthese;
		}

		public void setSynthese(List<Synthese> synthese) {
			this.synthese = synthese;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

		public DossierM(int id_dossier, @NotBlank(message = "Enter name") String name,
				@NotBlank(message = "Enter  une synthese") String syntheseDP, List<Synthese> synthese,
				Patient patient) {
			super();
			this.id_dossier = id_dossier;
			this.name = name;
			this.syntheseDP = syntheseDP;
			this.synthese = synthese;
			this.patient = patient;
		}

		@Override
		public String toString() {
			return "DossierM [id_dossier=" + id_dossier + ", name=" + name + ", syntheseDP=" + syntheseDP
					+ ", synthese=" + synthese + ", patient=" + patient + "]";
		}

	
}
