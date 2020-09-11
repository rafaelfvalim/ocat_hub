package br.com.octa.service;

import br.com.octa.model.Acao;

public interface AcaoService {

	public Acao getAcao(String id);
	public void setAcao(String id);
	public Acao criar(Acao acao);
	public void apagar(String id);
	
}
