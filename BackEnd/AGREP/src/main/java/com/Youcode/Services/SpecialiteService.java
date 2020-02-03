package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Ispecialiste;
import com.Youcode.Entité.Specialite;

@Service
public class SpecialiteService implements  ISpecialiteService {
 @Autowired Ispecialiste ispecialite;
 
 @Override
public void insertspecialite(Specialite spe) {
	 
	 ispecialite.save(spe);
 } 
  @Override
public List <Specialite> selectspecialite(){
	  return ispecialite.findAll();  
	  
  }
  @Override
public void deletespecialite(int id_spec) {
	  ispecialite.deleteById(id_spec); 
  } 
  @Override
public void updatespecialite(Specialite spe) {
	  ispecialite.save(spe); 
  }
  @Override
public Optional<Specialite>  getspecialite(int id_spec) {
	 return ispecialite.findById(id_spec);  
  }
 
}
