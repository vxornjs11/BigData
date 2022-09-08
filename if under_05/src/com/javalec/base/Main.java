package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);
		double 학점;
		System.out.println("점수를 입력하세요 :");
		학점 = scanner.nextInt();
		if (학점 >= 90) {
			System.out.println("귀하는 A 학점 입니다.");
		} else if (학점 >= 80) {
			System.out.println("귀하는 B 학점 입니다.");
		} else if (학점 >= 70) {
			System.out.println("귀하는 C 학점 입니다.");
		} else if (학점 >= 60) {
			System.out.println("귀하는 D 학점 입니다.");
		} else if (학점 >= 0) {
			System.out.println("귀하는 F 학점 입니다.");
		} else if (학점 < 0) {
			System.out.println("잘못된 입력 입니다.");
		}

	}

}
