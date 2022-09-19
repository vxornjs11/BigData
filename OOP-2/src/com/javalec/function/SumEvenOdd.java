package com.javalec.function;

public class SumEvenOdd {


		// TODO Auto-generated constructor stub
		// public 반대 Privata?
		// int. double. String . void
		

	// 얘는 시작부터 끝까지의 합계를 구해줌.
	public int  sumCalc(int startNum, int endNum) {
		int sum = 0;
		for(int i=startNum; i <= endNum; i++) {
			sum+=i;
			
		}
		return sum;
	}
	
	
	

}
