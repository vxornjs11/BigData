package com.javalec.base;

public class Fo_05 {

	public static void main(String[] args) {
		// 10의 10 0제곱 ~ 10 10까지의 제곱승을 구하라.
		long number = 1;
		int j = 0;
		int i = 0;

		
//		for(int i = 0; i<=10; i++) {
//			long result = (long) Math.pow(10, i+1);
//			System.out.println( 10 +  " ^ " + i + " = " +String.format("%13d", result));
//		}
		for( i = 1; i<= 10; i++) {
			number = number * 10;
			System.out.print(10 + " ^ " + i + " = \t" );
			System.out.printf("%12d%n" , number);
		}

	}

}
