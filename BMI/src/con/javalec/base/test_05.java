package con.javalec.base;

import java.util.Scanner;

public class test_05 {

	public static void main(String[] args) {
		
		//	입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		// : (0~9)123456
		// = 36
		int number = 0;
		int i = 0;
		int tot = 0;
		int result = 0;
		int sum = 0;
		
		//while
		
//		123 % 10 = 3  123/10 12 % 10 2. 
//				123 % 10 
//				12 // 3
//				12 % 10
//				1 // 2
//				1 % 10
//				for ( i = 0; i < 10; i++) {
//					245 10 24 5
//				}
//	
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 숫자의 갯수 ? ");
		number = scanner.nextInt();
		// 0 ~ 9
		while (number % 10 != 0) {
			result = number % 10 ;
			
		}
		
		System.out.println("Sum of digits =" + sum);

	}
}
//} result = number % 10 ;
