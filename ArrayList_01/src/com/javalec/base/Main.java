package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>>>> Array <<<<<");
		
		ArrayList<String> arrayList = new ArrayList<>();
        // <> Generic
		// Data 추가  // CRUD를 쓸줄안다. create read update delete
		//C
		arrayList.add("str1");
		arrayList.add("str4");
		arrayList.add("str3");
		arrayList.add("str2");
		//C
		
		//R 읽기.
		System.out.println(arrayList.toString());
		System.out.println(arrayList.get(2));
		//R
		
		//변경하기//U
		arrayList.set(1, "str44");
		System.out.println(arrayList.toString());
		
		
		//삭제하기
		arrayList.remove(1);
		System.out.println(arrayList.toString());
		arrayList.remove("str2");
		System.out.println(arrayList.toString());
		
		// 크기알기
		System.out.println(arrayList.size());
	
		
		
	}

}
