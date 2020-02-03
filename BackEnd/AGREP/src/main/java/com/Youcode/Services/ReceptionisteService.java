package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Youcode.DAO.Irecepcioniste;
import com.Youcode.Entité.Receptioniste;

@Service
public class ReceptionisteService implements IReceptionisteService {

	@Autowired Irecepcioniste ireceptioniste;
	
	@Override
	public void insertrecepcioniste(Receptioniste rec) {
		 
		ireceptioniste.save(rec);
	 } 
	  @Override
	public List <Receptioniste> selectrecepcioniste(){
		  return ireceptioniste.findAll();  
		  
	  }
	  @Override
	public void deleterecepcioniste(int id_Rec) {
		  ireceptioniste.deleteById(id_Rec); 
	  } 
	  @Override
	public void updaterecepcionister(Receptioniste rec) {
		  ireceptioniste.save(rec); 
	  }
	  @Override
	public Optional <Receptioniste>  getrecepcioniste(int id_Rec) {
		 return ireceptioniste.findById(id_Rec);  
	  }
}
