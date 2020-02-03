package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Role;

public interface IRoleService {

	void insertrole(Role rol);

	List<Role> selectrole();

	void deleterole(int id_rol);

	void updaterole(Role rol);

	 public Optional <Role> getrole(int id_rol);

}