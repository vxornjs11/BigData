package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> arraycustomer = new ArrayList<Customer>();
		
		Customer customer = new Customer(1, "James", "010-1111-2222");
		
		arraycustomer.add(customer);
		
		Customer customer2 = new Customer();
		customer2.setNumber(2);
		customer2.setName("Cathy");
		customer2.setPhone("010-7777-8888");
		arraycustomer.add(customer2);
		
		
		
		System.out.println(arraycustomer.get(0).getName());
		System.out.println(arraycustomer.get(0).getPhone());
		//int String2개 가능한 데이터 타입을 우리가 만들어서 넣었다.

	}

}
