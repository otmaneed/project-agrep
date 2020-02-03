package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Isynthese;
import com.Youcode.Entité.Synthese;

@Service
public class SyntheseService implements ISyntheseService {
 @Autowired Isynthese isynthese;

 @Override
public void insertsynthese(Synthese syn) {
	 
	 isynthese.save(syn);
 } 
  @Override
public List <Synthese> selectsynthese(){
	  return isynthese.findAll();  
	  
  }
  @Override
public void deletesynthese(int id_synthese) {
	  isynthese.deleteById(id_synthese); 
  } 
  @Override
public void updatesynthese(Synthese syn) {
	  isynthese.save(syn); 
  }
  @Override
public Optional<Synthese> getsynthese(int id_synthese) {
	 return isynthese.findById(id_synthese);  
  }
}
