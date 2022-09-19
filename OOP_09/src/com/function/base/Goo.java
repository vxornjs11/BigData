package com.function.base;

public class Goo {
	
	//Filed
	public int i;
	public int j;
	

	
	
	
	//constructor
	public Goo() {
		
	}
	
	
	
	
	
	//Method
	
	public void art(int k) {
		for(i=k;i<=k;i++){
			for(j=1; j<10; j++) {
			
			if(j % 2 ==0) {
				System.out.println(i + "x" + "*" + "=" + i*j);
			}else {
				System.out.println( i + "X" + j + "=" + i*j);
			}
			}
		}
		return;
	}

}
