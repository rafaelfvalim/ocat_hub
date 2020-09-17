package br.com.octa.sap.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.modelmapper.ModelMapper;

import br.com.octa.sap.WpInfo;
import groovy.transform.ToString;
import lombok.Data;
@ToString
@Data
public class WpInfoDto {
	private String Wptotlinfo;

	private String WpNo;

	private int WpItype;

	private String WpTyp;

	private String WpPid;

	private int WpIstatus;

	private String WpStatus;

	private int WpIwait;

	private String WpWaiting;

	private String WpSem;

	private int WpIrestrt;

	private String WpRestart;

	private String WpDumps;

	private String WpCpu;

	private String WpEltime;

	private String WpMandt;

	private String WpBname;

	private String WpReport;

	private int WpIaction;

	private String WpAction;

	private String WpTable;

	private String WpServer;

	private String WpWaitinf;

	private String WpWaittim;

	private int WpSemstat;

	private int WpIndex;

	private int WpSem1;

	private int WpSem2;

	private int WpSem3;

	private int WpSem4;

	private int WpSem5;

	private int WpSemLocking;

	private int WpMtx;

	private int WpMtxExcl;

	private int WpMtxShrd;

	private Date Startdate;

	private Date Starttime;

	private String Dynpronr;

	private String Tcode;

	private String Cuaprogram;

	private String Fcode;

	private String Btcjobname;

	private String Btcjobcnt;

	private BigDecimal Memsum;

	private BigDecimal Privsum;

	public WpInfoDto toDto(WpInfo wp) {
		ModelMapper mappper = new ModelMapper();
		return mappper.map(wp, WpInfoDto.class);
	}

}
