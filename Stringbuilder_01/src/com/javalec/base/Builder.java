package com.javalec.base;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder("abdcdefg");
		StringBuffer stringBuffer = new StringBuffer("12345");
		
		System.out.println(stringBuilder);
		stringBuilder.append("hijkjklmn"); // 이퀄 싸인이 없어도 바로 들어감.
		stringBuilder.insert(3, "zzz");   /// 사이에 넣기
		stringBuilder.delete(3, 5);   /// 사이 삭제하기
	
		
		System.out.println(stringBuilder);

	}

}
