package com.marcelo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.helpdesk.model.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
