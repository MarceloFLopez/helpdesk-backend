package com.marcelo.helpdesk.model.dto;

import com.marcelo.helpdesk.documentation.Documento;

public class DocumentoDTO {

	private Integer id;
	private String endPoint;
	private String descricao;

	public DocumentoDTO(Documento documento) {
		super();
		this.id = documento.getId();
		this.endPoint = documento.getEndPoint();
		this.descricao = documento.getDescricao();
		
	}

	public DocumentoDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
