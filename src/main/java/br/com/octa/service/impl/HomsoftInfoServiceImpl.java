package br.com.octa.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.hibersap.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.octa.sap.OctaCoundDoc;
import br.com.octa.sap.dto.HomsoftDocCountDto;
import br.com.octa.service.HibersapService;
import br.com.octa.service.HomsoftInfoService;
@Service
public class HomsoftInfoServiceImpl implements HomsoftInfoService {

	@Autowired
	HibersapService hibersap;

	@Override
	public List<HomsoftDocCountDto> getCountDoc(Date dataDe, Date dataAte) {

		Session session = hibersap.createSession();
		try {
			OctaCoundDoc info = new OctaCoundDoc();
			info.setDateDe(dataDe);
			info.setDateAte(dataAte);
			session.execute(info);
			return info.getItDoc().stream().map(HomsoftDocCountDto::new).collect(Collectors.toList());
		} finally {
			session.close();
		}

	}

}
