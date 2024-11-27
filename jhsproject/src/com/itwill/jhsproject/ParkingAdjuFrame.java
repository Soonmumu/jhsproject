package com.itwill.jhsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ParkingAdjuFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblcNum;
	private JLabel lblTitle;
	private JLabel lblRedution;
	private JLabel lblEntranceTime;
	private JLabel lblExitTime;
	private JLabel lblParkingTime;
	private JLabel lblFee;
	private JTextField cNumField;
	private JTextField reductionField;
	private JTextField entranceTimeField;
	private JTextField exitTimeField;
	private JTextField parkingTimeField;
	private JTextField feeField;
	private JButton btncheck;

	private ParkingDao dao;
	private Component parentComponent;
	private String content;
	private ParkingMainView app;
	/**
	 * Launch the application.
	 */
	public static void showParkingAdjuFrame(Component parentComponent, String content, ParkingMainView app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingAdjuFrame frame = new ParkingAdjuFrame(parentComponent, content, app);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private ParkingAdjuFrame(Component parentComponent, String content, ParkingMainView app) {
		dao = ParkingDao.INSTANCE;
		this.parentComponent = parentComponent;
		this.content = content;
		this.app = app;
		initialize();
		contentSetting(content);
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 447);
		setLocationRelativeTo(parentComponent);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTitle = new JLabel("< 정 산 내 역 >");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("D2Coding", Font.BOLD, 30));
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblcNum = new JLabel("차량번호");
		lblcNum.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblcNum.setBounds(47, 10, 80, 35);
		panel.add(lblcNum);
		
		lblRedution = new JLabel("할인대상");
		lblRedution.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblRedution.setBounds(47, 55, 80, 35);
		panel.add(lblRedution);
		
		lblEntranceTime = new JLabel("입차시간");
		lblEntranceTime.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblEntranceTime.setBounds(47, 100, 80, 35);
		panel.add(lblEntranceTime);
		
		lblExitTime = new JLabel("출차시간");
		lblExitTime.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblExitTime.setBounds(47, 145, 80, 35);
		panel.add(lblExitTime);
		
		lblParkingTime = new JLabel("주차시간");
		lblParkingTime.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblParkingTime.setBounds(47, 190, 80, 35);
		panel.add(lblParkingTime);
		
		lblFee = new JLabel("주차요금");
		lblFee.setFont(new Font("D2Coding", Font.BOLD, 25));
		lblFee.setBounds(27, 247, 100, 35);
		panel.add(lblFee);
		
		cNumField = new JTextField();
		cNumField.setEnabled(false);
		cNumField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		cNumField.setBounds(139, 10, 250, 35);
		panel.add(cNumField);
		cNumField.setColumns(10);
		
		reductionField = new JTextField();
		reductionField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		reductionField.setEnabled(false);
		reductionField.setColumns(10);
		reductionField.setBounds(139, 55, 250, 35);
		panel.add(reductionField);
		
		entranceTimeField = new JTextField();
		entranceTimeField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		entranceTimeField.setEnabled(false);
		entranceTimeField.setColumns(10);
		entranceTimeField.setBounds(139, 100, 250, 35);
		panel.add(entranceTimeField);
		
		exitTimeField = new JTextField();
		exitTimeField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		exitTimeField.setEnabled(false);
		exitTimeField.setColumns(10);
		exitTimeField.setBounds(139, 145, 250, 35);
		panel.add(exitTimeField);
		
		parkingTimeField = new JTextField();
		parkingTimeField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		parkingTimeField.setEnabled(false);
		parkingTimeField.setColumns(10);
		parkingTimeField.setBounds(139, 190, 250, 35);
		panel.add(parkingTimeField);
		
		feeField = new JTextField();
		feeField.setFont(new Font("D2Coding", Font.PLAIN, 18));
		feeField.setEnabled(false);
		feeField.setColumns(10);
		feeField.setBounds(139, 240, 250, 53);
		panel.add(feeField);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btncheck = new JButton("확인");
		btncheck.setFont(new Font("D2Coding", Font.BOLD, 20));
		panel_1.add(btncheck);
	}
	
	private void contentSetting(String content) {
		
	}
}
