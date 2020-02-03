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

import com.Youcode.Entité.Medcin;
import com.Youcode.Exeptions.ErrorExeptions;
import com.Youcode.Services.IMedcinService;
@CrossOrigin

@RestController
public class MedcinController {
	
@Autowired
 IMedcinService medcinservice;

	@GetMapping("/Medcin")
	public List <Medcin> getAll(){
		List <Medcin> LM= medcinservice.selectmed();
		return LM;
	}
	
	@GetMapping("/Medcin/{id}")
	public Medcin SelectById (@PathVariable("id") int id_med) {
		return medcinservice.getmed(id_med).map(medecin -> {
			return medcinservice.getmed(id_med).get();
		}).orElseThrow(()-> new ErrorExeptions("kke" +id_med+"n'exxx"));
	
		
	}
	@DeleteMapping("/Medcin/{id}")
	
	public void deleteMedcin(@PathVariable("id") int  id_med) {
	medcinservice.deletemedr(id_med);
	}
	 
	@PostMapping("/Medcin")
	public void createMedcin(@RequestBody Medcin med) {
		medcinservice.insertMed(med);
	}
	
	 @PatchMapping("/Medcin")
	 public Medcin UpdateMedcin(@RequestBody Medcin med){

		 medcinservice.updatemed(med);;
		 return med;
	 }

}
