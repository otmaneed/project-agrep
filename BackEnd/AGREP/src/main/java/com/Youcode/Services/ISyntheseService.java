package com.Youcode.Services;

import java.util.List;
import java.util.Optional;

import com.Youcode.Entité.Synthese;

public interface ISyntheseService {

	void insertsynthese(Synthese syn);

	List<Synthese> selectsynthese();

	void deletesynthese(int id_synthese);

	void updatesynthese(Synthese syn);

	 public Optional<Synthese> getsynthese(int id_synthese);

}