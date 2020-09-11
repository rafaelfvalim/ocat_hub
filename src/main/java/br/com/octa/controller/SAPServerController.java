package br.com.octa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.octa.service.SAPService;

@RestController
@RequestMapping("/Server")
public class SAPServerController {

	@Autowired
	public SAPService SAPService;

	@GetMapping("/start")
	public String starServer() {
		if (SAPService.startServer()) {
			return "Server started";
		}
		return "Server not started";
	}

	@GetMapping("/stop")
	public String stopServer() {
		SAPService.stoptServer();
		return "Server stop";
	}
}
