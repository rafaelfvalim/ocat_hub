package br.com.octa.service;

import javax.xml.bind.JAXBException;

import br.com.octa.schema.cte.CteProc;

public interface XmlCteService {

	public CteProc toObject(String xml);
	public String toXml(CteProc cte) throws JAXBException;
}
