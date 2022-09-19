package com.javalec.base;

import java.util.Random;

public class Random_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String [] GBB = {"가위" , "바위" , "보"};
		
		for (int i=2; i <=GBB.length; i++) {
			
				System.out.println(GBB[random.nextInt(i)]);
		
		}

	}

}
