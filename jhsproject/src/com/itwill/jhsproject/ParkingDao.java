package com.itwill.jhsproject;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

import com.itwill.jhsproject.ParkingInfo;

public enum ParkingDao {

	INSTANCE;
	
	ParkingDao () {
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
