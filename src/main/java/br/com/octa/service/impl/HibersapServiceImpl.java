package br.com.octa.service.impl;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.springframework.stereotype.Service;

import br.com.octa.service.HibersapService;
@Service
public class HibersapServiceImpl implements HibersapService{

	@Override
	public Session createSession() {
		AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
		SessionManager sessionManager = configuration.buildSessionManager();
		return sessionManager.openSession();
	}

}
