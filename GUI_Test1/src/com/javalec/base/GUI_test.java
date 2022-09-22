package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI_test {

	private JFrame frame;
	private JComboBox cbFruit;
	private JComboBox cbFruit2;
	private JComboBox cbFruit3;
	private JLabel lblNum;
	ArrayList<String> List = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_test window = new GUI_test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("콤보 좋아");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbFruit());
		frame.getContentPane().add(getCbFruit2());
		frame.getContentPane().add(getCbFruit3());
		frame.getContentPane().add(getLblNum());
	}

	private JComboBox getCbFruit() {
		if (cbFruit == null) {
			cbFruit = new JComboBox();
			cbFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 lblNum.setText(cbFruit.getSelectedItem().toString());
					
				}
			});
			cbFruit.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbFruit.setBounds(16, 31, 92, 27);
		}
		return cbFruit;
	}
	private JComboBox getCbFruit2() {
		if (cbFruit2 == null) {
			cbFruit2 = new JComboBox();
			cbFruit2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblNum.setText(cbFruit2.getSelectedItem().toString());
				}
			});
			cbFruit2.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/"}));
			cbFruit2.setBounds(130, 31, 92, 27);
		}
		return cbFruit2;
	}
	private JComboBox getCbFruit3() {
		if (cbFruit3 == null) {
			cbFruit3 = new JComboBox();
			cbFruit3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblNum.setText(cbFruit3.getSelectedItem().toString());
					
					
				}
			});
			cbFruit3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbFruit3.setBounds(249, 31, 102, 27);
		}
		return cbFruit3;
	}
	@SuppressWarnings("unlikely-arg-type")
	private JLabel getLblNum() {
		if (lblNum == null) {
			lblNum = new JLabel("New label");
			lblNum.setBounds(16, 136, 335, 16);
			
			
		}
		return lblNum;
	}
	
	
	
	
	private void calc() {
		
	}
}
