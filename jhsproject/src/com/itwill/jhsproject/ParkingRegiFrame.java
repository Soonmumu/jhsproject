package com.itwill.jhsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ParkingRegiFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String parkingArea;
	private JTextField parkingAreaField;
	private JTextField carNumField;

	public static void ShowParkngRegiFrame(String parkingArea) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingRegiFrame frame = new ParkingRegiFrame(parkingArea);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private ParkingRegiFrame(String parkingArea) {
		this.parkingArea = parkingArea;
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParkingArea = new JLabel("주 차 구 역");
		lblParkingArea.setFont(new Font("D2Coding", Font.BOLD, 25));
		lblParkingArea.setBounds(23, 21, 139, 30);
		contentPane.add(lblParkingArea);
		
		JLabel lblCarNum = new JLabel("차 량 번 호");
		lblCarNum.setFont(new Font("D2Coding", Font.BOLD, 25));
		lblCarNum.setBounds(23, 73, 139, 30);
		contentPane.add(lblCarNum);
		
		JLabel lblReduction = new JLabel("감 면 종 류");
		lblReduction.setFont(new Font("D2Coding", Font.BOLD, 25));
		lblReduction.setBounds(23, 125, 139, 30);
		contentPane.add(lblReduction);
		
		parkingAreaField = new JTextField();
		parkingAreaField.setEditable(false);
		parkingAreaField.setFont(new Font("D2Coding", Font.PLAIN, 20));
		parkingAreaField.setBounds(174, 19, 248, 41);
		contentPane.add(parkingAreaField);
		parkingAreaField.setColumns(10);
		
		carNumField = new JTextField();
		carNumField.setFont(new Font("D2Coding", Font.PLAIN, 20));
		carNumField.setColumns(10);
		carNumField.setBounds(174, 73, 248, 41);
		contentPane.add(carNumField);
		
		JButton btnRegister = new JButton("확 인");
		btnRegister.setFont(new Font("D2Coding", Font.BOLD, 25));
		btnRegister.setBounds(89, 192, 115, 41);
		contentPane.add(btnRegister);
		
		JButton btnCancel = new JButton("취 소");
		btnCancel.addActionListener(e -> dispose());
		btnCancel.setFont(new Font("D2Coding", Font.BOLD, 25));
		btnCancel.setBounds(227, 192, 115, 41);
		contentPane.add(btnCancel);
		
		JComboBox reductionCombo = new JComboBox();
		reductionCombo.setFont(new Font("D2Coding", Font.PLAIN, 20));
		reductionCombo.setBounds(174, 125, 248, 41);
		contentPane.add(reductionCombo);
	}
}
