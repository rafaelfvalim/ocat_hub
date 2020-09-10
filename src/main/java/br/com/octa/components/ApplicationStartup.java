package br.com.octa.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import br.com.octa.service.FileWatcherService;
import br.com.octa.service.SAPService;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	public FileWatcherService fileWatcherService;

	@Autowired
	public SAPService sapService;

	@Autowired
	public AppProperties appProperties;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		if (appProperties.getEnableFolderWatch())
			fileWatcherService.eventFolder();
		
		
		if (appProperties.getStartSapServer())
			sapService.startServer();

	}
}