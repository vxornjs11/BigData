package com.javalec.function;

public class StoreShop1 extends StoreHQ {

	@Override
	public void orderKIm() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");
	}
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5,000원");
	}
	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 6,000원");
	}
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않습니다.");
	}
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		System.out.println("공기밥 : 1,000원");
	}

}
