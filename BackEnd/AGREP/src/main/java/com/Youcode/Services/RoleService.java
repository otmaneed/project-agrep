package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Irole;
import com.Youcode.Entité.Role;

@Service
public class RoleService implements  IRoleService {
	@Autowired 
	Irole irole;
	@Override
	public void insertrole(Role rol) {
		 
		irole.save(rol);
	 } 
	  @Override
	public List <Role> selectrole(){
		  return irole.findAll();  
		  
	  }
	  
	  @Override
	public void deleterole(int id_rol) {
		  irole.deleteById(id_rol); 
	  } 
	  
	  @Override
	public void updaterole(Role rol) {
		  irole.save(rol); 
	  }
	  @Override
	public  Optional <Role> getrole(int id_rol) {
		 return irole.findById(id_rol);  
	  }

}
