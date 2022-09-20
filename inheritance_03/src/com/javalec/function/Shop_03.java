package com.javalec.function;

public class Shop_03 extends StoreHQ {
	@Override
	public void orderKIm() {
		System.out.println("김치찌개 : 6,000원");
	}
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 7,000원");
	}
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 7,000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 7,000원");
	}
	public void orderKong() {
		System.out.println("공기밥(HQ) : 1,000원");
	}

}
