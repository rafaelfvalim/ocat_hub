package br.com.octa.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.octa.model.Documento;

public interface DocumentoRepository extends CrudRepository<Documento, String> {
	public Documento findByChave(String chave); 
}
