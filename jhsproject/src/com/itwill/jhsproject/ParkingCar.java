package com.itwill.jhsproject;

import java.time.LocalDateTime;

public class ParkingCar {

	public static final class Entity {
		public static final String TBL_AREA = "PARKING_AREA";
		public static final String TBL_INFO = "PARKING_INFO";
		public static final String TBL_REDU = "PARKING_REDUTION";
		public static final String COL_P_AREA = "P_AREA";
		public static final String COL_P_CHECK = "P_CHECK";
		public static final String COL_C_NUM = "C_NUM";
		public static final String COL_C_ENTRA = "C_ENTRA";
		public static final String COL_C_NREDU = "C_NREDU";
		public static final String COL_C_EXIT = "C_EXIT";
		public static final String COL_C_PTIME = "C_PTIME";
		public static final String COL_C_PFEE = "C_PFEE";
		public static final String COL_R_NAME= "R_NAME";
		public static final String COL_R_RATIO = "R_RATIO";
	}
	
	private String pArea;
	private Integer pCheck;
	private String cNum;
	private LocalDateTime cEntra;
	private Integer cNredu;
	private LocalDateTime cExit;
	private LocalDateTime pTime;
	private Double cPfee;
	private String rName;
	private Double rRatio;
	
	public ParkingCar() {}

	public ParkingCar(String pArea, Integer pCheck, String cNum, LocalDateTime cEntra, Integer cNredu,
			LocalDateTime cExit, LocalDateTime pTime, Double cPfee, String rName, Double rRatio) {
		this.pArea = pArea;
		this.pCheck = pCheck;
		this.cNum = cNum;
		this.cEntra = cEntra;
		this.cNredu = cNredu;
		this.cExit = cExit;
		this.pTime = pTime;
		this.cPfee = cPfee;
		this.rName = rName;
		this.rRatio = rRatio;
	}

	public String getpArea() {
		return pArea;
	}

	public void setpArea(String pArea) {
		this.pArea = pArea;
	}

	public Integer getpCheck() {
		return pCheck;
	}

	public void setpCheck(Integer pCheck) {
		this.pCheck = pCheck;
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

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public Double getrRatio() {
		return rRatio;
	}

	public void setrRatio(Double rRatio) {
		this.rRatio = rRatio;
	}

	@Override
	public String toString() {
		return "ParkingModel [pArea=" + pArea + ", pCheck=" + pCheck + ", cNum=" + cNum + ", cEntra=" + cEntra
				+ ", cNredu=" + cNredu + ", cExit=" + cExit + ", pTime=" + pTime + ", cPfee=" + cPfee + ", rName="
				+ rName + ", rRatio=" + rRatio + "]";
	}
}
