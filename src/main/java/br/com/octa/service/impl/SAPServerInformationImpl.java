package br.com.octa.service.impl;

import java.util.List;
import java.util.Map;

import org.hibersap.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.sap.StumWpServerActivity;
import br.com.octa.sap.WpInfo;
import br.com.octa.service.HibersapService;
import br.com.octa.service.SAPServerInformation;

@Service
public class SAPServerInformationImpl implements SAPServerInformation {

	@Autowired
	HibersapService hibersap;

	@Override
	public Map<String, String> getServerInformation() {
		Session session = hibersap.createSession();
		try {
			StumWpServerActivity info =  new StumWpServerActivity();
			session.execute(info);
			 List<WpInfo> list =  info.getWpInfo();
			 for (WpInfo wpInfo : list) {
				 System.out.println(wpInfo.toString());
			}
			
			return null;

		} finally {
			session.close();
		}

	}


}
