package com.itwill.jhsproject;

import java.sql.Timestamp;
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
	private Long cEntra;
	private Integer cNredu;
	private Long cExit;
	private Long pTime;
	private Double cPfee;
	
	public ParkingInfo() {}

	public ParkingInfo(String cNum, Long cEntra, Integer cNredu,
			Long cExit, Long pTime, Double cPfee) {
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

	public Long getcEntra() {
		return cEntra;
	}

	public void setcEntra(Long cEntra) {
		this.cEntra = cEntra;
	}

	public Integer getcNredu() {
		return cNredu;
	}

	public void setcNredu(Integer cNredu) {
		this.cNredu = cNredu;
	}

	public Long getcExit() {
		return cExit;
	}

	public void setcExit(Long cExit) {
		this.cExit = cExit;
	}

	public Long getpTime() {
		return pTime;
	}

	public void setpTime(Long pTime) {
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
	
	public static ParkingInfoBuilder builder() {
		return new ParkingInfoBuilder();
	}
	
	public static class ParkingInfoBuilder {
		private String cNum;
		private Long cEntra;
		private Integer cNredu;
		private Long cExit;
		private Long pTime;
		private Double cPfee;
		
		private ParkingInfoBuilder() {}
		
		public ParkingInfoBuilder cNum(String cNum) {
			this.cNum = cNum;
			return this;
		}
		public ParkingInfoBuilder cEntra(Long cEntra) {
			this.cEntra = cEntra;
			return this;
		}
		public ParkingInfoBuilder cNredu(Integer cNredu) {
			this.cNredu = cNredu;
			return this;
		}
		public ParkingInfoBuilder cExit(Long cExit) {
			this.cExit = cExit;
			return this;
		}
		public ParkingInfoBuilder pTime(Long pTime) {
			this.pTime = pTime;
			return this;
		}
		public ParkingInfoBuilder cPfee(Double cPfee) {
			this.cPfee = cPfee;
			return this;
		}
		
		public ParkingInfo build() {
			return new ParkingInfo(cNum, cEntra, cNredu, cExit, pTime, cPfee);
		}
	}
}

