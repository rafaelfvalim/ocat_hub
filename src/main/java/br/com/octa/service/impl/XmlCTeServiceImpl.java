package br.com.octa.service.impl;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import br.com.octa.schema.cte.CteProc;
import br.com.octa.schema.cte.ObjectFactory;
import br.com.octa.service.XmlCteService;

@Service
public class XmlCTeServiceImpl implements XmlCteService {

	@Override
	public CteProc toObject(String xml) {
		try {
			JAXBContext context = JAXBContext.newInstance("br.com.octa.schema.cte");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			JAXBElement<CteProc > element = (JAXBElement<CteProc>) unmarshaller.unmarshal(new StringReader(xml));
			return element.getValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String toXml(CteProc cte) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("br.com.octa.schema.cte");
		Marshaller marshaller = context.createMarshaller();
		JAXBElement<CteProc > element = new ObjectFactory().createCteProc(cte);
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
