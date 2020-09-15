package br.com.octa.dto;

import br.com.octa.model.Documento;
import lombok.Data;

@Data
public class DocumentoDto {
	private String chave;
	private String tipo;
	private String status;

	DocumentoDto() {

	}

	public DocumentoDto(String chave, String tipo) {
		super();
		this.chave = chave;
		this.tipo = tipo;
	}

	public DocumentoDto(String chave, String tipo, String status) {
		super();
		this.chave = chave;
		this.tipo = tipo;
		this.status = status;
	}

	public Documento convert() {
		Documento doc = new Documento();
		doc.setChave(this.chave);
		doc.setTipo(this.tipo);
		doc.setStatus(this.status);
		return doc;
	}
}
