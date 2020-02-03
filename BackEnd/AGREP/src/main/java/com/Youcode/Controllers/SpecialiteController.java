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

import com.Youcode.Entité.Specialite;
import com.Youcode.Services.ISpecialiteService;
@CrossOrigin

@RestController
public class SpecialiteController {
	
 @Autowired
 ISpecialiteService speciaservice;
 
	@GetMapping("/Specialite")
		public List <Specialite> getAll(){
		List <Specialite> LSp= speciaservice.selectspecialite();
		return LSp;
	}
	
	@GetMapping("/Specialite/{id}")
	public Specialite SelectById (@PathVariable("id") int id_spec) {
		Specialite spec = speciaservice.getspecialite(id_spec).get();
		return spec ;
		
	}
	@DeleteMapping("/Specialite/{id}")
	
	public void deleteSpecialite(@PathVariable("id") int  id_spec) {
	speciaservice.deletespecialite(id_spec);
	}
	 
	@PostMapping("/Specialite")
	public void createSpecialite(@RequestBody Specialite spe) {
		speciaservice.insertspecialite(spe);;
	}
	
	 @PatchMapping("/Specialite")
	 public Specialite UpdateSpecialite(@RequestBody Specialite spe){

		 speciaservice.updatespecialite(spe);
		 return spe;
	 }

}
