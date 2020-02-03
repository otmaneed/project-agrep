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

import com.Youcode.Entité.Role;
import com.Youcode.Services.IRoleService;;
@CrossOrigin

@RestController
public class RoleController {
@Autowired
IRoleService roleservice;

	@GetMapping("/Role")
	public List <Role> getAll(){
		List <Role> LRo=roleservice.selectrole() ;
		return LRo;
	}
	
	@GetMapping("/Role/{id}")
	public Role SelectById (@PathVariable("id") int id_rol) {
		Role role = roleservice.getrole(id_rol).get();
		return role ;
		
	}
	@DeleteMapping("/Role/{id}")
	
	public void deleteRole(@PathVariable("id") int  id_rol) {
		roleservice.deleterole(id_rol);
	}
	 
	@PostMapping("/Role")
	public void createRole(@RequestBody Role rol) {
		roleservice.insertrole(rol);
	}
	
	 @PatchMapping("/Role")
	 public Role UpdateRole(@RequestBody Role rol){

		roleservice.updaterole(rol);
		 return rol;
	 }

}
