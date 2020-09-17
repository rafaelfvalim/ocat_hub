package br.com.octa.service;

import java.util.Date;
import java.util.List;

import br.com.octa.sap.dto.HomsoftDocCountDto;

public interface HomsoftInfoService {

	public List<HomsoftDocCountDto> getCountDoc(Date dataDe, Date dataAte);
	
}
