package br.com.octa.components;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.octa.helper.DateHelper;
import br.com.octa.model.EntradaDocsHomsoft;
import br.com.octa.model.EntradaDocsHomsoftId;
import br.com.octa.sap.dto.HomsoftDocCountDto;
import br.com.octa.service.EntradaDocsHomsoftService;
import br.com.octa.service.HomsoftInfoService;

@Component
public class Scheduler {

	@Autowired
	HomsoftInfoService homsoftInfoService;

	@Autowired
	EntradaDocsHomsoftService entradaDocsHomsoftService;

	Logger logger = LogManager.getLogger(Scheduler.class);

	@Scheduled(fixedRate = 5000)
	public void getInfoHomsoft() {
		logger.info("Scheduler :: getInfoHomsoft");
		List<EntradaDocsHomsoft> docs = new ArrayList<EntradaDocsHomsoft>();
		List<HomsoftDocCountDto> docsDto = homsoftInfoService.getCountDoc(DateHelper.toDate("01.01.2019"), DateHelper.toDate("01.03.2019"));
		for (HomsoftDocCountDto dto : docsDto) {			
			docs.add(new EntradaDocsHomsoft(dto));
		}
		
		logger.info(docs.toString());
		entradaDocsHomsoftService.saveList(docs);
	}
}