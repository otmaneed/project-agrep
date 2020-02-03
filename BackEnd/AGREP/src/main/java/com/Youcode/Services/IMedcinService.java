package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Medcin;

public interface IMedcinService {

	void insertMed(Medcin med);

	List<Medcin> selectmed();

	void deletemedr(int id_med);

	void updatemed(Medcin med);

	public Optional <Medcin> getmed(int id_med);

}