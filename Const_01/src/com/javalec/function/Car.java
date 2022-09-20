package com.javalec.function;

public class Car {
	
	
	// Fields
	public String company = "현대 자동차";
	public String model = "자가용";
	public String color = "빨강";
	public int Speed = 200;
	

	// Constructor//같은 생성자 이름인데도 쓸수있음//오버로딩
	public  Car() {
		
	}
	public  Car(String model) {
		
		
	}
	public  Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		
	}
	public Car(String model, String color, String Speed) {
		super();
		this.model = model;
		this.color = color;
		
	}
	
//	public Car(String model) {
//		super();
//		this.model = model;
//	} // 우클릭 source 하단 G+C using Fields

	
	// Method
	
	
	

}
