package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.TwoNumberCalc;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUI01EX {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JButton btnAdd;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnDiv;
	private JTextField tfResultNum1;
	private JLabel lblSigh;
	private JTextField tfResultNum2;
	private JLabel lblNewLabel_1_1_1;
	private JTextField tfResult;
	ArrayList<String> List = new ArrayList<>();
	TwoNumberCalc calc = new TwoNumberCalc();
    private String i;
	
	/*
	 *  ***********************************
	 *  
	 *  두개의 숫자를 이용하여 가감승제 해보기
	 *  
	 *  - textield 잠금
	 *  - 가감승제 계산
	 *  - 기능 Class로 분리
	 *  
	 *  2022.09.22 시작
	 *  
	 *  ***********************************
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01EX window = new GUI01EX();
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
	public GUI01EX() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("두개의 숫자 가감승제");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getTfResultNum1());
		frame.getContentPane().add(getLblSigh());
		frame.getContentPane().add(getTfResultNum2());
		frame.getContentPane().add(getLblNewLabel_1_1_1());
		frame.getContentPane().add(getTfResult());
		
		// 화면 중앙에 배치
		
		// 메인 화면이 시작되기전 사용법 보여주기
		JOptionPane.showMessageDialog(null, "입력은 꼭 숫자로!","사용법", JOptionPane.WARNING_MESSAGE);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("숫자 1 :");
			lblNewLabel.setBounds(38, 43, 52, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setToolTipText("숫자입력");
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					//TextField에 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
//						List.add(e.getKeyChar());
						
					}else {
						JOptionPane.showMessageDialog(null, "숫자만 입력하세요","경고", JOptionPane.WARNING_MESSAGE);
						tfNum1.setText("");
					}
				}
			});
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(102, 38, 68, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("숫자 2 :");
			lblNewLabel_1.setBounds(38, 81, 52, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setColumns(10);
			tfNum2.setBounds(102, 76, 68, 26);
		}
		return tfNum2;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//덧셈기능
					// - 계산하기
					// - tfResult등에 입력값 넣어주기
					// - 계산 부호 변경하기
					calc();
				addition();
				}
			});
			btnAdd.setBounds(187, 38, 46, 29);
		}
		return btnAdd;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
					multraction();
				}
			});
			btnMul.setBounds(187, 76, 46, 29);
		}
		return btnMul;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					calc();
					subtraction();
				}
			});
			btnSub.setBounds(245, 38, 46, 29);
		}
		return btnSub;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
					divisionn();
				}
			});
			btnDiv.setBounds(245, 76, 46, 29);
		}
		return btnDiv;
	}
	private JTextField getTfResultNum1() {
		if (tfResultNum1 == null) {
			tfResultNum1 = new JTextField();
			tfResultNum1.setEditable(false);
			tfResultNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResultNum1.setColumns(10);
			tfResultNum1.setBounds(38, 153, 68, 26);
		}
		return tfResultNum1;
	}
	private JLabel getLblSigh() {
		if (lblSigh == null) {
			lblSigh = new JLabel("+");
			lblSigh.setHorizontalAlignment(SwingConstants.CENTER);
			lblSigh.setBounds(118, 158, 27, 16);
		}
		return lblSigh;
	}
	private JTextField getTfResultNum2() {
		if (tfResultNum2 == null) {
			tfResultNum2 = new JTextField();
			tfResultNum2.setEditable(false);
			tfResultNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResultNum2.setColumns(10);
			tfResultNum2.setBounds(157, 153, 68, 26);
		}
		return tfResultNum2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("=");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setBounds(237, 158, 27, 16);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setColumns(10);
			tfResult.setBounds(276, 153, 68, 26);
		}
		return tfResult;
	}
	
	// --------- Functions -----------
	
	
	private void addition() {
//		btnAdd.getText().equals("+");
//		tfResultNum1.setText(tfNum1.getText());
//		tfResultNum2.setText(tfNum2.getText());
		TwoNumberCalc calc = new TwoNumberCalc();
//		String result = calc.addition(tfNum1.getText(), tfNum2.getText());
		tfResult.setText(calc.addition(tfNum1.getText(), tfNum2.getText()));
		
		
	}
	private void subtraction() {
		TwoNumberCalc calc = new TwoNumberCalc();
//		String result = calc.addition(tfNum1.getText(), tfNum2.getText());
		tfResult.setText(calc.subtraction(tfNum1.getText(), tfNum2.getText()));
		
		
	}
	private void multraction() {
		TwoNumberCalc calc = new TwoNumberCalc();
//		String result = calc.addition(tfNum1.getText(), tfNum2.getText());
		tfResult.setText(calc.multraction(tfNum1.getText(), tfNum2.getText()));
		
		
	}
	private void divisionn() {
		if(!zerocheck()) {
			TwoNumberCalc calc = new TwoNumberCalc();
//		String result = calc.addition(tfNum1.getText(), tfNum2.getText());
			tfResult.setText(calc.division(tfNum1.getText(), tfNum2.getText()));
		}else {
			tfResult.setText("Error");
			JOptionPane.showMessageDialog(null, "0은 나눗셈으로 사용 불가합니다.","경고", JOptionPane.WARNING_MESSAGE);
		}

	}
	// 나눗셈시 분모에 0이 들어 온것을 확인한다.
	private boolean zerocheck() {
		if(tfResultNum2.getText().equals("0")) {
			return false;
		}else {
			return true;
		}
	}
	
	private void calc() {
		btnAdd.getText().equals(i);
		tfResultNum1.setText(tfNum1.getText());
		tfResultNum2.setText(tfNum2.getText());
		
	}
	
}
