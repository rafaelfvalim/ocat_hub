package br.com.octa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.DocumentoRepository;
import br.com.octa.model.Documento;
import br.com.octa.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;

	@Override
	public Documento getDocumeto(String chave) {
		return documentoRepository.findById(chave).orElse(null);
	}

}