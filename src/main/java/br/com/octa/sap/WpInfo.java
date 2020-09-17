package br.com.octa.sap;

import java.math.BigDecimal;
import java.util.Date;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;
import org.modelmapper.ModelMapper;

import br.com.octa.sap.dto.WpInfoDto;
import lombok.Data;
@Data
@BapiStructure
public class WpInfo {

	@Parameter("WPTOTLINFO")
	private String Wptotlinfo;

	@Parameter("WP_NO")
	private String WpNo;

	@Parameter("WP_ITYPE")
	private int WpItype;

	@Parameter("WP_TYP")
	private String WpTyp;

	@Parameter("WP_PID")
	private String WpPid;

	@Parameter("WP_ISTATUS")
	private int WpIstatus;

	@Parameter("WP_STATUS")
	private String WpStatus;

	@Parameter("WP_IWAIT")
	private int WpIwait;

	@Parameter("WP_WAITING")
	private String WpWaiting;

	@Parameter("WP_SEM")
	private String WpSem;

	@Parameter("WP_IRESTRT")
	private int WpIrestrt;

	@Parameter("WP_RESTART")
	private String WpRestart;

	@Parameter("WP_DUMPS")
	private String WpDumps;

	@Parameter("WP_CPU")
	private String WpCpu;

	@Parameter("WP_ELTIME")
	private String WpEltime;

	@Parameter("WP_MANDT")
	private String WpMandt;

	@Parameter("WP_BNAME")
	private String WpBname;

	@Parameter("WP_REPORT")
	private String WpReport;

	@Parameter("WP_IACTION")
	private int WpIaction;

	@Parameter("WP_ACTION")
	private String WpAction;

	@Parameter("WP_TABLE")
	private String WpTable;

	@Parameter("WP_SERVER")
	private String WpServer;

	@Parameter("WP_WAITINF")
	private String WpWaitinf;

	@Parameter("WP_WAITTIM")
	private String WpWaittim;

	@Parameter("WP_SEMSTAT")
	private int WpSemstat;

	@Parameter("WP_INDEX")
	private int WpIndex;

	@Parameter("WP_SEM1")
	private int WpSem1;

	@Parameter("WP_SEM2")
	private int WpSem2;

	@Parameter("WP_SEM3")
	private int WpSem3;

	@Parameter("WP_SEM4")
	private int WpSem4;

	@Parameter("WP_SEM5")
	private int WpSem5;

	@Parameter("WP_SEM_LOCKING")
	private int WpSemLocking;

	@Parameter("WP_MTX")
	private int WpMtx;

	@Parameter("WP_MTX_EXCL")
	private int WpMtxExcl;

	@Parameter("WP_MTX_SHRD")
	private int WpMtxShrd;

	@Parameter("STARTDATE")
	private Date Startdate;

	@Parameter("STARTTIME")
	private Date Starttime;

	@Parameter("DYNPRONR")
	private String Dynpronr;

	@Parameter("TCODE")
	private String Tcode;

	@Parameter("CUAPROGRAM")
	private String Cuaprogram;

	@Parameter("FCODE")
	private String Fcode;

	@Parameter("BTCJOBNAME")
	private String Btcjobname;

	@Parameter("BTCJOBCNT")
	private String Btcjobcnt;

	@Parameter("MEMSUM")
	private BigDecimal Memsum;

	@Parameter("PRIVSUM")
	private BigDecimal Privsum;


	public WpInfoDto getDto() {
		ModelMapper mappper = new ModelMapper();
		return mappper.map(this, WpInfoDto.class);
	}

	@Override
	public String toString() {
		return "WpInfo [Wptotlinfo=" + Wptotlinfo + ", WpNo=" + WpNo + ", WpItype=" + WpItype + ", WpTyp=" + WpTyp
				+ ", WpPid=" + WpPid + ", WpIstatus=" + WpIstatus + ", WpStatus=" + WpStatus + ", WpIwait=" + WpIwait
				+ ", WpWaiting=" + WpWaiting + ", WpSem=" + WpSem + ", WpIrestrt=" + WpIrestrt + ", WpRestart="
				+ WpRestart + ", WpDumps=" + WpDumps + ", WpCpu=" + WpCpu + ", WpEltime=" + WpEltime + ", WpMandt="
				+ WpMandt + ", WpBname=" + WpBname + ", WpReport=" + WpReport + ", WpIaction=" + WpIaction
				+ ", WpAction=" + WpAction + ", WpTable=" + WpTable + ", WpServer=" + WpServer + ", WpWaitinf="
				+ WpWaitinf + ", WpWaittim=" + WpWaittim + ", WpSemstat=" + WpSemstat + ", WpIndex=" + WpIndex
				+ ", WpSem1=" + WpSem1 + ", WpSem2=" + WpSem2 + ", WpSem3=" + WpSem3 + ", WpSem4=" + WpSem4
				+ ", WpSem5=" + WpSem5 + ", WpSemLocking=" + WpSemLocking + ", WpMtx=" + WpMtx + ", WpMtxExcl="
				+ WpMtxExcl + ", WpMtxShrd=" + WpMtxShrd + ", Startdate=" + Startdate + ", Starttime=" + Starttime
				+ ", Dynpronr=" + Dynpronr + ", Tcode=" + Tcode + ", Cuaprogram=" + Cuaprogram + ", Fcode=" + Fcode
				+ ", Btcjobname=" + Btcjobname + ", Btcjobcnt=" + Btcjobcnt + ", Memsum=" + Memsum + ", Privsum="
				+ Privsum + "]";
	}
	
	

}
