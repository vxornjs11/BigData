package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmCombobox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JButton btnNewButton;
	private JComboBox cbAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCbFruits());
		frmCombobox.getContentPane().add(getTfFruits());
		frmCombobox.getContentPane().add(getTfAdd());
		frmCombobox.getContentPane().add(getBtnNewButton());
		frmCombobox.getContentPane().add(getCbAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tfFruits.setText(cbFruits.getSelectedItem().toString());
				}
			});
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cbFruits.setBounds(43, 33, 125, 27);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(202, 32, 130, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(43, 72, 115, 26);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("ADD");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo();
					
				}
			});
			btnNewButton.setBounds(43, 110, 117, 29);
		}
		return btnNewButton;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(195, 73, 137, 25);
		}
		return cbAdd;
	}
	
	
	// 0000000000000000000000 Functions 00000000000000000000000
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
		
	}
	
	
	
	
	
}
