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

import com.Youcode.Entité.Infermier;
import com.Youcode.Services.IinfermierService;
@CrossOrigin

@RestController

public class InfermierController {
	

	@Autowired IinfermierService infermierservice;
	 
	@GetMapping("/Infermier")
	public List <Infermier> getAll(){
		List <Infermier> LI= infermierservice.selectinfermier();
		return LI;
	}
	
	@GetMapping("/Infermier/{id}")
	public Infermier SelectById (@PathVariable("id") int id_inf) {
		Infermier infermier = infermierservice.getinfermier(id_inf).get();
		return infermier;
		}
		
	@DeleteMapping("/Infermier/{id}")
	public void deleteInfermier(@PathVariable("id") int  id_inf) {
		infermierservice.deleteinfermier(id_inf);
	}
	
	@PostMapping("/Infermier")
	public void createInfermier(@RequestBody Infermier infermierr) {
		infermierservice.insertinfermier(infermierr);
	}

	 @PatchMapping("/Infermier")
	 public Infermier UpdateInfermier(@RequestBody Infermier infermierr){
		 infermierservice.updateinfermier(infermierr);
		 return infermierr;
	 }
		

}
