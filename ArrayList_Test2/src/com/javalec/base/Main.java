package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum;
		String inputName;
		String inputPhone;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Customer> arrayListCustomer = new ArrayList<Customer>();
		
		while(true) {
			System.out.print("고객번호를 입력하세요 :");
			inputNum = scanner.nextInt();

			if(inputNum == 0) {
				for(int i=0; i<arrayListCustomer.size(); i++) {
					System.out.print(arrayListCustomer.get(i).getNumber() + " | ");
					System.out.print(arrayListCustomer.get(i).getName() + " | ");
					System.out.println(arrayListCustomer.get(i).getPhone());
				}
				break;
			}
			
			System.out.print("고객명을 입력하세요 :");
			inputName = scanner.next();
			System.out.print("전화번호를 입력하세요 :");
			inputPhone = scanner.next();
			
			Customer customer = new Customer(inputNum, inputName, inputPhone);
			arrayListCustomer.add(customer);
			System.out.println(arrayListCustomer.size());
			
			
		}
		
	}

}
