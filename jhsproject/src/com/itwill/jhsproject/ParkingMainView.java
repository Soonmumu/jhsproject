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
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ParkingMainView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1068, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(30, 30, 600, 600);
		frame.getContentPane().add(layeredPane);
		
		JButton btn1f01 = new JButton("주차가능");
		btn1f01.addActionListener(e -> ParkingRegiFrame.ShowParkngRegiFrame("1f01"));
		btn1f01.setBorderPainted(false);
		btn1f01.setBackground(SystemColor.activeCaption);
		btn1f01.setForeground(new Color(255, 255, 255));
		btn1f01.setFont(new Font("D2Coding", Font.BOLD, 15));
		layeredPane.setLayer(btn1f01, 2);
		btn1f01.setBounds(24, 25, 179, 87);
		layeredPane.add(btn1f01);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\java157\\workspaces\\parking_img.jpg"));
		layeredPane.setLayer(lblNewLabel, 1);
		lblNewLabel.setBounds(0, 0, 600, 600);
		layeredPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("주차가능");
		layeredPane.setLayer(btnNewButton_1, 2);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("D2Coding", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(24, 119, 179, 87);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("주차가능");
		layeredPane.setLayer(btnNewButton_1_1, 2);
		btnNewButton_1_1.setDisplayedMnemonicIndex(2);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("D2Coding", Font.BOLD, 15));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1_1.setBounds(24, 305, 179, 87);
		layeredPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("주차가능");
		layeredPane.setLayer(btnNewButton_2, 2);
		btnNewButton_2.setDisplayedMnemonicIndex(2);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("D2Coding", Font.BOLD, 15));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(24, 212, 179, 87);
		layeredPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(642, 30, 398, 297);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("남은 주차 자리수");
		lblNewLabel_2.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNewLabel_2.setBounds(758, 337, 172, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(735, 385, 213, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(704, 458, 277, 73);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(758, 541, 172, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(888, 636, 164, 38);
		frame.getContentPane().add(btnNewButton_4);
	}
}
