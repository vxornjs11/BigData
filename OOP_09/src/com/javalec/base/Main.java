package com.javalec.base;

import java.util.Scanner;

import com.function.base.Goo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("구구단을 출력할 숫자를 입력하세요 :");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int k = num;
		Goo goo = new Goo();
		
		goo.art(k);
		

	}

}
