
package com.Youcode.Entité;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="medcins")

public class Medcin extends Praticien{
	
	 @Column(name="ref_med",nullable = false)
	 @NotBlank(message="Enter reference medical")
	 private String ref_med;
 
	 @Column(name="disponibilite",nullable = false)
	 @NotBlank(message="definir la statut du medcin")
	 private boolean dispo;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn (name="id_spec",nullable = false)
		private Specialite spec;

	public String getRef_med() {
		return ref_med;
	}

	public void setRef_med(String ref_med) {
		this.ref_med = ref_med;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public Specialite getSpec() {
		return spec;
	}

	public void setSpec(Specialite spec) {
		this.spec = spec;
	}

	public Medcin(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role,
			@NotBlank(message = "Enter f_name") String f_name, @NotBlank(message = "Enter l_name") String l_name,
			List<Rendez_vous> rdvs, @NotBlank(message = "Enter reference medical") String ref_med,
			@NotBlank(message = "definir la statut du medcin") boolean dispo, Specialite spec) {
		super(id, username, password, role, f_name, l_name, rdvs);
		this.ref_med = ref_med;
		this.dispo = dispo;
		this.spec = spec;
	}

	public Medcin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medcin(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role,
			@NotBlank(message = "Enter f_name") String f_name, @NotBlank(message = "Enter l_name") String l_name,
			List<Rendez_vous> rdvs) {
		super(id, username, password, role, f_name, l_name, rdvs);
		// TODO Auto-generated constructor stub
	}

	public Medcin(int id, @NotBlank(message = "Enter username") String username,
			@NotBlank(message = "Entrer your password") String password, Role role) {
		super(id, username, password, role);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medcin [ref_med=" + ref_med + ", dispo=" + dispo + ", spec=" + spec + "]";
	}

	

	 
}
