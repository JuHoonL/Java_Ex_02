package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;

import com.biz.ex02.service.GradeService;

public class GradeExec02 {

	public static void main(String[] args) {
		/*
		 1. Main에서 키보드로 부터 5명 학생에 대한 학번, 국어점수, 영어점수, 수학점수를 입력 받아 List<GradeVO>에 저장
		 2. 저장된 전체 학생의 점수와 총점, 평균을 계산한 후  console에 표시
		 */
		List<GradeService> gList = new ArrayList();
		GradeService gSrv = new GradeService();
		
		for(int i = 0 ; i < 5 ; i ++){
			
			gSrv.inPutGrade();
									
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("학번\t\t국어점수\t영어점수\t수학점수\t\t총점\t평균점수");
		System.out.println("=============================================================");
		
		int intListSize = gList.size();
		for(int i = 0 ; i < intListSize ; i ++) {
			System.out.print("학 번 : " + gList.get(i).gradeVO.getStrNum() + "\t" + "\t");
			System.out.print("국어점수 : " + gList.get(i).gradeVO.getIntKor() + "\t");
			System.out.print("영어점수 : " + gList.get(i).gradeVO.getIntEng() + "\t");
			System.out.print("수학점수 : " + gList.get(i).gradeVO.getIntMth() + "\t");
			System.out.print("총 점 : " + gList.get(i).gradeVO.getIntSum() + "\t" + "\t");
			System.out.println("평균점수 : " + gList.get(i).gradeVO.getFloatAvg()); 
		} 
		
		
		
	}

}
