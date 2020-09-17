package br.com.octa.sap;

import java.util.List;
import java.util.stream.Collectors;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.bapi.BapiRet2;

import lombok.Data;

@Data
@Bapi("ZOCTA_RESET_PASSWORD")
public class OctaResetPassword {

	@Import
	@Parameter("USER")
	private String user;

	@Export
	@Parameter("NEW_PASSWORD")
	private String newPassword;

	@Export
	@Parameter(value = "RETURN", type = ParameterType.TABLE_STRUCTURE)
	private List<BapiRet2> returnData;

	public OctaResetPassword(String user) {
		this.user = user;
	}

	public List<br.com.octa.sap.BapiRet2> getReturnData() {
		return returnData.stream().map(br.com.octa.sap.BapiRet2::new).collect(Collectors.toList());
	}

}
