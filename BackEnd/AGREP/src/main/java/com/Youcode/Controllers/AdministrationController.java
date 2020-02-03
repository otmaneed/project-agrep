package com.Youcode.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Youcode.Entité.Administartion;
import com.Youcode.Services.IAdministrationService;

@CrossOrigin
@RestController
public class AdministrationController {
@Autowired 
IAdministrationService adminservice;

//	@GetMapping("/Admin")
//	public List <Administartion> getAll(){
//		List <Administartion> LP= adminservice.selectAdmin();
//		return LA;
//	}
	
	@GetMapping("/Admin/{id}")
	public Administartion SelectById (@PathVariable("id") int id_administartion) {
	Administartion admin = adminservice.getAdmin(id_administartion).get();
	return admin ;
	
	
		
	}
	
}
