package br.com.octa.sap;

import java.util.List;

import org.hibersap.annotations.Bapi;
import org.hibersap.annotations.Parameter;
import org.hibersap.annotations.Table;

import lombok.Data;
@Data
@Bapi("STUM_WP_SERVER_ACTIVITY")
public class StumWpServerActivity {

//	@Import
//	@Parameter("WITH_CPU")
//	private String withCpu;

	@Table
	@Parameter("WP_INFO")
	private List<WpInfo> wpInfo;
	
	public StumWpServerActivity() {}

	

}
