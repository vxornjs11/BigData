package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frmDialog;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
					window.frmDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDialog = new JFrame();
		frmDialog.setTitle("Dialog");
		frmDialog.setBounds(100, 100, 450, 300);
		frmDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDialog.getContentPane().setLayout(null);
		frmDialog.getContentPane().add(getBtnNewButton());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Help");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				  Help help = new Help();
				  help.setVisible(true);
				}
			});
			btnNewButton.setBounds(159, 107, 117, 29);
		}
		return btnNewButton;
	}
}
