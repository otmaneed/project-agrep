package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Youcode.DAO.Iadministartion;
import com.Youcode.Entité.Administartion;

@Service
public class AdministratioServices implements  IAdministrationService {
 @Autowired Iadministartion iadmin;
  
 @Override
public void insertadmin(Administartion admin) {
	 
	 iadmin.save(admin);
 } 
  @Override
public List <Administartion> selectadmin(){
	  return iadmin.findAll();  
	  
  }
  @Override
public void deleteAdmin(int id_administartion) {
	  iadmin.deleteById(id_administartion); 
  } 
  @Override
public void updateAdmin(Administartion admin) {
	  iadmin.save(admin); 
  }
  @Override
  public Optional<Administartion>  getAdmin(int id_administartion) {
	 return iadmin.findById(id_administartion);  
  }
  
}
