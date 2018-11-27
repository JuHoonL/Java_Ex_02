package com.biz.ex02.vo;

public class GradeVO {
	/*
	 1. 학번(문자열), 국어점수(정수형), 영어점수(정수형), 수학점수(정수형), 총점(정수형), 평균(실수형) 을 저장할 Member 변수를 선언
	 2. Member변수에 접근할 getter, setter method 생성
	 3. toString() method 재정의
	 */
	
	private String strNum;
	private int intKor;
	private int intEng;
	private int intMth;
	
	private int intSum;
	private float floatAvg;

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMth() {
		return intMth;
	}
	public void setIntMth(int intMth) {
		this.intMth = intMth;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	
	public String toString() {
		return "GradeVO [학 번 =" + strNum + ", 국어점수 =" + intKor + ", 영어점수 =" + intEng + ", 수학점수 =" + intMth
				+ ", 총점 =" + intSum + ", 평균 =" + floatAvg + "]";
	}
	
	
}
