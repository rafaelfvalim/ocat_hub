package br.com.octa.service.impl;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.springframework.stereotype.Service;

import br.com.octa.form.ChangePassWordSapUserForm;
import br.com.octa.sap.BapiRet2;
import br.com.octa.sap.OctaResetPassword;
import br.com.octa.sap.SusrUserChangePasswordRfc;
import br.com.octa.sap.UserLock;
import br.com.octa.sap.UserUnlock;
import br.com.octa.service.SapSu01Service;

@Service
public class SapSu01ServiceImpl implements SapSu01Service {

	@Override
	public SessionManager createSessionManager() {
		AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
		return configuration.buildSessionManager();
	}

	@Override
	public String changePassword(ChangePassWordSapUserForm user) {

		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();

		try {
			SusrUserChangePasswordRfc sUser = user.toSusrUserChangePasswordRfc();
			session.execute(sUser);
			BapiRet2 returnStruct = (BapiRet2) sUser.getReturnData();
			return returnStruct.toString();

		} finally {
			session.close();
		}

	}

	@Override
	public String unlockUser(String userId) {
		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();
		try {
			UserUnlock userUnlock = new UserUnlock(userId);
			session.execute(userUnlock);
			return userUnlock.toString();
		} finally {
			session.close();
		}

	}

	@Override
	public String lockUser(String userId) {
		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();
		try {
			UserLock userLock = new UserLock(userId);
			session.execute(userLock);
			return userLock.toString();
		} finally {
			session.close();
		}

	}

	@Override
	public String resetPassword(String userId) {
		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();
		try {
			OctaResetPassword resetPass = new OctaResetPassword(userId);
			session.execute(resetPass);
			StringBuilder ret = new StringBuilder();
			for (br.com.octa.sap.BapiRet2 bapiret : resetPass.getReturnData()) {
				ret.append(bapiret.toString());
			}
			ret.append(resetPass.getNewPassword());
			return ret.toString();
		} finally {
			session.close();
		}
	}

}
