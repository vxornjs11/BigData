package com.javalec.function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreHQ storeHQ = new StoreHQ();
		System.out.println("HQ================");
		
		storeHQ.orderKIm();
		storeHQ.orderBu();
		storeHQ.orderBi();
		storeHQ.orderSoon();
		storeHQ.orderKong();
		
		StoreHQ shop_01 = new Shop_01();
		System.out.println("\n"+"Shop1============");
		
		shop_01.orderKIm();
		shop_01.orderBu();
		shop_01.orderBi();
		shop_01.orderSoon();
		shop_01.orderKong();
		
		
		StoreHQ shop_02 = new Shop_02();
		System.out.println("\n"+"Shop2============");
		
		shop_02.orderKIm();
		shop_02.orderBu();
		shop_02.orderBi();
		shop_02.orderSoon();
		shop_02.orderKong();
		
		StoreHQ shop_03 = new Shop_03();
		System.out.println("\n"+"Shop2============");
		
		shop_03.orderKIm();
		shop_03.orderBu();
		shop_03.orderBi();
		shop_03.orderSoon();
		shop_03.orderKong();
		
	
		StoreHQ[] store = {new StoreHQ(), new Shop_01(), new Shop_02(), new Shop_03()};
		for(int i=0; i<store.length; i++) {
			if(i == 0) {
				System.out.println( "\n"+"ShopHq" +"=================");
			}
			store[i].orderKIm();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
			if(i+1 != 4) {
				System.out.println( "\n"+"Shop" + (i+1) +"=================");
			}
		}
		
		
		
		
	}

}
