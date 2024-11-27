package com.itwill.jhsproject;

import static com.itwill.jhsproject.ParkingInfo.Entity.*;
import static com.itwill.jhsproject.ParkingArea.Entity.*;
import static com.itwill.jhsproject.ParkingReduction.Entity.*;
import static com.itwill.jhsproject.OracleJdbc.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleDriver;
import oracle.sql.DATE;

import com.itwill.jhsproject.ParkingArea;
import com.itwill.jhsproject.ParkingInfo;
import com.itwill.jhsproject.ParkingReduction;

public enum ParkingDao {

	INSTANCE;
	
	ParkingDao() {
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void closeResource(Connection conn, PreparedStatement stmt, ResultSet rs) {
		if(rs != null)
			try {
				rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private void closeResource(Connection conn, PreparedStatement stmt) {
		closeResource(conn, stmt, null);
	}
	
	public LocalDateTime dateToLocalDateTime(Date date) {
		if(date == null) return null;
		LocalDateTime localDateTime = new Timestamp(date.getTime()).toLocalDateTime();
		return localDateTime;
	}
	
	private ParkingArea getParkingAreafromResultSet(ResultSet rs) throws SQLException {
		String pArea = rs.getString(COL_P_AREA);
		Integer pCheck = rs.getInt(COL_P_CHECK);
		String cNum = rs.getString(COL_C_NUM);
		
		return ParkingArea.builder().pArea(pArea).pCheck(pCheck).cNum(cNum).build();
	}
	
	private ParkingInfo getParkingInfofromResultSet(ResultSet rs) throws SQLException {
		String cNum = rs.getString(COL_C_NUM);
		Long cEntra = rs.getLong(COL_C_ENTRA);
		Integer cNredu = rs.getInt(COL_C_NREDU);
		Long cExit = rs.getLong(COL_C_EXIT);
		Long pTime = rs.getLong(COL_C_PTIME);
		Double pFee = rs.getDouble(COL_C_PFEE);
		
		
		return ParkingInfo.builder().cNum(cNum).cEntra(cEntra).cNredu(cNredu).cExit(cExit).pTime(pTime).cPfee(pFee).build();
	}
	
	private static final String SQL_CREATE_INFO = String.format(
			"insert into %s (%s, %s, %s) values (?, ?, ?)", 
			TBL_INFO, COL_C_NUM, COL_C_ENTRA, COL_C_NREDU);
	
	public int regiInfo(ParkingInfo pInfo) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_CREATE_INFO);
			
			stmt.setString(1, pInfo.getcNum());
			stmt.setLong(2, System.currentTimeMillis());
			stmt.setInt(3, pInfo.getcNredu());
			
			result = stmt.executeUpdate();
			
			
		} catch (SQLIntegrityConstraintViolationException e){
			return result = 2;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt);
		}
		return result;
	}
	
	private static final String SQL_CREATE_AREA = String.format(
			"update %s set %s = ?, %s = ? where %s = ?", 
			TBL_AREA, COL_P_CHECK, COL_C_NUM, COL_P_AREA);
	 // 
	public int regiArea(ParkingArea pArea) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_CREATE_AREA);
			
			stmt.setInt(1, pArea.getpCheck());
			stmt.setString(2, pArea.getcNum());
			stmt.setString(3, pArea.getpArea());
			
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt);
		}
		return result;
	}
	
//	private static final String SQL_UPDATE_INFO_EXIT = String.format(
//			"update  %s "
//			+ "set     %s = sysdate, %s = %s - sysdate, %s = ? "
//			+ "where   %s = ?"
//			,TBL_INFO, COL_C_EXIT, COL_C_PTIME, COL_C_ENTRA, COL_C_PFEE, COL_C_NUM);
	
	private static final String SQL_UPDATE_INFO_EXIT = String.format(
			"update  %s "
			+ "set     %s = ? , %s = (%s - ?) / (-60000) "
			+ "where   %s = ?"
			,TBL_INFO, COL_C_EXIT, COL_C_PTIME, COL_C_ENTRA, COL_C_NUM);
	
	public int updateInfo(ParkingInfo pInfo) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_UPDATE_INFO_EXIT);
			stmt.setLong(1, System.currentTimeMillis());
			stmt.setLong(2, System.currentTimeMillis());
			stmt.setString(3, pInfo.getcNum());
			result = stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt);
		}
		return result;
	}
	
	private static final String SQL_SELECT_AREA = String.format(
			"select * from %s", TBL_AREA);
	
	public List<ParkingArea> readArea() {
		List<ParkingArea> pAreas = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_SELECT_AREA);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				ParkingArea pArea = getParkingAreafromResultSet(rs);
				pAreas.add(pArea);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt, rs);
		}
		return pAreas;
	}
	
	private static final String SQL_SELECT_INFO = String.format(
			"select i.%s, j.%s, i.%s, j.%s\n"
			+ "from %s i join %s j on i.%s = j.%s" ,
			COL_C_NUM, COL_R_NAME, COL_C_ENTRA, COL_R_RATIO, TBL_INFO, TBL_REDU, COL_C_NREDU, COL_C_NREDU);
	
	public List<ParkingInfo> readInfo() {
		List<ParkingInfo> pInfos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_SELECT_INFO);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				ParkingInfo pInfo = getParkingInfofromResultSet(rs);
				pInfos.add(pInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt, rs);
		}
		return pInfos;
	}
	
	private static final String SQL_SELECT_INFO_BY_C_NUM = String.format(
			"select * from %s where upper(%s) = ?", TBL_INFO, COL_C_NUM);
	
	public ParkingInfo readInfo(String content) {
		ParkingInfo pInfo = new ParkingInfo();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.prepareStatement(SQL_SELECT_INFO_BY_C_NUM);
			
			stmt.setString(1, content.toUpperCase());
			rs = stmt.executeQuery();
			if(rs.next()) pInfo = getParkingInfofromResultSet(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResource(conn, stmt, rs);
		}
		return pInfo;
	}
}
