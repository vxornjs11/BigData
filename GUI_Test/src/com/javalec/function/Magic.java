package com.javalec.function;

public class Magic {

	//f
		public String a;
		public String m;
		public String s;
		public String d;
		public String M;
		
		
		
		
		//C
		public Magic(String a, String m) {
			super();
			this.a = a;
			this.m = m;
		}
		
		
		
		
		//M
		public String magicChange() {
			if(a == "+")  {
				 m = "+";
			}return m;
			
			}
		public String magicChange2() {
			if(a == "X")  {
				m = "X";
			}
			return m;
		}
		public String magicChange3() {
			if(a == "-")  {
				m = "-"; 
			}return m;
			
			}
		public String magicChange4() {
			if(a == "/")  {
			  m = "/";
			}return m;
			
			}
		
}
