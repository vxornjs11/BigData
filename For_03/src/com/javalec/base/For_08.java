package com.javalec.base;

import java.util.Scanner;

public class For_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int [] intNum = new int [4];
		int [] eng = new int [4];
		int [] Math = new int [4];
		int sum = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("korean의 성적을 입력");
			for(int i = 0; i< intNum.length; i++) {
				System.out.print("no"+(i+1)+"의 성적은 : "  );
				intNum[i] = scanner.nextInt();
				
				
				
			}System.out.println("eng의 성적을 입력");
			for(int i = 0; i< eng.length; i++) {
				System.out.print("no"+(i+1)+"의 성적은 : "  );
				eng[i] = scanner.nextInt();
			    
			}System.out.println("Math의 성적을 입력");
			for(int i = 0; i< Math.length; i++) {
				System.out.print("no"+(i+1)+"의 성적은 : "  );
				Math[i] = scanner.nextInt();
			    
			}
			
	
			
			 System.out.print("\t" + "kor" + "\t" + "Eng" +"\t" +  "Math" + "\t" + "Sum");
	
			 
			for (int i = 0; i<intNum.length; i++) {
				sum += (intNum[i]+ eng[i]+Math[i]);
				
				
				System.out.println("\n" + "" +  "no"+(i+1) + "\t" +  intNum[i] + "\t" + eng[i]+ "\t" + Math[i]+ "\t" + sum);
				
				
				
				System.out.println(sum=0);
				
				
				

				
				
				
				
			}
//			System.out.println(intNum[i]);


	}

}
