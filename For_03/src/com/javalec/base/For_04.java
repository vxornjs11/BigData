package com.javalec.base;

import java.util.Scanner;

public class For_04 {

	public static void main(String[] args) {
				// 몇개의 숫자를 입력하겠습니까? 4
		//  1번째 숫자를 입력 하세요 : 1
		//  2번째 숫자를 입력 하세요 : 2
		//  3번째 숫자를 입력 하세요 : 3
		//  4번째 숫자를 입력 하세요 : 4
		// 귀하가 입력하신 숫자는 1 2 3 4 이고 합계는 __ 이고
		// 평균은 __입니다. 배열의 첫 숫자는 100이라고 치자.
		// 그중 홀수의 갯수는 _이고 짝수의 갯수는 _입니다.
		String str = new String();
		int num = 0;
//		int startNum =0;
		int outnumber = 0;
		int n = 0;
		int join = 0;
//		int[] joinNum = {n};
		
		Scanner scanner1 = new Scanner(System.in);
		
	
		System.out.println("몇개의 숫자를 입력 하시겠습니까? :"  );
		num = scanner1.nextInt();
		
		for (int i = 1; i<= num; i++) {
			System.out.println( (i) + "번째 숫자를 입력 하세요 : " );
			join = scanner1.nextInt();
			if (i<2) {
				System.out.println();
			}
		
			 
			
		
			
			
		
		}
//		System.out.println(n);

//		System.out.println(" 귀하가 입력하신 숫자는 " + join + "이고");
////		
	
		
		
		

	}

}
