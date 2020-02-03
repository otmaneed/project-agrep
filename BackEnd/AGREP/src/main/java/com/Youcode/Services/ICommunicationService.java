package com.Youcode.Services;

import java.util.List;

import com.Youcode.Entité.Communication;

public interface ICommunicationService {

	void insertcom(Communication com);

	List<Communication> selectcom();

	void deletecom(int id_communication);

	void updatecom(Communication com);

	Communication getcom(int id_communication);

}