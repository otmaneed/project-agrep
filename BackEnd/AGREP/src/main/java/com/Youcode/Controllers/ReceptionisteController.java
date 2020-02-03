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

import com.Youcode.Entité.Receptioniste;
import com.Youcode.Services.IReceptionisteService;
@CrossOrigin

@RestController
public class ReceptionisteController {
@Autowired
	IReceptionisteService recepservice;
	@GetMapping("/Receptioniste")
	public List <Receptioniste> getAll(){
		List <Receptioniste> LRe= recepservice.selectrecepcioniste();
		return LRe;
	}
	
	@GetMapping("/Receptioniste/{id}")
	public Receptioniste SelectById (@PathVariable("id") int id_Rec) {
		Receptioniste recep = recepservice.getrecepcioniste(id_Rec).get();
		return recep ;
		
	}
	@DeleteMapping("/Receptioniste/{id}")
	public void deleteReceptioniste(@PathVariable("id") int  id_Rec) {
		recepservice.deleterecepcioniste(id_Rec);;
	}
	 
	@PostMapping("/Receptioniste")
	public void createReceptioniste(@RequestBody Receptioniste rec) {
		recepservice.insertrecepcioniste(rec);;
	}
	
	 @PatchMapping("/Receptioniste")
	 public Receptioniste Updateeceptioniste(@RequestBody Receptioniste rec){

		 recepservice.updaterecepcionister(rec);
		 return rec;
	 }

}
