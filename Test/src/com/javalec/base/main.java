package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		double average;

		System.out.println("국어 점수를 입력하세요!");
		kor = scanner.nextInt();
		if (kor < 0 || kor > 100) {
			System.out.println("0부터 100사이로 다시 입력하세요.");
			kor = scanner.nextInt();
			
			
		}// kor if 0 보다 작은 100보다 큰 if
		
		System.out.println("영어 점수를 입력하세요!");
		eng = scanner.nextInt();
		if (eng < 0 || eng > 100) {
			System.out.println("0부터 100사이로 다시 입력하세요.");
			eng = scanner.nextInt();
		}// eng if 0 보다 작은 100보다 큰 if

		System.out.println("수학 점수를 입력하세요!");
		math = scanner.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("0부터 100사이로 다시 입력하세요.");
			math = scanner.nextInt();
		}// math if 0 보다 작은 100보다 큰 if
		

		average = (double) (kor + eng + math) / 3;
		System.out.println("평균 점수 : " + average);
		

		if (kor > average) {
			System.out.println("국어 점수는 평균 보다 높습니다.");
		} else if (kor == average) {
			System.out.println("국어 점수는 평균 점수 입니다.");
		} else  {
			System.out.println("국어 점수는 평균 보다 낮습니다.");
		}

		if (eng > average) {
			System.out.println("영어 점수는 평균 보다 높습니다.");
		} else if (eng == average) {
			System.out.println("영어 점수는 평균 점수 입니다.");
		} else  {
			System.out.println("영어 점수는 평균 보다 낮습니다.");
		}
		
		if (math > average) {
			System.out.println("수학 점수는 평균 보다 높습니다.");
		} else if (math == average) {
			System.out.println("수학 점수는 평균 점수 입니다.");
		} else  {
			System.out.println("수학 점수는 평균 보다 낮습니다.");
		}
		// if_test	

	}// main

}
