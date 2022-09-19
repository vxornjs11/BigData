package com.javalec.base;

import com.javalec.function.StringTest;
import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		int sum = 0;
		String result = "";
		// property : Fields
		// Constructor 생성자
		// Method 
		// 클라스 이름 앞에 *가 ㅆ있으면 저장 안한거임.
		
	
		
		// 이 아이가 그걸 할 수 있는 도구의 이름은 sumCalc이다.
		// 그 합계가 홀수인지 짝수인지 구해라.
		// 이 기능을 할수 있는 아이는 StringTest // class
		// 이걸 할 수 있는 도구의 이름은 evenOdd다.//Method
		// 이제 시작값 부터 끝값의 합계를 구하고 이것이 홀수인지 짝수인지 구하고싶다.
		// 아이의 이름이 = instance
		
		SumEvenOdd num1 = new SumEvenOdd();
		StringTest str1 = new StringTest();
		sum = num1.sumCalc(i,j);
	    result = str1.evenOdd(sum);
		
		System.out.println( i + "와 " + j + "의 합은 : " + sum + "입니다.");
		System.out.println(result + "입니다.");
		
		

	}

}
