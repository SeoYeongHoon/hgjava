package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
//		System.out.println(today.toGMTString());
//		System.out.println(sdf.format(today));
//		try {
//			today = sdf.parse("2020년 01월 05일 12시 12분 12초");
//			// 문자열 -> Date 타입으로 바꿔주는 메소드
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(today);
//		
//		Date now = new Date();
//		
//		System.out.println(today.before(now));
		
		// LocalDate, LocalTime, LocalDateTime
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
		String ldtFormat = ldt.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.println(ldtFormat);
	}

}
