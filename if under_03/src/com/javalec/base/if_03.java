package com.javalec.base;

public class if_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int j = 20;

		if (i < j) {
			System.out.println("i는 j 보다" + (i - j) + "만큼 큽니다");

		} else if(i < j) {
			System.out.println("j는 i 보다" + (j - i) + "만큼 큽니다");
		} else {
			System.out.println("i와 j는 동일합니다");//if(조건) > else if(대상이 같은 조건) > else if > else(기타등등)
		}
		System.out.println("계산이 완료되었습니다.");

	}// main

}// IF_03
