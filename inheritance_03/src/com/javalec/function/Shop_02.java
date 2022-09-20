package com.javalec.function;

public class Shop_02 extends StoreHQ {
	
	public void orderKIm() {
		System.out.println("김치찌개(HQ) : 5,000원");
	}
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5,000원");
	}
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 5,000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 4,000원");
	}
	@Override
	public void orderKong() {
		System.out.println("공기밥 : 무료입니다.");
	}

}
