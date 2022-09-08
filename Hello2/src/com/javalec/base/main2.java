package com.javalec.base;

import java.util.Random;

public class main2 {
	

	public static int[] playBaseball() {
		int strike = 0;
		int ball = 0;
		int[] ans = new int[4];
		int[] randArr = new int[4];
		Random rand = new Random();
		
		// 0~9까지의 랜덤변수 4개를 맞추는 배열과 맞추는 배열에 저장 
		for(int i=0;i<4;i++) {
			randArr[i] = rand.nextInt(10);
			ans[i] = rand.nextInt(10);
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(randArr[j] == ans[i]) {
					if(i == j) {
						strike++;
						System.out.println(strike+"Strike");
					}else {
						ball++;
						System.out.println(ball+"Ball");
					}
				}
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		double b1 = 20;
		double b11 = num1;

	}

}
