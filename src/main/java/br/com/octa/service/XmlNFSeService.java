package br.com.octa.service;

import javax.xml.bind.JAXBException;

import br.com.octa.schema.nfse.RfeNfse;

public interface XmlNFSeService {

	public RfeNfse toObject(String xml);
	public String toXml(RfeNfse nfse) throws JAXBException;
}
