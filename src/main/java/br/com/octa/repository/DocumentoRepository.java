package br.com.octa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.octa.model.Documento;

public interface DocumentoRepository extends MongoRepository<Documento, String> {

}
