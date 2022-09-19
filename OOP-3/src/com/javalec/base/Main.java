package com.javalec.base;

import com.javalec.function.car;

public class Main {

	public static void main(String[] args) {
		car car = new car();
		
		System.out.println( "제작회사 : " + car.company);
		System.out.println( "모델명 : " + car.midel);
		System.out.println( "색상 : " + car.color);
		System.out.println( "최고속도 : " + car.maxSpeede);
		System.out.println( "최고속도 : " + car.speed);
		
		car.speed = 60;
		System.out.println( "수정된 최고속도 : " + car.speed);
		
		car myCar = new car(); //new<< 새로 만든것. 같지않다.
		System.out.println("my카의 속도 : " + myCar.speed);
		
		System.out.println(car == myCar);
	}
}
