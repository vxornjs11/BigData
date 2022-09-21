package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frmGuitest;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JLabel lblNewLabel_1_1;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frmGuitest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuitest = new JFrame();
		frmGuitest.setTitle("GUI_Test01");
		frmGuitest.setBounds(100, 100, 450, 300);
		frmGuitest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuitest.getContentPane().setLayout(null);
		frmGuitest.getContentPane().add(getLblNewLabel());
		frmGuitest.getContentPane().add(getTfNum1());
		frmGuitest.getContentPane().add(getLblNewLabel_1());
		frmGuitest.getContentPane().add(getTfNum2());
		frmGuitest.getContentPane().add(getLblNewLabel_1_1());
		frmGuitest.getContentPane().add(getBtnAdd());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("java GUI Example 01");
			lblNewLabel.setBounds(24, 20, 280, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(24, 48, 79, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("+");
			lblNewLabel_1.setBounds(115, 53, 22, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(138, 48, 70, 26);
		}
		return tfNum2;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("=");
			lblNewLabel_1_1.setBounds(209, 53, 22, 16);
		}
		return lblNewLabel_1_1;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("ADD");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addSum();
				}
			});
			btnAdd.setBounds(233, 48, 117, 29);
		}
		return btnAdd;
	}
	// -----------------------------------------------------
	
	private void addSum(){
//		String strNum1 = tfNum1.getText();
//		String strNum2 = tfNum2.getText();
		
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
//		String stResult = Integer.toString(wkResult);
//		tfResult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(null, Integer.toString(wkResult));
	}
	
	
}


