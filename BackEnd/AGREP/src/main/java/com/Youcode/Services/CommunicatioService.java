package com.Youcode.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Youcode.DAO.Icommunication;
import com.Youcode.Entité.Communication;

@Service
public class CommunicatioService implements  ICommunicationService{
	@Autowired 
	Icommunication icommunication;
	
	 @Override
	public void insertcom(Communication com) {
	 	 
		 icommunication.save( com);
	  } 
	  
	 @Override
	public List <Communication> selectcom(){
	 	  return icommunication.findAll();  
	 	  
	   }
	  
	 @Override
	public void deletecom(int id_communication ) {
		 icommunication.deleteById(id_communication); 
	   } 
	  
	 @Override
	public void updatecom(Communication com) {
		 icommunication.save(com); 
	   }
	 
	 @Override
	public Communication getcom(int id_communication) {
	 	 return icommunication.getOne(id_communication);  
	   }

}
