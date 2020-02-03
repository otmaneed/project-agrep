package com.Youcode.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Youcode.Entité.Patient;
import com.Youcode.Services.IpatientService;
@CrossOrigin


@RestController

public class PatientController {
	
@Autowired
 IpatientService patientservice;


	@GetMapping("/Patient")
	public List <Patient> getAll(){
		List <Patient> LP= patientservice.selectpatients();
		return LP;
	}
	
	@GetMapping("/Patient/{id}")
	public Patient SelectById (@PathVariable("id") int id_Patient) {
		Patient patient = patientservice.getpatient(id_Patient).get();
		return patient ;
		
	}
	@DeleteMapping("/Patient/{id}")
	
	public void deletePatient(@PathVariable("id") int  id_Patient) {
	patientservice.deleteipatient(id_Patient);
	}
	 
	@PostMapping("/Patient")
	public void createPatient(@RequestBody Patient patient) {
		patientservice.insertPatient(patient);
	}
	
	 @PatchMapping("/Patient")
	 public Patient UpdatePatient(@RequestBody Patient p){

		 patientservice.updatepatient(p);
		 return p;
	 }
}