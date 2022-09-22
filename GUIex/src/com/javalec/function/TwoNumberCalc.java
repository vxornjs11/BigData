package com.javalec.function;

public class TwoNumberCalc {
	
	
	
	//field

	
	
	//Constructor
	public TwoNumberCalc() {
		super();
		
		
	}
	
	
	
	//Method
	//덧셈
//		int num1 = Integer.parseInt(str);
//		int num2 = Integer.parseInt(str2);
//		String returnNum = Integer.toString(num1 + num2);
//		return returnNum;
//		String returnNum = Integer.toString(Integer.parseInt(str) + Integer.parseInt(str2));
	public String addition(String str, String str2) {
		return Integer.toString(Integer.parseInt(str) + Integer.parseInt(str2));
	}
	public String subtraction(String str, String str2) {
		return Integer.toString(Integer.parseInt(str) - Integer.parseInt(str2));
	}
	
	public String multraction(String str, String str2) {
		return Integer.toString(Integer.parseInt(str) * Integer.parseInt(str2));
	}
	
	public String division(String str, String str2) {
//		double result = (double)Integer.parseInt(str) / Integer.parseInt(str2);
		// 나눗셈
//		String result = String.format("%.3f",(double)Integer.parseInt(str) / Integer.parseInt(str2));
		return String.format("%.3f",(double)Integer.parseInt(str) / Integer.parseInt(str2));
	}
	

}
