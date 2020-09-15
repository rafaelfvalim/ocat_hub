package br.com.octa.sap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import lombok.Data;

@Data
@BapiStructure
public class BapiPwd {

	@Parameter("BAPIPWD")
	private String Bapipwd;

	public BapiPwd() {

	}

	public BapiPwd(String bapipwd) {
		this.Bapipwd = bapipwd;
	}

}
