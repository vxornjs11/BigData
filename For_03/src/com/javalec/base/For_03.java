package com.javalec.base;

import java.util.Scanner;

public class For_03 {

	public static void main(String[] args) {
		
		// 홀수의 합계 평균은 ___입니다
		// 짝수의 합계 평균은 ___입니다.
		Scanner scanner = new Scanner(System.in);
		
		int startNum = 0;
		int endNum =0;
		int sum = 0;
		int oddsum =0;
		int evenSum =0;
		int odd = 0;
		int evensum = 0;
		int even = 0;
		double oddaver = 0;
		double average = 0.0;
		
		System.out.println("시작값을 입력하세요 :");
		startNum = scanner.nextInt();
		
		System.out.println("끝값을 입력하세요 : ");
		endNum = scanner.nextInt();
		
		for(int i = startNum; i<=endNum; i++) {
			if((i+1) % 2!=0) {
				oddsum = oddsum+(i+1);
				odd += 1;
			}else if ((i+1) % 2==0){
				evensum = evensum +(i+1);
				even += 1;
			}
		} oddaver =  (double) oddsum/odd;
		average = (double) evensum/even;
		System.out.println(oddsum + "+" + evensum + "홀수의 합계 평균" + oddaver + "짝수의 합계 평균 " + average);
		

	}

}
