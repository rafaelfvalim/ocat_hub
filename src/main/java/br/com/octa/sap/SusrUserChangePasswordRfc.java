package br.com.octa.sap;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.bapi.BapiRet2;

import lombok.Getter;

@Bapi("SUSR_USER_CHANGE_PASSWORD_RFC")
public class SusrUserChangePasswordRfc {
	@Import
	@Parameter("BNAME")
	private final String bname;
	@Import
	@Parameter("PASSWORD")
	private final String password;
	@Import
	@Parameter("NEW_PASSWORD")
	private final String newPassword;
//	@Import
//	@Parameter("NEW_BCODE")
//	private final String newBcode;
//	@Import
//	@Parameter("NEW_CODVN")
//	private final String newCodvn;
//	@Import
//	@Parameter("USE_NEW_EXCEPTION")
//	private final Integer useNewExecption;
	@Import
	@Parameter("USE_BAPI_RETURN")
	private final Integer useBapiReturn;

	@Export
	@Parameter("PWD_CHANGE_SSO")
	private final Integer pwdChangeSso;

	@Export
	@Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
	private BapiRet2 returnData;
	
	public  br.com.octa.sap.BapiRet2 getReturnData( ){
		return new br.com.octa.sap.BapiRet2(returnData.getType(), returnData.getId(), returnData.getLogMsgNumber(),returnData.getMessage());
	}

	public SusrUserChangePasswordRfc(String bname, String password, String newPassword, Integer useBapiReturn) {

		this.pwdChangeSso = new Integer(1);
		this.bname = bname;
		this.password = password;
		this.newPassword = newPassword;
//		this.newBcode = newBcode;
//		this.newCodvn = newCodvn;
//		this.useNewExecption = useNewExecption;
		this.useBapiReturn = useBapiReturn;
	}

}
