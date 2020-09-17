package br.com.octa.sap.dto;

import java.math.BigDecimal;
import java.util.Date;

import br.com.octa.sap.ItDoc;
import lombok.Data;

@Data
public class HomsoftDocCountDto {

	public String tipo;
	public BigDecimal qtd;
	public Date dataDe;
	public Date dataAte;
	
	public HomsoftDocCountDto(ItDoc doc) {
		
		this.tipo = doc.tipo;
		this.qtd = doc.qtd;
		this.dataDe = doc.dataDe;
		this.dataAte = doc.dataAte;
		
	} 

}
