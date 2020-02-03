package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Autre_resource;

public interface IAutre_ressourceService {

	void insertresource(Autre_resource resource);

	List<Autre_resource> selectresource();

	void deleteresource(int id_Autre_resource);

	void updateresource(Autre_resource resource);

	 public Optional<Autre_resource> getresource(int id_Autre_resource);

}