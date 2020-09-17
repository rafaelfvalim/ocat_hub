package br.com.octa.service;

import java.util.Map;

import org.hibersap.session.SessionManager;

public interface SAPServerInformation {

	public Map<String, String> getServerInformation(); 
}
