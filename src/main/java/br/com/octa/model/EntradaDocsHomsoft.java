package br.com.octa.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import br.com.octa.sap.dto.HomsoftDocCountDto;
import lombok.Data;

@Data
@Entity
public class EntradaDocsHomsoft {
   
	@EmbeddedId
	public EntradaDocsHomsoftId entradaDocsHomsoftId;
	
	public BigDecimal qtd;
	
	public Date dataUltimaMod;

	public EntradaDocsHomsoft() {
	}

	public EntradaDocsHomsoft(HomsoftDocCountDto dto) {
		this.entradaDocsHomsoftId = new EntradaDocsHomsoftId(dto.tipo, dto.dataDe, dto.dataAte);
		this.qtd = dto.qtd;
		this.dataUltimaMod = new Date();
	}
	

}
