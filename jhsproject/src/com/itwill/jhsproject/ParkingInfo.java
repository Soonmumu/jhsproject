package com.itwill.jhsproject;

import java.time.LocalDateTime;

public class ParkingInfo {

	public static final class Entity {
		public static final String TBL_INFO = "PARKING_INFO";
		public static final String COL_C_NUM = "C_NUM";
		public static final String COL_C_ENTRA = "C_ENTRA";
		public static final String COL_C_NREDU = "C_NREDU";
		public static final String COL_C_EXIT = "C_EXIT";
		public static final String COL_C_PTIME = "C_PTIME";
		public static final String COL_C_PFEE = "C_PFEE";
	}
	

	private String cNum;
	private LocalDateTime cEntra;
	private Integer cNredu;
	private LocalDateTime cExit;
	private LocalDateTime pTime;
	private Double cPfee;
	
	public ParkingInfo() {}

	public ParkingInfo(String cNum, LocalDateTime cEntra, Integer cNredu,
			LocalDateTime cExit, LocalDateTime pTime, Double cPfee) {
		this.cNum = cNum;
		this.cEntra = cEntra;
		this.cNredu = cNredu;
		this.cExit = cExit;
		this.pTime = pTime;
		this.cPfee = cPfee;
	}

	public String getcNum() {
		return cNum;
	}

	public void setcNum(String cNum) {
		this.cNum = cNum;
	}

	public LocalDateTime getcEntra() {
		return cEntra;
	}

	public void setcEntra(LocalDateTime cEntra) {
		this.cEntra = cEntra;
	}

	public Integer getcNredu() {
		return cNredu;
	}

	public void setcNredu(Integer cNredu) {
		this.cNredu = cNredu;
	}

	public LocalDateTime getcExit() {
		return cExit;
	}

	public void setcExit(LocalDateTime cExit) {
		this.cExit = cExit;
	}

	public LocalDateTime getpTime() {
		return pTime;
	}

	public void setpTime(LocalDateTime pTime) {
		this.pTime = pTime;
	}

	public Double getcPfee() {
		return cPfee;
	}

	public void setcPfee(Double cPfee) {
		this.cPfee = cPfee;
	}

	@Override
	public String toString() {
		return "ParkingInfo [cNum=" + cNum + ", cEntra=" + cEntra + ", cNredu=" + cNredu + ", cExit=" + cExit
				+ ", pTime=" + pTime + ", cPfee=" + cPfee + "]";
	}
}
