package br.com.octa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Documento {
	@Id
	private String chave;
	private String tipo;
	private String status;
//	private LocalDateTime dataInclusao;
//	private LocalDateTime dataAleracao;
}
	