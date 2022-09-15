package com.javalec.base;

import java.util.Scanner;

public class For_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 몇개의 숫자를 입력 할지 결정한 후
		// 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악.
		int num = 0;
		int k = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println(" 입력할 숫자의 갯수 ? ");
	num = scanner.nextInt();
	
	int [] intNum = new int [num];
	System.out.println(num + "개의 숫자를 입력 하세요 !");
	
	for ( int i = 0; i < intNum.length; i++) {	
		System.out.print(i+1 + "의 숫자  : " );
		intNum[i] = scanner.nextInt();
		
	}
	
	System.out.println("검색할 숫자는 ? : " );
	for (int i = 0; i < intNum.length; i++) {
		i = scanner.nextInt();
		System.out.println( i  + "의 위치는 "  + intNum[i] + "입니다");
		
	}
	
	
	
		

	

	}

}
