package br.com.octa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Documento {
	
	@Id
	private String chave;
	
	private String tipo;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_criacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_alteracao;
}
