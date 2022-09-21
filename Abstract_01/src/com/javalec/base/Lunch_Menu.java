package com.javalec.base;

public abstract class Lunch_Menu {
	
	//f
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	
	
	
	
	
	//C
	
	public Lunch_Menu() {
		// TODO Auto-generated constructor stub
	}

	public Lunch_Menu(int rice, int bulgogi, int banana, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	
	
	//M
	
	public abstract int calc();
	

}
