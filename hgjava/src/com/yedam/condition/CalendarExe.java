package com.yedam.condition;

public class CalendarExe {

	public static void main(String[] args) {
		for (int mon = 1; mon < 13; mon++) {
			System.out.println("\n\n" + mon + "월");
			
			
			// 달의 1일의 위치
			int pos = 1;
			
			// 달의 마지막 날짜의 위치
			int lastDate = 31;
			
			switch(mon) {
			case 1:
				pos = 1; lastDate = 31; break;
			case 2:
				pos = 4; lastDate = 29; break;
			case 3:
				pos = 5; lastDate = 31; break;
			case 4:
				pos = 1; lastDate = 30; break;
			case 5:
				pos = 3; lastDate = 31; break;
			case 6:
				pos = 6; lastDate = 30; break;
			case 7:
				pos = 1; lastDate = 31; break;
			case 8:
				pos = 4; lastDate = 31; break;
			case 9:
				pos = 0; lastDate = 30; break;
			case 10:
				pos = 2; lastDate = 31; break;
			case 11:
				pos = 5; lastDate = 30; break;
			case 12:
				pos = 0; lastDate = 31; break;
			}
			
			// 달이 바뀔 때마다 마지막 날짜 계산
			
			System.out.println(" Sun Mon Tue Wed Thr Fri Sat");
			for (int k = 0; k < pos; k++) {
				System.out.printf("%4s", "");
			}
			
			for (int j = 1; j <= 31; j++) {
				System.out.printf("%4d", j);
				if ((pos + j) % 7 == 0) {
					System.out.println();
				}
			}
			
			System.out.println("\n=====End of Program=====");
		}
		
		
	}

}
