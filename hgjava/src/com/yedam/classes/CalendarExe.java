package com.yedam.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {

	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH) + 1);
//		final int num = 10;	// => final 선언으로 인해 상수가 됨.
//		
////		System.out.println(Calendar.YEAR);
////		System.out.println("year: " + cal.get(Calendar.YEAR));
////		System.out.println("year: " + cal.get(1));
//		
//		cal.set(2024, 0, 1); // 가운데 상수 => 0: 1월
////		// 일요일: 0, 월요일: 1,,,
////		System.out.println("year: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last date: " + cal.getActualMaximum(Calendar.DATE));
//		
//		drawCalendar(2024, 2);
		// 2024년 5월 달력
		
		Date date = new Date();
		// 2024-10-05
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(date);
		try {
			date = sdf.parse("2024-10-05");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date.getDate());
	}
	
	static void drawCalendar(Date date) {
		// 2024.01
//		Calendar cal = Calendar.getInstance();
//		cal.set(year, month - 1, 1);
//		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		
//		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
//		for (int i = 0; i < days.length; i++) {
//			System.out.printf("%4s", days[i]);
//		}
//		
//		System.out.println("\n\n " + year + "년 " + month + "월");
//
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.DAY_OF_MONTH);
//		
//		for (int i = 0; i < pos; i++) {
//			System.out.printf("%4s", "");
//		}
//
//		for (int j = 1; j <= lastDate; j++) {
//			System.out.printf("%4d", j);
//			if ((pos + j) % 7 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println("\n");
//		System.out.println("<<<<< END >>>>>");
	}

	static void drawCalendar(int year, int month) {
		// 2024.01
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int pos = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		
		System.out.println("\n\n " + year + "년 " + month + "월");

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.DAY_OF_MONTH);
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}

		for (int j = 1; j <= lastDate; j++) {
			System.out.printf("%4d", j);
			if ((pos + j) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		System.out.println("<<<<< END >>>>>");
	}

}
