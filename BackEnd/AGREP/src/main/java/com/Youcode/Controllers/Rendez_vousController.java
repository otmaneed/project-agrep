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

import com.Youcode.Entité.Rendez_vous;
import com.Youcode.Services.IRendez_vousService;
@CrossOrigin

@RestController

public class Rendez_vousController {
	
@Autowired

IRendez_vousService rdvservice;
	@GetMapping("/RDV")
	public List <Rendez_vous> getAll(){
		List <Rendez_vous> LRd= rdvservice.selectrendez_vous();
		return LRd;
	}
	
	@GetMapping("/RDV/{id}")
	public Rendez_vous SelectById (@PathVariable("id") int id_rdv) {
		Rendez_vous rendez = rdvservice.getrendez_vous(id_rdv).get();
		return rendez ;
		
	}
	@DeleteMapping("/RDV/{id}")
	
	public void deleteRndv(@PathVariable("id") int  id_rdv) {
		rdvservice.deleterendez_vous(id_rdv);
	}
	 
	@PostMapping("/RDV")
	public void createRndv(@RequestBody Rendez_vous rdv) {
		rdvservice.insertrendez_vous(rdv);
	}
	
	 @PatchMapping("/RDV")
	 public Rendez_vous Updaterendez_vous(@RequestBody Rendez_vous rdv){

		 rdvservice.updaterendez_vous(rdv);
		 return rdv;
	 }

}
