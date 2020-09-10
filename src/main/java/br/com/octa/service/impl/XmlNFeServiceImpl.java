package br.com.octa.service.impl;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import br.com.octa.schema.nfe.TNfeProc;
import br.com.octa.service.XmlNFeService;

@Service	
public class XmlNFeServiceImpl implements XmlNFeService{

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
	public String toXml(TNfeProc nfe) {
		// TODO Auto-generated method stub
		return null;
	}

}
