package br.com.octa.service;

import org.hibersap.session.SessionManager;
import org.springframework.stereotype.Service;

import br.com.octa.form.ChangePassWordSapUserForm;

@Service
public interface SapSu01Service {

	public String changePassword(ChangePassWordSapUserForm user);
	public String unlockUser(String userId);
	public String lockUser(String userId);
	public SessionManager createSessionManager();

}
