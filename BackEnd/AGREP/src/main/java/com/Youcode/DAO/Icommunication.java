package com.Youcode.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Youcode.Entité.Communication;

public interface Icommunication extends JpaRepository<Communication, Integer> {

}
