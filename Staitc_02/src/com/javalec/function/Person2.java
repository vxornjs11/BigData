package com.javalec.function;

import java.util.Scanner;

public class Person2 {
	public int af;

	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public void takegift() {
		System.out.println("2번 친구에게 선물할 갯수를 선택 하시오.");
		Scanner scanner = new Scanner(System.in);
		af = scanner.nextInt();
		if (af <= 0) {
			System.out.println("당신은 소중한 친구에게 선물을 주지 않았습니다...");
		} else if (Gift.gift == af) {
			System.out.println("남은 선물 갯수가 없습니다.");
		} else if (Gift.gift < af) {
			System.out.println("남은 선물 갯수가 모자랍니다.");
		} else {
			Gift.gift = Gift.gift - af;
			System.out.println("남은 선물의 갯수는 " + Gift.gift + "입니다.");
		}

	}

}
