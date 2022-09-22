package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03 {

	private JFrame frmCheakBox;
	private JCheckBox cbApple;
	private JCheckBox cbBanana;
	private JButton btnFruits;
	private JTextField tfFruits;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheakBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheakBox = new JFrame();
		frmCheakBox.setTitle("Cheak Box / Radio Button");
		frmCheakBox.setBounds(100, 100, 450, 300);
		frmCheakBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheakBox.getContentPane().setLayout(null);
		frmCheakBox.getContentPane().add(getCbApple());
		frmCheakBox.getContentPane().add(getCbBanana());
		frmCheakBox.getContentPane().add(getBtnFruits());
		frmCheakBox.getContentPane().add(getTfFruits());
		frmCheakBox.getContentPane().add(getRbKBS());
		frmCheakBox.getContentPane().add(getRbMBC());
		frmCheakBox.getContentPane().add(getBtnBroad());
		frmCheakBox.getContentPane().add(getTfBroad());
	}
	private JCheckBox getCbApple() {
		if (cbApple == null) {
			cbApple = new JCheckBox("Apple");
			cbApple.setBounds(35, 46, 128, 23);
		}
		return cbApple;
	}
	private JCheckBox getCbBanana() {
		if (cbBanana == null) {
			cbBanana = new JCheckBox("Banana");
			cbBanana.setBounds(35, 81, 128, 23);
		}
		return cbBanana;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitsCheak();
				}
			});
			btnFruits.setBounds(35, 116, 117, 29);
		}
		return btnFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(6, 157, 168, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			rbKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheak();
				}
				
			});
			rbKBS.setSelected(true);
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(193, 46, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			rbMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheak();
				}
			});
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(193, 81, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheak();
					
				}
			});
			btnBroad.setBounds(203, 116, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(204, 157, 152, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	//------------------function -----------------
	private void broadCheak() {
		
		if(rbKBS.isSelected()) {
			tfBroad.setText("KBS가 선택 되었습니다.");
			
		}
		
		if(rbMBC.isSelected());
		tfBroad.setText("MBC가 선택 되었습니다. ");
		
	}

	private void fruitsCheak() {
		if (cbApple.isSelected() && cbBanana.isSelected()) {
			tfFruits.setText("둘다 선택 되었씁니다.");
		} else if (cbApple.isSelected()) {
			tfFruits.setText("Apple이 선택 되었습니다.");
		} else if (cbBanana.isSelected()) {
			tfFruits.setText("Banana가 선택 되었습니다.");
		} else {
			tfFruits.setText("선택 안함.");
		}
		
	}
	
	
}
