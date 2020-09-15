package br.com.octa.sap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@BapiStructure
public class BapiPwdx {

	@Parameter("BAPIPWD")
	private String Bapipwd;

	public BapiPwdx() {

	}

	public BapiPwdx(String bapipwd) {
		this.Bapipwd = bapipwd;
	}

}
