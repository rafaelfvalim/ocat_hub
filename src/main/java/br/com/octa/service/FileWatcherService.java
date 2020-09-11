package br.com.octa.service;

import java.nio.file.Path;

public interface FileWatcherService {

	public void eventFolder();
	public void onEntryCreate(Path fileName);
	public void onEntryModify(Path fileName);
	public void onEntryDelete(Path fileName);
}
