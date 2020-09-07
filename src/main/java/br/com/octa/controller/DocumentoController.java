package br.com.octa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.octa.service.FlightService;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

	@Autowired
	public FlightService flightService;

	@GetMapping("/flights")
	public void flights() {
		flightService.showFlightList();
	}
    
	@GetMapping("/")
	public String olaMudo() {
		return "Olá Mundo";
	}
}
