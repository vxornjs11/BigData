package com.javalec.base;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		선언부  
		Scanner scanner = new Scanner(System.in);// Scanner정의
		int InputNum1; // 첫번째 숫자
		int InputNum2; // 두번째 숫자
		String result= ""; // 결과값 멘트
		

		// 사용자 입력내용 가져오기
		System.out.print("첫번째 숫자를 입력하세요 : ");
		InputNum1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		InputNum2 = scanner.nextInt();
		
		
		// 두수 비교하여 출력하기
		// num1>num2

		if (InputNum1 < InputNum2) {
			result = "보다 작습니다.";
			
		} else if(InputNum1 < InputNum2) {
			System.out.println(InputNum2 - InputNum1);
			result = "보다 큽니다.";
			}else {
				result = "와 같습니다.";
//		if (InputNum1 > InputNum2) {
//			result = "보다 큽니다.";
//
//		}
//		if (InputNum1 == InputNum2) {
//			result = "와 같습니다.";
		}
		System.out.println("첫번째 숫자와 두번째 숫자" + result + "\nThank you");
	
		
	}

}
