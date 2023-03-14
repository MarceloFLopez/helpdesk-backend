package com.marcelo.helpdesk.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcelo.helpdesk.documentation.Documento;
import com.marcelo.helpdesk.model.dto.DocumentoDTO;
import com.marcelo.helpdesk.services.DocumentoService;

@RestController
@RequestMapping(value = "/documentos")
public class DocumentoResource {

	@Autowired
	private DocumentoService service;

	@GetMapping
	public ResponseEntity<List<DocumentoDTO>> findAll() {
		List<Documento> list = service.findAll();
		List<DocumentoDTO> listDTO = list.stream().map(obj -> new DocumentoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping
	public ResponseEntity<DocumentoDTO> create(@Valid @RequestBody DocumentoDTO objDTO) {
		Documento newObj = service.create(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
}