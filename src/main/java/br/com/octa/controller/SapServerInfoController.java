package br.com.octa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.octa.service.SAPServerInformation;

@RestController
@RequestMapping("/info")
public class SapServerInfoController {

	@Autowired
	SAPServerInformation sapServerInformation;
	
	@RequestMapping("/sap/programs")
	public void getWpinfo(String userId) {
		sapServerInformation.getServerInformation();
	}
	
}
