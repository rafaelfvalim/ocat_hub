package br.com.octa.components;

import org.springframework.boot.actuate.info.Info.Builder;

import java.util.HashMap;

import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
@Component
public class InfoService implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
	
			HashMap<String, Integer>  teste = new HashMap<String, Integer>();
			
			teste.put("ZHMS_TESTE1", 1);
			builder.withDetail("SAP", teste);
		
	}

}
