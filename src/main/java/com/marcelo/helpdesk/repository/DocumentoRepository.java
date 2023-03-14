package com.marcelo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.helpdesk.documentation.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Integer>{

}
