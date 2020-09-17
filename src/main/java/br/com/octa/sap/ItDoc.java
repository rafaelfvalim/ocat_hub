package br.com.octa.sap;

import java.math.BigDecimal;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import org.modelmapper.ModelMapper;

import br.com.octa.sap.dto.HomsoftDocCountDto;

@BapiStructure
public class ItDoc {

	@Parameter("TIPO")
	public String tipo;
	@Parameter("QTD")
	public BigDecimal qtd;
	@Parameter("DATA_DE")
	public Date dataDe;
	@Parameter("DATA_ATE")
	public Date dataAte;
	
	public  HomsoftDocCountDto getHomsoftDocCountDto( ){
		ModelMapper mappper = new ModelMapper();
		return  mappper.map(this, HomsoftDocCountDto.class);
	}
	
	public ItDoc() {
		
	}

}
