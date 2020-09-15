package br.com.octa.sap;

import java.util.List;
import java.util.stream.Collectors;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;
import org.hibersap.annotations.Table;
import org.hibersap.bapi.BapiRet2;

import lombok.Data;

@Data
@Bapi("BAPI_USER_CHANGE")
public class UserChangeBapi {
	@Import
	@Parameter("USERNAME")
	private String userName;

	@Import
	@Parameter( value = "PASSWORD", type = ParameterType.STRUCTURE )
	private BapiPwd password; 

	@Import
	@Parameter(value ="PASSWORDX", type = ParameterType.STRUCTURE)
	private BapiPwdx passwordx; 
	
	@Export
	@Parameter(value = "GENERATED_PASSWORD", type = ParameterType.STRUCTURE  )
	private BapiPwd newPassword;

	@Table
	@Parameter(value = "RETURN", type = ParameterType.STRUCTURE)
	private List<BapiRet2> returnData;

	public List<br.com.octa.sap.BapiRet2> getReturnData() {
		return returnData.stream().map(br.com.octa.sap.BapiRet2::new).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "UserLock [returnData=" + getReturnData().stream().map(e -> e.toString()).reduce("", String::concat)
				+ "]";
	}

	public UserChangeBapi(String userName) {
	
//		PasswordGeneratorHelper passwordGenerator = new PasswordGeneratorHelper.PasswordGeneratorBuilder()
//				.useDigits(true).useLower(true).useUpper(true).build();
		this.userName = userName;
		this.password = new BapiPwd("incial01");
		this.passwordx = new BapiPwdx("X");
	}

}
