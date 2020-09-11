package br.com.octa.service;

import org.hibersap.session.SessionManager;

import com.sap.conn.jco.server.JCoServerState;

public interface SAPService {
	public SessionManager createSessionManager(); 
	public Boolean startServer();
	public void stoptServer();
	public JCoServerState getServerStatus();
}
