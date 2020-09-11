package br.com.octa.service.impl;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.components.AppProperties;
import br.com.octa.schema.nfe.TNfeProc;
import br.com.octa.service.FileWatcherService;
import br.com.octa.service.XmlNFeService;

@Service
public class FileWatcherServiceImpl implements FileWatcherService {
	Logger logger = LogManager.getLogger(FileWatcherServiceImpl.class);

	@Autowired
	public AppProperties appProperties;

	@Autowired
	public XmlNFeService xmlNFeService;

	@Override
	public void eventFolder() {
		try {
			WatchService watcher = FileSystems.getDefault().newWatchService();
			Path dir = Paths.get(appProperties.getFolderWatch());

			dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			System.out.println("Watch Service registered for dir: " + dir.getFileName());

			WatchKey key;
			while ((key = watcher.take()) != null) {
				for (WatchEvent<?> event : key.pollEvents()) {

					WatchEvent.Kind<?> kind = event.kind();

					@SuppressWarnings("unchecked")
					WatchEvent<Path> ev = (WatchEvent<Path>) event;
					Path fileName = ev.context();

					if (kind == ENTRY_CREATE) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						logger.info("New File Added, file Name " + fileName);
						onEntryCreate(fileName);
					}
					if (kind == ENTRY_DELETE) {

						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
//						logger.info("File Deleted " + fileName);
						onEntryDelete(fileName);
					}

					if (kind == ENTRY_MODIFY) {

						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
//						logger.info("File Modified " + fileName);
						onEntryModify(fileName);
					}
				}

				boolean valid = key.reset();
				if (!valid) {
					break;
				}
			}

		} catch (IOException | InterruptedException ex) {
			System.err.println(ex);
		}
	}

	@Override
	public void onEntryCreate(Path fileName) {
		try {
			File file = new File(appProperties.getFolderWatch() + "/" + fileName.toString());
			String xml = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
			TNfeProc nfe = xmlNFeService.toObject(xml);
			logger.info(nfe.getProtNFe().getInfProt().getChNFe());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onEntryModify(Path fileName) {
		
	}

	@Override
	public void onEntryDelete(Path fileName) {

	}

}
