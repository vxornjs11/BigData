package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.Magic;
import com.javalec.function.Math;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfaddNum1;
	private JTextField tfaddNum2;
	private JTextField tfendNum3;
	private JButton btnadd;
	private JButton btnmul;
	private JButton btnsub;
	private JButton btndiv;
	private JLabel lblMagicnum1;
	private JLabel lblMagicnum2;
	private String j;
	private String k;
	private String h;
	private String g;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 185, 104));
		frame.getContentPane().setForeground(new Color(216, 189, 93));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfaddNum1());
		frame.getContentPane().add(getTfaddNum2());
		frame.getContentPane().add(getTfendNum3());
		frame.getContentPane().add(getBtnadd());
		frame.getContentPane().add(getBtnmul());
		frame.getContentPane().add(getBtnsub());
		frame.getContentPane().add(getBtndiv());
		frame.getContentPane().add(getLblMagicnum1());
		frame.getContentPane().add(getLblMagicnum2());
		frame.setTitle("두개의 숫자 가감승제");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1 :");
			lblNewLabel.setBounds(17, 39, 53, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2 :");
			lblNewLabel_1.setBounds(17, 69, 53, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(82, 64, 63, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(82, 34, 63, 26);
		}
		return tfNum2;
	}
	private JTextField getTfaddNum1() {
		if (tfaddNum1 == null) {
			tfaddNum1 = new JTextField();
			tfaddNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfaddNum1.setBounds(41, 180, 80, 26);
			tfaddNum1.setColumns(10);
		}
		return tfaddNum1;
	}
	private JTextField getTfaddNum2() {
		if (tfaddNum2 == null) {
			tfaddNum2 = new JTextField();
			tfaddNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfaddNum2.setColumns(10);
			tfaddNum2.setBounds(158, 180, 80, 26);
		}
		return tfaddNum2;
	}
	private JTextField getTfendNum3() {
		if (tfendNum3 == null) {
			tfendNum3 = new JTextField();
			tfendNum3.setHorizontalAlignment(SwingConstants.TRAILING);
			tfendNum3.setColumns(10);
			tfendNum3.setBounds(273, 180, 80, 26);
//			Math sum = new Math(tfaddNum1, tfaddNum2);
//			sum.Mathsum();
			
		}
		return tfendNum3;
	}
	private JButton getBtnadd() {
		if (btnadd == null) {
			btnadd = new JButton("+");
			btnadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Magic mag = new Magic(btnadd.getText(),lblMagicnum1.getText());
					j = mag.magicChange();
					lblMagicnum1.setText(j);

				}
			});
			btnadd.setBounds(258, 34, 53, 29);
		}
		return btnadd;
	}
	private JButton getBtnmul() {
		if (btnmul == null) {
			btnmul = new JButton("X");
			btnmul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Magic mag = new Magic(btnmul.getText(),lblMagicnum1.getText());
					k = mag.magicChange2();
					lblMagicnum1.setText(k);
			
				}
			});
			btnmul.setBounds(258, 64, 53, 29);
		}
		return btnmul;
	}
	private JButton getBtnsub() {
		if (btnsub == null) {
			btnsub = new JButton("-");
			btnsub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Magic mag = new Magic(btnsub.getText(),lblMagicnum1.getText());
					h = mag.magicChange3();
					lblMagicnum1.setText(h);
				}
			});
			btnsub.setBounds(312, 34, 53, 29);
		}
		return btnsub;
	}
	private JButton getBtndiv() {
		if (btndiv == null) {
			btndiv = new JButton("/");
			btndiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Magic mag = new Magic(btndiv.getText(),lblMagicnum1.getText());
				    g = mag.magicChange4();
				    lblMagicnum1.setText(g);
				}
			});
			btndiv.setBounds(312, 64, 53, 29);
		}
		return btndiv;
	}
	private JLabel getLblMagicnum1() {
		if (lblMagicnum1 == null) {
			lblMagicnum1 = new JLabel("+");
			lblMagicnum1.setBounds(131, 185, 39, 16);
		}
		return lblMagicnum1;
	}
	private JLabel getLblMagicnum2() {
		if (lblMagicnum2 == null) {
			lblMagicnum2 = new JLabel("=");
			lblMagicnum2.setBounds(243, 185, 39, 16);
		}
		return lblMagicnum2;
	}
	
	//------------------------------------------
	
	
	
}
