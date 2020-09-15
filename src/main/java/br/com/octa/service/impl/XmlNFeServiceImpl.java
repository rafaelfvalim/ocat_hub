package br.com.octa.service.impl;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import br.com.octa.schema.nfe.ObjectFactory;
import br.com.octa.schema.nfe.TNfeProc;
import br.com.octa.service.XmlNFeService;

@Service
public class XmlNFeServiceImpl implements XmlNFeService {

	@Override
	public TNfeProc toObject(String xml) {
		try {
			JAXBContext context = JAXBContext.newInstance("br.com.octa.schema.nfe");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			JAXBElement<TNfeProc> element = (JAXBElement<TNfeProc>) unmarshaller.unmarshal(new StringReader(xml));
			return element.getValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toXml(TNfeProc nfe) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("br.inf.portalfiscal.nfe");
		Marshaller marshaller = context.createMarshaller();
		JAXBElement<TNfeProc> element = new ObjectFactory().createNfeProc(nfe);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

		StringWriter sw = new StringWriter();
		marshaller.marshal(element, sw);
		String sw_aux = sw.toString();
		/*
		 * Correção do erro de namespace
		 */
		sw_aux = sw_aux.replaceAll("xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
		return sw_aux;
	}

}
