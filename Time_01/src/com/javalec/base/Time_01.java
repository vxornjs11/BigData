package com.javalec.base;

public class Time_01 {

	public static void main(String[] args) {
		String str1 = "a";
		
		Long starTime1 = System.currentTimeMillis(); // 현재 시스템 시간을알려줌?
		
		for (int i  =1; i<= 50000; i++) {
			str1 = str1  +"a" ;
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("Term1 : " + (endTime1 - starTime1));
		
		StringBuilder stringBuilder = new StringBuilder("a");
		long starTime2 = System.currentTimeMillis();
		for (int i=1; i<=50000; i++) {
			 stringBuilder = stringBuilder.append("a");
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Term1 : " + (endTime2 - starTime2));

	}

}
