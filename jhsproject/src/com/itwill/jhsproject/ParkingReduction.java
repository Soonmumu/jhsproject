package com.itwill.jhsproject;

public class ParkingReduction {

	public static final class Entity {
		public static final String TBL_REDU = "PARKING_REDUTION";
		public static final String COL_C_NREDU = "C_NREDU";
		public static final String COL_R_NAME= "R_NAME";
		public static final String COL_R_RATIO = "R_RATIO";
	}
	
	private Integer cNredu;
	private String rName;
	private Double rRatio;
	public Integer getcNredu() {
		return cNredu;
	}
	public void setcNredu(Integer cNredu) {
		this.cNredu = cNredu;
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
		return "ParkingReduction [cNredu=" + cNredu + ", rName=" + rName + ", rRatio=" + rRatio + "]";
	}
	
}
