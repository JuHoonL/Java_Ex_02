package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.VO.UserVO;

public class UserExec02 {

	public static void main(String[] args) {
		/*
		 * Main에서 키보드로 부터 한 학생에 대한 학번, 학생이름, 학년, 주소, 전화번호를 입력받아 UserVO에 저장 
		 * 이를 console에 나타나도록 출력하라
		 */
	
		UserVO uV = new UserVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학 번 : ");
		String strNum = scanner.nextLine();
		uV.setStrNum(strNum);
		
		System.out.print("학생이름 : ");
		String strName = scanner.nextLine();
		uV.setStrName(strName);
		
		System.out.print("학 년 : ");
		String strGrade = scanner.nextLine();
		uV.setStrGrade(strGrade);
		
		System.out.print("주 소 : ");
		String strAddress = scanner.nextLine();
		uV.setStrAdd(strAddress);
		
		System.out.print("전화번호 : ");
		String strPhNum = scanner.nextLine();
		uV.setStrPhNum(strPhNum);
		
		System.out.println(uV.toString());
	}

}
