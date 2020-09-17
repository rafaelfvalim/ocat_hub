package br.com.octa.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.components.Scheduler;
import br.com.octa.model.EntradaDocsHomsoft;
import br.com.octa.repository.EntradaDocsHomsoftRepository;
import br.com.octa.service.EntradaDocsHomsoftService;

@Service
public class EntradaDocsHomsoftServiceImpl implements EntradaDocsHomsoftService {

	@Autowired
	private EntradaDocsHomsoftRepository repo;
	
	Logger logger = LogManager.getLogger(EntradaDocsHomsoftServiceImpl.class);

	
	@Override
	public Boolean saveList(List<EntradaDocsHomsoft> docs) {
		try {
			repo.saveAll(docs);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
