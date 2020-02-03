package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Idossierm;
import com.Youcode.Entité.DossierM;

@Service
public class DossierMService implements  IDossierMService  {
@Autowired 
 Idossierm idossier;
  

	@Override
	public void insertdossier(DossierM dossier) {
	 	 
	idossier.save( dossier);
	  } 
	  
	@Override
	public List <DossierM> selectdossier(){
	 	  return idossier.findAll();  
	 	  
	   }
	  
	 
	@Override
	public void deletedossier(int id_dossier ) {
		 idossier.deleteById(id_dossier); 
	   } 
	  
	 @Override
	public void updatedossier(DossierM dossier) {
		 idossier.save(dossier); 
	   }
	
	@Override
	public  Optional <DossierM> getdossier(int id_dossier) {
	 	 return idossier.findById(id_dossier);  
	   }

}
