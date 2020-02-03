package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Youcode.DAO.Irendez_vous;
import com.Youcode.Entité.Rendez_vous;

@Service
public class Rendez_vousService  implements IRendez_vousService{
	@Autowired Irendez_vous irdv;
	
	@Override
	public void insertrendez_vous(Rendez_vous rdv) {
		 
		irdv.save(rdv);
	 } 
	  @Override
	public List <Rendez_vous> selectrendez_vous(){
		  return irdv.findAll();  
		  
	  }
	  @Override
	public void deleterendez_vous(int id_rdv) {
		  irdv.deleteById(id_rdv); 
	  } 
	  @Override
	public void updaterendez_vous(Rendez_vous rdv) {
		  irdv.save(rdv); 
	  }
	  @Override
	public  Optional<Rendez_vous>  getrendez_vous(int id_rdv) {
		 return irdv.findById(id_rdv);  
	  }

}
