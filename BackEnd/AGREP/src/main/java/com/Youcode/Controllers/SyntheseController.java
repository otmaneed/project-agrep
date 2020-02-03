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

import com.Youcode.Entité.Synthese;
import com.Youcode.Services.ISyntheseService;
@CrossOrigin

@RestController
public class SyntheseController {
@Autowired
ISyntheseService synthservice;

	@GetMapping("/Synthese")
	public List <Synthese> getAll(){
		List <Synthese> LSy= synthservice.selectsynthese();
		return LSy;
	}
	
	@GetMapping("/Synthese/{id}")
	public Synthese SelectById (@PathVariable("id") int id_synthese) {
		Synthese synthese = synthservice.getsynthese(id_synthese).get();
		return synthese ;
		
	}
	@DeleteMapping("/Synthese/{id}")
	
	public void deleteSynthese(@PathVariable("id") int  id_synthese) {
		synthservice.deletesynthese(id_synthese);;
	}
	 
	@PostMapping("/Synthese")
	public void createSynthese(@RequestBody Synthese syn) {
		synthservice.insertsynthese(syn);;
	}
	
	 @PatchMapping("/Synthese")
	 public Synthese UpdateSynthese(@RequestBody Synthese syn){

		 synthservice.updatesynthese(syn);
		 return syn;
	 }

}
