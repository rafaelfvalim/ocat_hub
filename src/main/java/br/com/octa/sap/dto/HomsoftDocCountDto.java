package br.com.octa.sap.dto;

import java.util.Date;

import br.com.octa.sap.ItDoc;
import lombok.Data;

@Data
public class HomsoftDocCountDto {

	public String tipo;
	public int qtd;
	public Date dataDe;
	public Date dateAte;
	
	public HomsoftDocCountDto(ItDoc doc) {
		
		this.tipo = doc.tipo;
		this.qtd = doc.qtd;
		this.dataDe = doc.dataDe;
		this.dateAte = doc.dateAte;
		
	} 

}
