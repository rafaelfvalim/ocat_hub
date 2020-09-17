package br.com.octa.sap;

import java.util.Date;
import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Export;
import org.hibersap.annotations.Import;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.ParameterType;

import lombok.Data;

@Data
@Bapi("ZOCTA_HOMSOFT_DOCS")
public class OctaCoundDoc {
	@Import
	@Parameter("DATA_DE")
	public Date dateDe;
	@Import
	@Parameter("DATA_ATE")
	public Date dateAte;
	@Export
	@Parameter( value = "IT_DOC",  type = ParameterType.TABLE_STRUCTURE)
	public List<ItDoc> itDoc;
	
}
