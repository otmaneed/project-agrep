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

import com.Youcode.Entité.DossierM;
import com.Youcode.Services.IDossierMService;
@CrossOrigin
@RestController
public class DossierMController {
@Autowired
	IDossierMService dossierm;

	@GetMapping("/DossierMd")
	
	public List <DossierM> getAll(){
		List <DossierM> LD= dossierm.selectdossier();
		return LD;
	}
	
	@GetMapping("/DossierMd/{id}")
	public DossierM SelectById (@PathVariable("id") int id_dossier) {
		DossierM dossier =dossierm.getdossier(id_dossier).get();
		return dossier ;
		
	}
	@DeleteMapping("/DossierMd/{id}")
	
	public void deleteDossier(@PathVariable("id") int  id_dossier) {
	dossierm.deletedossier(id_dossier);
	}
	 
	@PostMapping("/DossierMd")
	public void createDossierM(@RequestBody DossierM dossier) {
		dossierm.insertdossier(dossier);
	}
	
	 @PatchMapping("/DossierMd")
	 public DossierM UpdateDossier(@RequestBody DossierM dossier){
		 dossierm.updatedossier(dossier);
		 
		 return dossier;
	 }

}
