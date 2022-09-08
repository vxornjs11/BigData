package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 덧셈
		System.out.println(2 + 3);
		// 뺄셈
		System.out.println(2 - 3);
		// 곱셈
		System.out.println(2 * 3);
		// 나눗셈
		System.out.println(2.0 / 3.0);

//	------- 변수 ------
//		mum1이라는 변수에 data10을 할당한다
		int num1 = 10;
		int num2 = 20;
		char charater1 = 'a';
		String str1 = "apple";
		String str2 = "banana";
		int add= num1 + num2;
//		더하기
		int sub= num1 - num2;
//		뺄셈
		int mult= num1 * num2;
//		곱하기
		double div= (double)num1 / num2;
//		나누기
		

		System.out.println(num1);
		System.out.println(num2);
		
//		num1 + num2 를 출력해보기
		System.out.println(num1 + "+" + num2 + "=" + add);
//		num1 - num2 를 출력해보기
		System.out.println(num1 + "-" + num2 + "=" + sub);
//		num1 * num2 를 출력해보기
		System.out.println(num1 + "*" + num2 + "=" + mult);
//		num1 / num2 를 출력해보기
		System.out.println(num1 + "/" + num2 + "=" + div);
		
		System.out.println(str1);
		System.out.println(charater1);
		System.out.println(str1 + "," + str2);
		num1 = 100;
		System.out.println(num1);
		
		
		

	}

}
