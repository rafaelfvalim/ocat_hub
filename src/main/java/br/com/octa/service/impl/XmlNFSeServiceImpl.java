package br.com.octa.service.impl;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import br.com.octa.schema.nfse.ObjectFactory;
import br.com.octa.schema.nfse.RfeNfse;
import br.com.octa.service.XmlNFSeService;

@Service
public class XmlNFSeServiceImpl implements XmlNFSeService {

	@Override
	public RfeNfse toObject(String xml) {
		try {
			JAXBContext context = JAXBContext.newInstance("br.com.octa.schema.nfse");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			JAXBElement<RfeNfse> element = (JAXBElement<RfeNfse>) unmarshaller.unmarshal(new StringReader(xml));
			return element.getValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toXml(RfeNfse nfse) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance("br.com.octa.schema.nfse");
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML
		StringWriter xml = new StringWriter();
		jaxbMarshaller.marshal(nfse, xml);
		return xml.toString();
	}

}
