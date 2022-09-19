package com.javalec.function;

public class StringTest {
	
	    //얘는 홀수인지 짝수인지 알려줌.
	
		public String evenOdd(int sum) {
		String result = "";
		if(sum % 2 ==0) {
			result = "짝수";

		}else {
			result = "홀수";
		}
		return result;
	}


}
