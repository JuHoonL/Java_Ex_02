package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		/*
		 1. main에서 키보드로 부터 한 학생에 대한 학번, 국어점수, 영어점수, 수학점수를 입력 받아 GradeVO에 저장
		 2. 저장된 정보를 console에 표시
		 	단, 총점과 평균을 계산하여 같이 표시하도록 코드를 수정
		 */
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학 번 : ");
		String strNum = scanner.nextLine();
		gradeVO.setStrNum(strNum);
		
		System.out.print("국어점수 : ");
		String strKor = scanner.nextLine();
		gradeVO.setIntKor(Integer.valueOf(strKor));
		
		System.out.print("영어점수 : ");
		String strEng = scanner.nextLine();
		gradeVO.setIntEng(Integer.valueOf(strEng));
		
		System.out.print("수학점수 : ");
		String strMth = scanner.nextLine();
		gradeVO.setIntMth(Integer.valueOf(strMth));
		
		int intSum = 0;
		intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMth();
		gradeVO.setIntSum(intSum);
		
		gradeVO.setFloatAvg(intSum / 3.0f);
		
		System.out.println(gradeVO);		// .toString()이 println에 포함되어있음
		
		
		
	}
	
	

}
