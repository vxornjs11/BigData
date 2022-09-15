package com.javalec.base;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String stri = new String("ABC");
		int price = 0;
		// 변수 이름은 길게 쓰는게 좋다. 나중에 못 알아봄.
//		영어공부도 할겸 ㅇ

		System.out.println("금액을 입력하세요");
		price = scanner.nextInt(); //nextInt 정수값을 scanner 문자열이나 숫자를.
		
		if (price > 8000) {
			System.out.println(" 너무 비쌉니다 ");
		} else if (price > 5000) {
			System.out.println(" 조금 비쌉니다 ");
		} else if (price > 3000) {
			System.out.println(" 적당한 금액입니다 ");
		} else {
			System.out.println(" 싼 편입니다 ");
		} // if &&(~하고)

	}// main

}// if_03
