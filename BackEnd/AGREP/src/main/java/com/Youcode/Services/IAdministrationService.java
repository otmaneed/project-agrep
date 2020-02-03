package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Administartion;

public interface IAdministrationService {

	void insertadmin(Administartion admin);

	List<Administartion> selectadmin();

	void deleteAdmin(int id_administartion);

	void updateAdmin(Administartion admin);

	 public Optional<Administartion>  getAdmin(int id_administartion);

}