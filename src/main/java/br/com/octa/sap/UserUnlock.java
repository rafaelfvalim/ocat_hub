package br.com.octa.sap;

import java.util.List;
import java.util.stream.Collectors;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.bapi.BapiRet2;
@Bapi("BAPI_USER_UNLOCK")
public class UserUnlock {
	
	@Import
	@Parameter("USERNAME")
	private String username;
	
	@Table
	@Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
	private List<BapiRet2> returnData;

	public UserUnlock(String username) {
		super();
		this.username = username;
	} 
	
	public  List<br.com.octa.sap.BapiRet2> getReturnData( ){
		return returnData.stream().map(br.com.octa.sap.BapiRet2::new).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "UserUnlock [returnData=" + getReturnData().stream().map(e -> e.toString()).reduce("", String::concat) + "]";
	}	
	
	
}
