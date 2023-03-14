package com.marcelo.helpdesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.helpdesk.documentation.Documento;
import com.marcelo.helpdesk.model.dto.DocumentoDTO;
import com.marcelo.helpdesk.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository repository;

	public List<Documento> findAll() {
		return repository.findAll();
	}

	public Documento create(DocumentoDTO objDTO) {
		objDTO.setId(null);
		objDTO.setEndPoint(null);
		Documento newObj = new Documento();
		return repository.save(newObj);
	}


}