package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Specialite;

public interface ISpecialiteService {

	void insertspecialite(Specialite spe);

	List<Specialite> selectspecialite();

	void deletespecialite(int id_spec);

	void updatespecialite(Specialite spe);

	  public Optional<Specialite> getspecialite(int id_spec);

}