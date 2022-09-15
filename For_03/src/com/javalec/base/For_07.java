package com.javalec.base;

import java.util.Scanner;

public class For_07 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int [10];
		
		System.out.println("Input score");
		// 데이터 받아오기
		for (int i =0; i < histo.length; i++) {
			System.out.print((i+1) + "의 Score : " );
			histo[scanner. nextInt()/10]++;
		}
		scanner.close();
		
		for (int i =0; i<histo.length; i++) {
			System.out.println(histo[i]);
		}
		
		// 받아온 데이터 히스토그램 타입으로 출력하기
		System.out.println(" ----- Histogram -----");
		for(int i =(histo.length -1); i>=0; i--) {
			System.out.print(String.format("%3d : ",i*10));
			for(int j=0; j<histo[i];j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}


//		int num = 0;
//		int i;
//		int j;
//		int[] intNum = new int[10];
////		int[] count;
////		count[num/10]++;
//		System.out.println("Input score");
//		Scanner scanner = new Scanner(System.in);
//		
//		for (i = 0; i < intNum.length; i++) {
//			System.out.println((i+1) + "의 score : ");
//			num = scanner.nextInt();
//			
//			
//		
//
//		} // for
//		System.out.println("------- Histogram -------");
//		for( j = 0; j < intNum.length; j++) {
//			int[] count = new int [10];
//			count[num/intNum.length]++;
//			System.out.println( intNum.length*j + " : "  + count[j]);
//			
//		}
//	