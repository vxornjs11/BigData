package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Test;

public class Main {

	public static void main(String[] args) {
		int i;
		int j;
		int sub =0;
		int add =0;
		int mul =0;
		double div =0.00;
		double dust =0.00;
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력 하세요 " );
		i = scanner.nextInt();
		System.out.println("두번째 숫자를 입력 하세요 ");
		j = scanner.nextInt();
		
		Test addnum = new Test(i, j);

		add = addnum.addCalc();
		sub = addnum.subCalc();
		mul = addnum.mulCalc();
		div = addnum.divCalc();
		dust = addnum.dustCalc();
		System.out.println("덧셈 결과 :" + add);
		System.out.println("뺄셈 결과 :" + sub);
		System.out.println("곱셈 결과 :" + mul);
		System.out.println("나눗셈 결과 :" + div);
		System.out.println("나눗셈 나머지 결과 : " + dust);
		
	}

}
