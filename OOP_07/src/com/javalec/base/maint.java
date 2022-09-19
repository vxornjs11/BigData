package com.javalec.base;

import com.javalec.function.Calculation;
import com.javalec.function.Calculation2;
import com.javalec.function.Calculation3;

public class maint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculation calculation = new Calculation();
		calculation.num1 = 3;
		calculation.num2 = 2;
		
		calculation.calc();
		
		// ------------------------------------
		Calculation2 calculation2 = new Calculation2();
		calculation2.calc(3, 2);
		
//		------------------------------------
		Calculation3 calculation3 = new Calculation3(3, 2);
		
		
	}

}
