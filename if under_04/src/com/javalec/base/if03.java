package com.javalec.base;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int price = 0;

		System.out.println("금액을 입력하세요");
		price = scanner.nextInt();
		if (price > 8000) {
			System.out.println(" 너무 비쌉니다 ");
		} else if (price > 5000) {
			System.out.println(" 조금 비쌉니다 ");
		} else if (price > 3000) {
			System.out.println(" 적당한 금액입니다 ");
		} else {
			System.out.println(" 싼 편입니다 ");
		}//if &&(~하고)

	}//main
	

}//if_03
