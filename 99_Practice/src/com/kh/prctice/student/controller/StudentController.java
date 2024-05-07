package com.kh.prctice.student.controller;

import com.kh.example.parctice4.model.vo.Student;

public class StudentController {
	//5개가 들어갈 배열을 만드는데 학생으로 만들기
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[1] = new Student("이길동","화면",50);
		
		public void printpass() {
			for(Student s : sArr) {
				s.setpassed(s.getScore() >= CUT_LINE);
			}
		}
	}
}
