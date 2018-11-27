package com.biz.ex02.vo;

public class UserVO {

		/*
		 * 학번(문자열), 학생이름(문자열), 학년(문자열), 주소(문자열), 전화번호(문자열)을 저장할 Member변수를 선언
		 * Member 변수에 접근할 getter,setter method 생성
		 * toString()메서드 재 정의
		 */
	
	private String strNum;
	private String strName;
	private String strGrade;
	private String strAddress;
	private String strPhNum;

	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public String getStrAdd() {
		return strAddress;
	}
	public void setStrAdd(String strAdd) {
		this.strAddress = strAdd;
	}
	public String getStrPhNum() {
		return strPhNum;
	}
	public void setStrPhNum(String strPhNum) {
		this.strPhNum = strPhNum;
	}

	public String toString() {
		return "UserVO [strNum=" + strNum + ", strName=" + strName + ", strGrade=" + strGrade + ", strAdd=" + strAddress
				+ ", strPhNum=" + strPhNum + "]";
	}
	
	
		
}
