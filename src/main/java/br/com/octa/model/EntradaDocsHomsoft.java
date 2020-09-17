package br.com.octa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.octa.sap.dto.HomsoftDocCountDto;
import lombok.Data;

@Data
@Entity
public class EntradaDocsHomsoft {
	@Id
	@GeneratedValue
	public Long id;
	public String tipo;
	public int qtd;
	public Date dataDe;
	public Date dateAte;

	public EntradaDocsHomsoft() {
	}

	public EntradaDocsHomsoft(HomsoftDocCountDto dto) {
		this.tipo = dto.tipo;
		this.qtd = dto.qtd;
		this.dataDe = dto.dataDe;
		this.dateAte = dto.dateAte;
	}
}
