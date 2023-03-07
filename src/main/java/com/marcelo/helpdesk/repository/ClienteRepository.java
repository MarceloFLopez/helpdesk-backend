package com.marcelo.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelo.helpdesk.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
