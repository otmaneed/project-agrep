package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Iautre_resource;
import com.Youcode.Entité.Autre_resource;

@Service
public class Autre_ressourceService implements IAutre_ressourceService{

	@Autowired 
	Iautre_resource iautre_resource;
	
	 @Override
	public void insertresource(Autre_resource resource) {
	 	 
		 iautre_resource.save( resource);
	  } 
	  
	 @Override
	public List <Autre_resource> selectresource(){
	 	  return iautre_resource.findAll();  
	 	  
	   }
	  
	 @Override
	public void deleteresource(int id_Autre_resource ) {
		   iautre_resource.deleteById(id_Autre_resource); 
	   } 
	  
	 @Override
	public void updateresource(Autre_resource resource) {
		   iautre_resource.save(resource); 
	   }
	 
	 @Override
	public Optional<Autre_resource> getresource(int id_Autre_resource) {
	 	 return iautre_resource.findById(id_Autre_resource);  
	   }
	   
}
