package com.itwill.jhsproject;

public class ParkingArea {
	
	public static final class Entity {
		public static final String TBL_INFO = "PARKING_INFO";
		public static final String COL_P_AREA = "P_AREA";
		public static final String COL_P_CHECK = "P_CHECK";
		public static final String COL_C_NUM = "C_NUM";
	}
	
	private String pArea;
	private Integer pCheck;
	private Integer cNum;
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
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	
	@Override
	public String toString() {
		return "ParkingArea [pArea=" + pArea + ", pCheck=" + pCheck + ", cNum=" + cNum + "]";
	}
	
}
