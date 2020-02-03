package com.Youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Youcode.Entité.Patient;

public interface Ipatient extends JpaRepository<Patient, Integer>{

}
