package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Rendez_vous;

public interface IRendez_vousService {

	void insertrendez_vous(Rendez_vous rdv);

	List<Rendez_vous> selectrendez_vous();

	void deleterendez_vous(int id_rdv);

	void updaterendez_vous(Rendez_vous rdv);

	 public Optional<Rendez_vous> getrendez_vous(int id_rdv);

}