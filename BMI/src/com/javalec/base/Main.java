package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// BMI를 이용한 비만도 계산은 자신의 몸무게를 키의 제곱으로 나누는 것으로 공식은 kg/㎡. BMI가 18.5 이하면 저체중 ／ 18.5 ~ 22.9 사이면 정상 ／ 23.0 ~ 24.9 사이면 과체중 ／ 25.0 이상부터는 비만으로 판정.
		Scanner scanner = new Scanner(System.in);
		double kg = 0;
		double m = 0;
		double bmi;
				
		
		System.out.println("키를 입력 하세요!");
		m = scanner.nextInt();
		System.out.println("몸무게를 입력하세요!");
		kg= scanner.nextInt();
		bmi = (double) kg/(m*m/100/100);
		System.out.println("평균 점수 : " + (double)bmi );
		if(bmi <0) {
			System.out.println("잘못된 bmi 입니다.");
		}else if ((double)bmi <= 18.4) {
			System.out.println("저체중");
		}else if ((double)bmi <= 22.9) {
			System.out.println("정상체중");
		}else if ((double)bmi <= 24.9) {
			System.out.println("과체중");
		}else if ((double)bmi >= 25.0) {
			System.out.println("비만");
		}

	}

}
