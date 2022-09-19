package com.javalec.function;

//class
public class Test {

	// Filed
	int startNum = 0;
	int endNum = 0;

	// 생성자
	public Test(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;

	}

	// Method
	public int addCalc() {

		return startNum + endNum;
	}
	// 첫번째 입력값과 두번째 입력값의 더하기
	public int subCalc() {

		return startNum - endNum;
	}

    // 첫번째 입력값과 두번째 입력값의 빼기
	public int mulCalc() {

		return startNum * endNum;
	}
	// 첫번째 입력값과 두번째 입력값의 곱하기
	public int divCalc() {

		return startNum / endNum;

	}
	// 첫번째 입력값과 두번째 입력값의 나누기
	public int dustCalc() {

		return startNum % endNum;
	}
}   // 첫번째 입력값과 두번째 입력값의 나누기 나머지
