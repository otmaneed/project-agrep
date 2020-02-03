package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Ipatient;
import com.Youcode.Entité.Patient;



@Service
public class PatientService implements IpatientService{
	@Autowired Ipatient ipatient;
	
 @Override
public void insertPatient(Patient pat) {
		 
	 ipatient.save(pat);
	 } 
	  @Override
	public List <Patient> selectpatients(){
		  return ipatient.findAll();  
		  
	  }
	  @Override
	public void deleteipatient(int id_Patient) {
		  ipatient.deleteById(id_Patient); 
	  } 
	  @Override
	public void updatepatient(Patient pat) {
		  ipatient.save(pat); 
	  }
	  @Override
	public Optional<Patient> getpatient(int id_Patient) {
		 return ipatient.findById(id_Patient) ;
	  }
	
}
