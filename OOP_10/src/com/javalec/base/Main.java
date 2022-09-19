package com.javalec.base;

import java.util.Scanner;

import com.function.base.SumAdd;

public class Main {

	public static void main(String[] args) {
		int num;
		System.out.println("한 자리수 정수를 입력 하시오 .");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		SumAdd sumAdd = new SumAdd();
		sumAdd.num = num;
		
		sumAdd.sum();

	}

}
