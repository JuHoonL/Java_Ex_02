package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec04 {
	
	Scanner scanner;

	public static void main(String[] args) {
		/*
		 1. Main에서 키보드로 부터 5명 학생에 대한 학번, 국어점수, 영어점수, 수학점수를 입력 받아 List<GradeVO>에 저장
		 2. 저장된 전체 학생의 점수와 총점, 평균을 계산한 후  console에 표시
		 */
		List<GradeVO> gradeList = new ArrayList();
		
		
		for(int i = 0 ; i < 2 ; i ++){
			GradeVO vo = new GradeVO();
			
			// GradeVO를 vo로 생성해서 매개변수로 전달
			makeScore(vo);
			
			// 전달했던 vo를 gradeList에 추가
			gradeList.add(vo);
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("학번\t\t국어점수\t영어점수\t수학점수\t\t총점\t평균점수");
		System.out.println("=============================================================");
		for(GradeVO vo : gradeList) {
			viewScore(vo);
		} 
	}
	public static void makeScore(GradeVO vo) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 : ");
		String strNum = scanner.nextLine();
		vo.setStrNum(strNum);
		
		System.out.print("국어점수 : ");
		String strKor = scanner.nextLine();
		vo.setIntKor(Integer.valueOf(strKor));
		
		System.out.print("영어점수 : ");
		String strEng = scanner.nextLine();
		vo.setIntEng(Integer.valueOf(strEng));
		
		System.out.print("수학점수 : ");
		String strMth = scanner.nextLine();
		vo.setIntMth(Integer.valueOf(strMth));
	
		int intSum = vo.getIntKor();
		intSum += vo.getIntEng();
		intSum += vo.getIntMth();
		vo.setIntSum(intSum);
		
		vo.setFloatAvg(intSum / 3.0f);
	}
	
	public static void viewScore(GradeVO v) {
		System.out.print(v.getStrNum() + "\t" + "\t");
		System.out.print(v.getIntKor() + "\t");
		System.out.print(v.getIntEng() + "\t");
		System.out.print(v.getIntMth() + "\t");
		System.out.print(v.getIntSum() + "\t" + "\t");
		System.out.println(v.getFloatAvg());
	}

}
