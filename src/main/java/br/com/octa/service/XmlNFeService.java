package br.com.octa.service;

import br.com.octa.schema.nfe.TNfeProc;

public interface XmlNFeService {

	public TNfeProc toObject(String xml);
	public String toXml(TNfeProc nfe);
}
