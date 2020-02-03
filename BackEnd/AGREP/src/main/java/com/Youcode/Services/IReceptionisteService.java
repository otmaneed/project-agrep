package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Receptioniste;

public interface IReceptionisteService {

	void insertrecepcioniste(Receptioniste rec);

	List<Receptioniste> selectrecepcioniste();

	void deleterecepcioniste(int id_Rec);

	void updaterecepcionister(Receptioniste rec);

	 public Optional <Receptioniste>  getrecepcioniste(int id_Rec);

}