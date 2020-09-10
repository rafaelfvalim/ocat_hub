package br.com.octa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import br.com.octa.components.AppProperties;
import br.com.octa.service.FileWatcherService;
import br.com.octa.service.SAPService;

@SpringBootApplication
public class OctaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctaApplication.class, args);

	}


}
