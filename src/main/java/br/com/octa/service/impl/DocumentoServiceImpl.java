package br.com.octa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.model.Documento;
import br.com.octa.repository.DocumentoRepository;
import br.com.octa.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoRepository documentoRepository;

	@Override
	public Documento getDocumeto(String chave) {
		return documentoRepository.findByChave(chave);
	}

	@Override
	public Boolean saveDocumentos(List<Documento> documetos) {
		try {
			documentoRepository.saveAll(documetos);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Boolean save(Documento documeto) {
		try {
			documentoRepository.save(documeto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
