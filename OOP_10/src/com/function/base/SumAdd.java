package com.function.base;

public class SumAdd {
	
	
	//F
	public int num;
	int sum =0;
	
	
	//C
	public SumAdd() {
		
	}
	
	
	
	//M
	public void sum() {
		 while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }

	        System.out.println("숫자의 총합 : "+ sum);
	}
	
	

}
