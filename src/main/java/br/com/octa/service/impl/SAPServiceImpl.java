package br.com.octa.service.impl;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.SessionManager;
import org.springframework.stereotype.Service;

import com.sap.conn.jco.server.JCoServerState;

import br.com.octa.sap.server.Server;
import br.com.octa.service.SAPService;

@Service
public class SAPServiceImpl implements SAPService {

	@Override
	public SessionManager createSessionManager() {
		AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
		return configuration.buildSessionManager();
	}

	@Override
	public Boolean startServer() {
		Server server = Server.getInstance();
		return server.start();
	}

	@Override
	public void stoptServer() {
		Server server = Server.getInstance();
		server.stop();
	}

	@Override
	public JCoServerState getServerStatus() {
		Server server = Server.getInstance();
		return  server.getServerStatus();
	}

}
