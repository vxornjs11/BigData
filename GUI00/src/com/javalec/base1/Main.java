package com.javalec.base1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.ChangedCharSetException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmButtonTest;
	private JLabel lblNewLabel;
	private JLabel lblNation;
	private JButton btnOK;
	private JButton btnDialogue;
//	private int intcount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.getContentPane().setBackground(new Color(101, 98, 187));
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getLblNewLabel());
		frmButtonTest.getContentPane().add(getLblNation());
		frmButtonTest.getContentPane().add(getBtnOK());
		frmButtonTest.getContentPane().add(getBtnDialogue());
		frmButtonTest.setBackground(new Color(234, 145, 255));
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swong Button Test");
			lblNewLabel.setBounds(22, 21, 340, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNation() {
		if (lblNation == null) {
			lblNation = new JLabel("대한민국");
			lblNation.setBounds(32, 49, 61, 16);
		}
		return lblNation;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					changeText();
//					intcount++;
//					if(intcount % 2 != 0) {
//						lblNation.setText("korea");
//					}else {
//						lblNation.setText("대한민국");
//					}
				}
			});
			btnOK.setBounds(22, 98, 117, 29);
		}
		return btnOK;
	}

	private void changeText() {
		if(lblNation.getText().equals("korea")) {
			lblNation.setText("대한민국");
		}else {
			lblNation.setText("korea");
		}
	}
	private JButton getBtnDialogue() {
		if (btnDialogue == null) {
			btnDialogue = new JButton("Dialogue");
			btnDialogue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayDialog();
					
				}
			});
			btnDialogue.setBounds(22, 146, 117, 29);
		}
		return btnDialogue;
	}
	private void displayDialog() {
		if(lblNation.getText().equals("korea")) {
			JOptionPane.showMessageDialog(null,"korea를 입력했습니다.");
		}else {
			JOptionPane.showMessageDialog(null,"대한민국을 입력했습니다.");
		}
	
		
		
	}
}//// -------
