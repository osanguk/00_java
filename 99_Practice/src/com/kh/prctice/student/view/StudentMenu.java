package com.kh.prctice.student.view;

public class StudentMenu {
	
	public StudentMenu() {
		
	}
	public void printStudentMenu() {
		System.out.println("학생 이름 과목 점수");
		System.out.println("--------------");
		
		for( String student : ssm.printstudent()) {
			System.out.println(student.inform());
		}
		System.out.println("-------------------");
		System.out.println("총점 : " + ssm.sumScore);
		System.out.println("평균 : %.2f \n" , ssm.avgscore()[1]);
		System.out.println("합격 여부 : " + (ssm.avgScore([1]>=studentController.)));
	}
	

}
