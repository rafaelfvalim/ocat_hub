package br.com.octa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import br.com.octa.service.SAPService;

@SpringBootApplication
public class OctaApplication {


	@Autowired
	public SAPService sapService;
	
	public static void main(String[] args) {
		SpringApplication.run(OctaApplication.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void startSapServer() {
		sapService.startServer();
	}
	

}
