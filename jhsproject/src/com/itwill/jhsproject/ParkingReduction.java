package com.itwill.jhsproject;

import static com.itwill.jhsproject.OracleJdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParkingReduction {

	public static final class Entity {
		public static final String TBL_REDU = "PARKING_REDUCTION";
		public static final String COL_R_NAME= "R_NAME";
		public static final String COL_R_RATIO = "R_RATIO";
	}
	
	private Integer cNredu;
	private String rName;
	private Double rRatio;
	
	public ParkingReduction() {}
	
	public ParkingReduction(Integer cNredu, String rName, Double rRatio) {
		this.cNredu = cNredu;
		this.rName = rName;
		this.rRatio = rRatio;
	}


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
	
	public static ParkingReductionBuilder builder() {
		return new ParkingReductionBuilder();
	}
	
	public static class ParkingReductionBuilder {
		private Integer cNredu;
		private String rName;
		private Double rRatio;
		
		private ParkingReductionBuilder() {}
		
		public ParkingReductionBuilder cNredu(Integer cNredu) {
			this.cNredu = cNredu;
			return this;
		}
		
		public ParkingReductionBuilder rName(String rName) {
			this.rName = rName;
			return this;
		}
		
		public ParkingReductionBuilder rRatio(Double rRatio) {
			this.rRatio = rRatio;
			return this;
		}
		
		public ParkingReduction build() {
			return new ParkingReduction(cNredu, rName, rRatio);
		}
	}
}
