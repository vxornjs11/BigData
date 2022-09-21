package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
	    int num = 0;
		int num2 = 0;
		int i = 0;
		
		System.out.print("입력할 숫자의 갯수 :");
		num = scanner.nextInt();
		System.out.println(num + "의 숫자를 입력 하세요.");
		for (i = 1; i <= num; i++) {
			System.out.print(i + "의 숫자");
			arrayList.add(scanner.nextInt());
		}
		System.out.print("몇번째 숫자를 삭제하시겠습니까?");
		num2 = scanner.nextInt();
		arrayList.remove(num2-1);
		System.out.println(" -------결과------");
		for (i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

	}
}
