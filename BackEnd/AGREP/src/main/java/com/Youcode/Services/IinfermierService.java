package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Infermier;

public interface IinfermierService {

	void insertinfermier(Infermier infermierr);

	List<Infermier> selectinfermier();

	void deleteinfermier(int id_inf);

	void updateinfermier(Infermier infermierr);

	 Optional<Infermier>  getinfermier(int id_inf);

}