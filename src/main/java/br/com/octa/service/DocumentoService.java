package br.com.octa.service;

import java.util.List;

import br.com.octa.model.Documento;

public interface DocumentoService {
	
	public Documento getDocumeto(String chave);
	public Boolean saveDocumentos(List<Documento> documetos);
}
