package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			String 글자로데이터변경 = 날짜1.format(date);
			
	
	
	public static void main(String[] args) {
		
	}

}
