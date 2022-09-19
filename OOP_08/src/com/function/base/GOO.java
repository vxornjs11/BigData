package com.function.base;

public class GOO {
	
	// Fields
	public int dan = 0;
	public int k;
	
	
	
	
	// Constructor
	public GOO() {
		
	}
	
	
	
	
	// Method
	public String[] gugudan() {
		String [] result = new String[9];
		for (int i=1; i<=9; i++) {
			result[i-1] = (dan + "X" +  i + "=" + (dan*i));
			
		}
		return result;
	}
//	public void calc() {
//		for (int j = 1; j<10; j++) {
//			
//			System.out.println( i + "x" + j + "=" + i*j);
//		}
//
//	}
//	public void str(int i ) {
//		String goo [] = new String [10];
//		for(int j = 1; j< goo.length; j++ ) {
//			goo[i] += j;
//			System.out.println(i + "x" + j + "=" + i*j);
//
//		}
//		return;
//		
//	}


}
