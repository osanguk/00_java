package com.kh.javaAPI.Date.Ex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


		public class DateEx {
			public static void main(String[] args) {
				//1. Date
				Date 현재데이트 = new Date();
				System.out.println(현재데이트);
				//2. Calendar
				Calendar 캘린더 = Calendar.getInstance();
					//년 월 일
				int 년 = 캘린더.get(Calendar.YEAR);
				int 월 = 캘린더.get(Calendar.MONTH); //0월부터 가져오기 때문에 +1 을 해줘야함
				int 일 = 캘린더.get(Calendar.DAY_OF_MONTH);
				System.out.println("현재 날짜 : " + 년 + "/" + (월 + 1) + "/" +일 );
			
				GregorianCalendar 그레고리안1 = new GregorianCalendar();
				GregorianCalendar 그레고리안2 = new GregorianCalendar(2024, 4, 23);
				int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK);
				System.out.println("날짜 : " + 날짜);
	}
	}
