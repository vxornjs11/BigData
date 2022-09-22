package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUI04 {

	private JFrame frmPassword;
	private JLabel lblNewLabel;
	private JPasswordField pfInput;
	private JButton btnOK;
	private JTextField tfMesseage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPassword = new JFrame();
		frmPassword.setTitle("Password");
		frmPassword.setBounds(100, 100, 450, 300);
		frmPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPassword.getContentPane().setLayout(null);
		frmPassword.getContentPane().add(getLblNewLabel());
		frmPassword.getContentPane().add(getPfInput());
		frmPassword.getContentPane().add(getBtnOK());
		frmPassword.getContentPane().add(getTfMesseage());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(28, 22, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(101, 17, 147, 26);
		}
		return pfInput;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPasswored();
				}
			});
			btnOK.setBounds(266, 17, 117, 29);
		}
		return btnOK;
	}
	private JTextField getTfMesseage() {
		if (tfMesseage == null) {
			tfMesseage = new JTextField();
			tfMesseage.setBounds(28, 73, 342, 26);
			tfMesseage.setColumns(10);
		}
		return tfMesseage;
	}
	// ------------- functions ---------------
	
	
	private void checkPasswored(){
		char[] pass = pfInput.getPassword();
		String passString = new String(pass);
		tfMesseage.setText("당신의 패스워드는 " + passString + "입니다 ");
		
		//퀴즈 알아서 만들어 하세요??
		//그강아아아아아각
	}
	
	
	
	
	
}
