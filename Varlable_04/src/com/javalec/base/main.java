package com.javalec.base;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		연산자 종류별 출력
		int num1 = 10, num2 = 2, num3 = 5;
		

		System.out.println("<<<< 산술 연산자 >>>>");
		System.out.println("덧셈 : " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("뺄셈 : " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱셈 : " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("나눗셈 몫 : " + num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println("나눗셈 나머지 : " + num1 + " % " + num2 + " = " + (num1 % num3));

		// 자동 증감 연산자
		//++, -- 1만 가능
		
		System.out.println("");
		System.out.println("<<<< 자동증감 연산자 >>>>");
		
		num1 = num1 + 1;
//		num1 += 1;
//		num1 ++;
		System.out.println("증가 : " + num1);

//		num1 = num1 - 1;
//		num1 -= 1;
		num1 --;
		System.out.println("감소 : " + num1);
		
		System.out.println("");
		System.out.println("<<<< 동등비교 관계 연산자 >>>>");
		System.out.println("num1 == num2 : " + (num1 == num2));//왼쪽 피연산자와 오른쪽 피연산자의 값이 같으면 참을 반환함.
		System.out.println("num1 != num2 : " + (num1 != num2));//왼쪽 피연산자와 오른쪽 피연산자의 값이 같지 않으면 참을 반환함.
		System.out.println("num1 > num2 : " + (num1 > num2));//왼쪽 피연산자의 값이 오른쪽 피연산자의 값보다 크면 참을 반환함.
		System.out.println("num1 < num2 : " + (num1 < num2));//왼쪽 피연산자의 값이 오른쪽 피연산자의 값보다 작으면 참을 반환함.
		System.out.println("num1 >= num2 : " + (num1 >= num2));//왼쪽 피연산자의 값이 오른쪽 피연산자의 값보다 크거나 같으면 참을 반환함.
		System.out.println("num1 >= num2 : " + (num1 >= num2));//왼쪽 피연산자의 값이 오른쪽 피연산자의 값보다 크거나 같으면 참을 반환함.
		System.out.println("num1 <= num2 : " + (num1 <= num2));//왼쪽 피연산자의 값이 오른쪽 피연산자의 값보다 작거나 같으면 참을 반환함.
		
		System.out.println("");
		System.out.println("<<<< 논리 연산자 >>>>");
		System.out.println(num1 + " > " + num2 + " && " + num2 + " > "+ num3 + " : " + ((num1 > num2) && (num2 > num3)));
		System.out.println(num1 + " > " + num2 + " || " + num2 + " > "+ num3 + " : " + ((num1 > num2) || (num2 > num3)));
		
		
		System.out.println("<<< 상황 연산자 >>");
		String result = num3==5 ? "yes":"no";
		
		
		System.out.println("상황 연산 결과 (num3 == 5 ? 1:2):" + (num3==5 ? "yes":"no"));
		System.out.println("상황 연산 결과 (num3 == 5 ? 1:2):" + result);
//		동등비교 관계 연산자
//		상황 연산자 (~~~1) ? "(2)" : "(3)"
		
		
	
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		
	

	
			
		
	

	}

}
