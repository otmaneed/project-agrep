package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.DossierM;

public interface IDossierMService {

	void insertdossier(DossierM dossier);

	List<DossierM> selectdossier();

	void deletedossier(int id_dossier);

	void updatedossier(DossierM dossier);

	 public Optional <DossierM>  getdossier(int id_dossier);

}