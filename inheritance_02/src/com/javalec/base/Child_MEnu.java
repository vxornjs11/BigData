package com.javalec.base;

public class Child_MEnu extends ParentsMenu {
	
	
	public Child_MEnu() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	public void makekongNA() {
		System.out.println("콩나물 국");
		
	}
	
	@Override
	public void makeChung() {
		super.makeChung();
		System.out.println("냄새없는 청국장");
	}

}
