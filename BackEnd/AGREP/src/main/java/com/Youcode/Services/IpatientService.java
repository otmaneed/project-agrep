package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Patient;

public interface IpatientService {

	void insertPatient(Patient pat);

	List<Patient> selectpatients();

	void deleteipatient(int id_Patient);

	void updatepatient(Patient pat);

	public Optional<Patient> getpatient(int id_Patient);
}