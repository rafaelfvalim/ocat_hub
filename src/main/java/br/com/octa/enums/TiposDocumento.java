package br.com.octa.enums;

public enum TiposDocumento {
	NFE("NFe"), CTE("CTe"), NFSE("NFSe");

	public String tipo;

	TiposDocumento(String tipo) {
		this.tipo = tipo;
	}
}
