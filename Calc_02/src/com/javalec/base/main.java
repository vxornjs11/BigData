package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		사용자의 입력값이 짝수 인지 홀수 인지 알려주기! 
		Scanner scanner = new Scanner(System.in);
//		System 객체 in 메소드 
		
		System.out.println("숫자를 입력해 주세요:");
		int num = scanner.nextInt();
		System.out.println(num);
		System.out.println("나눗셈 나머지 : " + num + " % " + 2 + " = " + (num % 2));
		int num1 = scanner.nextInt();
		System.out.println((num1 % 2 == 0 )? "짝수" : "홀수");
		String result=((num1 % 2 == 0 )? "짝수" : "홀수");
		System.out.println("입력한 숫자는"+ result + "입니다");
//		==이 뭘까 두 피 연산자의 값이 같은지 검
//		조건문 제어문 : 상황을 판단하여 true 일경우와 false일 경우를 판별하는 문장 Ex(if....)
//		반복문(loop) :상황을 판단하여 true일경우 동일한 작업을 반복 false일경우 동일한 작업에서 빠져나감
		{
	
		
	
		}
		
		
	
		
	
		
	

	}

}
