package com.javalec.base;

public class Child3 extends Lunch_Menu {
	
	
	public Child3() {
		// TODO Auto-generated constructor stub
	}
	
	public Child3(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}

	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice + bulgogi;
	}

}
