package br.com.octa.sap;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Convert;
import org.hibersap.annotations.Parameter;
import org.hibersap.conversion.CharConverter;

@BapiStructure
public class BapiRet2 {

    @Parameter("TYPE")
    @Convert(converter = CharConverter.class)
    private char type;

    @Parameter("ID")
    private String id;

    @Parameter("NUMBER")
    private String number;

    @Parameter("MESSAGE")
    private String message;

    public char getType() { return this.type; }

    public String getId() { return this.id; }

    public String getNumber() { return this.number; }

    public String getMessage() { return this.message; }

	@Override
	public String toString() {
		return "BapiRet2 [type=" + type + ", id=" + id + ", number=" + number + ", message=" + message + "]";
	}

	public BapiRet2(char type, String id, String number, String message) {
		super();
		this.type = type;
		this.id = id;
		this.number = number;
		this.message = message;
	}
	
	public BapiRet2(org.hibersap.bapi.BapiRet2 ret) {
		this.type = ret.getType();
		this.id = ret.getId();
		this.number = ret.getNumber();
		this.message = ret.getMessage();
	}
	
	
	
    
   
}