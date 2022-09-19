package com.javalec.base;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = new String("aaaa");
		//  클라스 . 객체.      생성자.
		String str1= "abcdefg";
		String str2= "HIJKLMN";
		String str3= "opqrstu";
		String str4= "   abc   def   ghi   ";
		String str5= "   abcdefghi   ";
		

		System.out.println(str1.concat(str2));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 5));
		
		String abc = str1.substring(3, 5);
		
		System.out.println(str1.length()); // 몇 글자 이상으로 아이디를 만드세요 할때 몇 글자인지 어떻게 아느냐. length로 아는거다.
		System.out.println(str1.toUpperCase()); // 대문자 바꾸기
		System.out.println(str1.toLowerCase()); // 소문자 바꾸기 영어놈들 자기 이름을 James 이렇게 대문자 붙여 쓰는게 버릇이라서 그런거 수정해줌.
		
		System.out.println(!str1.equals(str2));
		System.out.println((str4.trim())); // 앞 뒤 공백을 지워줌.
		System.out.println((str4.trim().length())); // 앞 뒤 공백을 지워줌. 뒤에 . 찍고 가능... 나중에 입력동의 할때 필수로 써야함. 아이디 스페이스로 눌러서 글자수 오버할수도
		System.out.println(str1.replace("a", "z")); // 글자 a를 z로 바꿔줍니다.
		System.out.println(str1.replaceAll("abc", "zzzzzz")); // 글자 abc를 z로 바꿔줍니다. 이퀄를 해야 str1이 바뀜.
		
		System.out.println(str1.replaceAll("abc", "")); //나는 abc를 지우고 싶어... defg만 쓸거야.
		
		
		
		
		

	}

}
