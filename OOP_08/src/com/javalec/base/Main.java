package com.javalec.base;

import java.util.Scanner;

import com.function.base.GOO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		
		GOO goo = new GOO();
//		GOO joo = new GOO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단을 출력할 숫자를 입력하세요 : " );
		dan = scanner.nextInt();
		goo.dan =dan;
		
		
		
		String[]stringarr =	  goo.gugudan();
		for(int i =0; i<stringarr.length; i++) {
			
			System.out.println(stringarr[i]);
		}
		
		

	}

}
