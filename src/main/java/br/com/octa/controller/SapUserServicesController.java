package br.com.octa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pages")
public class SapUserServicesController {
	
	@GetMapping(value = "sap-user-services")
	public ModelMap index() {
		return new ModelMap().addAttribute("usuario", "DUMMY");
	}
	
}
