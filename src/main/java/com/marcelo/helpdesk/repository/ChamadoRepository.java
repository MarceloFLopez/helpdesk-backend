package com.marcelo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.helpdesk.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
