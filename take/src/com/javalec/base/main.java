package com.javalec.base;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		연산자종류별 출력
		int num1 = 10, num2 = 2, num3 = 5;
		
		System.out.println("<<<< 산술 연산자 >>>>");
		System.out.println("덧셈:" + num1 + " + " +num2 + " = " + (num1+num2));
		System.out.println("나눗셈 몫:" + num1 + " / " +num2 + " = " + (num1/num2));
		System.out.println("나눗셈 나머지:" + num1 + " % " +num2 + " = " + (num1%num2));
		
//		자동 증강 연산자
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		System.out.println("증가 :"+ num1);
		
		String a = "Hello";
		System.out.println(a.indexOf("ello")); //1
		System.out.println(a.lastIndexOf("l")); //3
	
		
		

	}

}
