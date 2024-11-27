package com.itwill.jhsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ParkingMainView {

	private JFrame frame;
	private JTextField exitCarField;
	private JLayeredPane layeredPane;
	private JButton btn1f01;
	private JLabel lblNewLabel;
	private JButton btn1f02;
	private JButton btn1f04;
	private JButton btn1f03;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnExitCar;
	private JButton btnNewButton_4;
	
	private ParkingDao dao;
	private JButton btn1f06;
	private JButton btn1f05;
	private JButton btn1f12;
	private JButton btn1f11;
	private JButton btn1f10;
	private JButton btn1f09;
	private JButton btn1f08;
	private JButton btn1f07;
	private JLabel lblParkingAreaCounting;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingMainView window = new ParkingMainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParkingMainView() {
		dao = ParkingDao.INSTANCE;
		initialize();
		initializeMain();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1068, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(30, 30, 600, 600);
		frame.getContentPane().add(layeredPane);
		
		btn1f01 = new JButton("주차가능");
		btn1f01.addActionListener(e -> regiCar("1f01"));
		btn1f01.setBorderPainted(false);
		btn1f01.setBackground(SystemColor.activeCaption);
		btn1f01.setForeground(new Color(255, 255, 255));
		btn1f01.setFont(new Font("D2Coding", Font.BOLD, 15));
		layeredPane.setLayer(btn1f01, 2);
		btn1f01.setBounds(24, 25, 179, 87);
		layeredPane.add(btn1f01);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\java157\\workspaces\\jhsproject\\jhsproject\\Parking_image.jpg"));
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(0, 0, 600, 600);
		layeredPane.add(lblNewLabel);
		
		btn1f02 = new JButton("주차가능");
		layeredPane.setLayer(btn1f02, 2);
		btn1f02.addActionListener(e -> regiCar("1f02"));
		btn1f02.setForeground(Color.WHITE);
		btn1f02.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f02.setBorderPainted(false);
		btn1f02.setBackground(SystemColor.activeCaption);
		btn1f02.setBounds(24, 119, 179, 87);
		layeredPane.add(btn1f02);
		
		btn1f04 = new JButton("주차가능");
		layeredPane.setLayer(btn1f04, 2);
		btn1f04.addActionListener(e -> regiCar("1f04"));
		btn1f04.setDisplayedMnemonicIndex(2);
		btn1f04.setForeground(Color.WHITE);
		btn1f04.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f04.setBorderPainted(false);
		btn1f04.setBackground(SystemColor.activeCaption);
		btn1f04.setBounds(24, 305, 179, 87);
		layeredPane.add(btn1f04);
		
		btn1f03 = new JButton("주차가능");
		layeredPane.setLayer(btn1f03, 2);
		btn1f03.addActionListener(e -> regiCar("1f03"));
		btn1f03.setDisplayedMnemonicIndex(2);
		btn1f03.setForeground(Color.WHITE);
		btn1f03.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f03.setBorderPainted(false);
		btn1f03.setBackground(SystemColor.activeCaption);
		btn1f03.setBounds(24, 212, 179, 87);
		layeredPane.add(btn1f03);
		
		btn1f05 = new JButton("주차가능");
		layeredPane.setLayer(btn1f05, 2);
		btn1f05.addActionListener(e -> regiCar("1f05"));
		btn1f05.setForeground(Color.WHITE);
		btn1f05.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f05.setDisplayedMnemonicIndex(2);
		btn1f05.setBorderPainted(false);
		btn1f05.setBackground(SystemColor.activeCaption);
		btn1f05.setBounds(24, 397, 179, 87);
		layeredPane.add(btn1f05);
		
		btn1f06 = new JButton("주차가능");
		layeredPane.setLayer(btn1f06, 2);
		btn1f06.addActionListener(e -> regiCar("1f06"));
		btn1f06.setForeground(Color.WHITE);
		btn1f06.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f06.setDisplayedMnemonicIndex(2);
		btn1f06.setBorderPainted(false);
		btn1f06.setBackground(SystemColor.activeCaption);
		btn1f06.setBounds(24, 490, 179, 87);
		layeredPane.add(btn1f06);
		
		btn1f07 = new JButton("주차가능");
		layeredPane.setLayer(btn1f07, 2);
		btn1f07.addActionListener(e -> regiCar("1f07"));
		btn1f07.setForeground(Color.WHITE);
		btn1f07.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f07.setBorderPainted(false);
		btn1f07.setBackground(SystemColor.activeCaption);
		btn1f07.setBounds(396, 25, 179, 87);
		layeredPane.add(btn1f07);
		
		btn1f08 = new JButton("주차가능");
		layeredPane.setLayer(btn1f08, 2);
		btn1f08.addActionListener(e -> regiCar("1f08"));
		btn1f08.setForeground(Color.WHITE);
		btn1f08.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f08.setBorderPainted(false);
		btn1f08.setBackground(SystemColor.activeCaption);
		btn1f08.setBounds(396, 119, 179, 87);
		layeredPane.add(btn1f08);
		
		btn1f10 = new JButton("주차가능");
		layeredPane.setLayer(btn1f10, 2);
		btn1f10.addActionListener(e -> regiCar("1f10"));
		btn1f10.setForeground(Color.WHITE);
		btn1f10.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f10.setDisplayedMnemonicIndex(2);
		btn1f10.setBorderPainted(false);
		btn1f10.setBackground(SystemColor.activeCaption);
		btn1f10.setBounds(396, 305, 179, 87);
		layeredPane.add(btn1f10);
		
		btn1f09 = new JButton("주차가능");
		layeredPane.setLayer(btn1f09, 2);
		btn1f09.addActionListener(e -> regiCar("1f09"));
		btn1f09.setForeground(Color.WHITE);
		btn1f09.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f09.setDisplayedMnemonicIndex(2);
		btn1f09.setBorderPainted(false);
		btn1f09.setBackground(SystemColor.activeCaption);
		btn1f09.setBounds(396, 212, 179, 87);
		layeredPane.add(btn1f09);
		
		btn1f11 = new JButton("주차가능");
		layeredPane.setLayer(btn1f11, 2);
		btn1f11.addActionListener(e -> regiCar("1f11"));
		btn1f11.setForeground(Color.WHITE);
		btn1f11.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f11.setDisplayedMnemonicIndex(2);
		btn1f11.setBorderPainted(false);
		btn1f11.setBackground(SystemColor.activeCaption);
		btn1f11.setBounds(396, 397, 179, 87);
		layeredPane.add(btn1f11);
		
		btn1f12 = new JButton("주차가능");
		layeredPane.setLayer(btn1f12, 2);
		btn1f12.addActionListener(e -> regiCar("1f12"));
		btn1f12.setForeground(Color.WHITE);
		btn1f12.setFont(new Font("D2Coding", Font.BOLD, 15));
		btn1f12.setDisplayedMnemonicIndex(2);
		btn1f12.setBorderPainted(false);
		btn1f12.setBackground(SystemColor.activeCaption);
		btn1f12.setBounds(396, 490, 179, 87);
		layeredPane.add(btn1f12);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(642, 30, 398, 297);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("남은 주차 자리수");
		lblNewLabel_2.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNewLabel_2.setBounds(758, 337, 172, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		exitCarField = new JTextField();
		exitCarField.setActionCommand("");
		exitCarField.setName("");
		exitCarField.setToolTipText("");
		exitCarField.setBounds(704, 458, 277, 73);
		frame.getContentPane().add(exitCarField);
		exitCarField.setColumns(10);
		
		btnExitCar = new JButton("출차정산");
		btnExitCar.addActionListener(e -> exitCar());
		btnExitCar.setBounds(758, 541, 172, 50);
		frame.getContentPane().add(btnExitCar);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(888, 636, 164, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		lblParkingAreaCounting = new JLabel("#/#");
		lblParkingAreaCounting.setHorizontalAlignment(SwingConstants.CENTER);
		lblParkingAreaCounting.setFont(new Font("D2Coding", Font.BOLD, 60));
		lblParkingAreaCounting.setBounds(716, 378, 246, 70);
		frame.getContentPane().add(lblParkingAreaCounting);
	}
	
	private void regiCar(String btn) {
		ParkingRegiFrame.showParkingRegiFrame(frame , btn, ParkingMainView.this);
	}
	
	private void exitCar() {
		ParkingInfo pInfo = new ParkingInfo();
		String content = exitCarField.getText();
		
		pInfo = dao.readInfo(content);
		
		if(content.equals("")) JOptionPane.showMessageDialog(frame, "차량번호를 입력해주세요.");
		else if(pInfo.getcNum() == null) JOptionPane.showMessageDialog(frame, "등록되지 않은 차량입니다.");
		else {
			int check = JOptionPane.showConfirmDialog(frame, "정산하시겠습니까?", "확인", JOptionPane.OK_CANCEL_OPTION);
			if(check == JOptionPane.OK_OPTION) {}
			dao.updateInfo(pInfo);
			ParkingAdjuFrame.showParkingAdjuFrame(frame, content, ParkingMainView.this);
		}
	}
	
	private void initializeMain() {
		List<ParkingArea> pAreas = dao.readArea();
		JButton[] buttons = {btn1f01, btn1f02, btn1f03, btn1f04, btn1f05, btn1f06, 
				btn1f07, btn1f08, btn1f09, btn1f10, btn1f11, btn1f12};
		int totParking = pAreas.size();
		int notParking = 0;
		for(int i=0 ; i < pAreas.size() ; i++) {
			ParkingArea a = pAreas.get(i);
			if(a.getpCheck() == 1) {
				buttons[i].setText("주차중");
				buttons[i].setOpaque(false);
				buttons[i].setEnabled(false);
			} else {
				buttons[i].setText("주차가능");
				buttons[i].setOpaque(true);
				buttons[i].setEnabled(true);
				notParking++;
			}
		}
		lblParkingAreaCounting.setText(String.format("%s / %s", notParking, totParking));
	}
	
	public void notifyRegiSuccess() {
		initializeMain();
	}
}
