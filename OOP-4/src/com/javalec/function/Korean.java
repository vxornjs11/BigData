package com.javalec.function;

//class
public class Korean {
	
	//Filed
	 String name = "";
	 String nation = "대한민국";
	 String phone = "";
	
	
	//Consturctor
	
	public Korean(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		printName2();
		
	}
	

	//Method
	public void printName(String name, String phone){
		System.out.println("Nation : " + nation);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}
	
	public void printName2(){
		System.out.println("Nation : " + nation);
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
	}

}
