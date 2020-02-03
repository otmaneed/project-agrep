package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Imedcin;
import com.Youcode.Entité.Medcin;

@Service
public class MedcinService implements IMedcinService {
	
@Autowired Imedcin imedcin;



@Override
public void insertMed(Medcin med) {
 	 
	imedcin.save( med);
  } 
  

@Override
public List <Medcin > selectmed(){
 	  return imedcin.findAll();  
 	  
   }
  
 

@Override
public void deletemedr(int id_med ) {
	imedcin.deleteById(id_med); 
   } 

@Override
public void updatemed(Medcin  med) {
	imedcin.save(med); 
   }


@Override
public Optional<Medcin>   getmed(int id_med) {
 	 return imedcin.findById(id_med);  
   }


}
