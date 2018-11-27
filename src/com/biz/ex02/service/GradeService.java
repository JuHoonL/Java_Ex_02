package com.biz.ex02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.VO.GradeVO;

public class GradeService {
	public List<GradeVO> gList;
	public GradeVO gradeVO = new GradeVO();				// public 이 왜 들어가는지? public private의 차이점 ?
	private Scanner scanner;
	
	public GradeService() {						// 생성자에는 void or int, float, boolean 등을 쓰지않는다.(리턴값X 때문)
		gList = new ArrayList(); 				 
		scanner = new Scanner(System.in);
	}
	
	public void inPutGrade() {
		
		
		System.out.print("학번 : ");
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
	
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMth();
		gradeVO.setIntSum(intSum);
		
		gradeVO.setFloatAvg(intSum / 3.0f);
		gList.add(gradeVO);
	}
	
	public void viewGrade() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("학번\t\t국어점수\t영어점수\t수학점수\t\t총점\t평균점수");
		System.out.println("=============================================================");
		
		for(GradeVO s : gList) {
		System.out.print(s.getStrNum() + "\t" + "\t");
		System.out.print(s.getIntKor() + "\t");
		System.out.print(s.getIntEng() + "\t");
		System.out.print(s.getIntMth() + "\t");
		System.out.print(s.getIntSum() + "\t" + "\t");
		System.out.println(s.getFloatAvg());
		}
	}
}
