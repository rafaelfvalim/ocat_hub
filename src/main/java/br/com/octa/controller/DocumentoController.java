package br.com.octa.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.octa.model.Documento;
import br.com.octa.schema.nfe.TNfeProc;
import br.com.octa.service.DocumentoService;
import br.com.octa.service.FlightService;
import br.com.octa.service.XmlNFeService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

	@Autowired
	public FlightService flightService;
	
	@Autowired
	public XmlNFeService XmlNFeService;
	
	@Autowired
	public DocumentoService documentoService;

	@GetMapping("/flights")
	public void flights() {
		flightService.showFlightList();
	}

	@GetMapping("/")
	public String olaMudo() {
		Path path = Paths.get("C:/temp/42200701625708000524550010000083431012474818.xml");
		 
	    try {
			String xml = Files.readAllLines(path).get(0);
			TNfeProc nfe = XmlNFeService.toObject(xml);
			return nfe.getNFe().getInfNFe().getDest().getCNPJ();	
	    } catch (IOException e) {
			e.printStackTrace();
		}
		
	    return "Octa Hub";
	}

	@GetMapping("/getDocumento/chave/{chave}")
	public Documento getDocumento(@PathVariable String chave) {
		return documentoService.getDocumeto(chave);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/processados")
	public Boolean setProcessado(@RequestBody List<Documento> documentos) {
		return documentoService.saveDocumentos(documentos);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/processado")
	public Boolean setProcessado(@RequestBody  Documento documentos) {
		return documentoService.save(documentos);
	}


}
