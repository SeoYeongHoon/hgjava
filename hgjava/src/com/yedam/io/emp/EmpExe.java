package com.yedam.io.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class EmpExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택 >> ");

			int menu = Integer.parseInt(sc.nextLine());
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			
			switch (menu) {
			case 1: // 번호 이름 점수 (엔터)
				System.out.println("사원번호 이름 이메일 입사일자 급여를 순서대로 입력하세요.");
				// 입사일자: yy-MM-dd
				String[] inputArr = sc.nextLine().split(" ");
				
				Employee emp = null;
				try {
					emp = new Employee(
							Integer.parseInt(inputArr[0]),
							inputArr[1],
							inputArr[2],
							sdf.parse(inputArr[3]),
							Integer.parseInt(inputArr[4]));
				} catch (ParseException e) {
					System.out.println("날짜포맷 오류");
					break;
				}
				if (app.add(emp)) {
					System.out.println("등록 완료");
					break;
				} else {
					System.out.println("등록 실패");
					break;
				}
				
				
	
//				try {
//					app.storage.add(new Employee(
//						Integer.parseInt(inputArr[0]),
//						inputArr[1],
//						inputArr[2],
//						sdf.parse(inputArr[3]),
//						Integer.parseInt(inputArr[4])
//					));
//				} catch (NumberFormatException e) {
//					System.out.println("등록 에러");
//				}
//				System.out.println("등록 완료");
//				break;
			case 2:
				List<Employee> list = app.list(); // app.list(): 목록을 가져오겠다는 메소드
				for (Employee emps : list) {
					System.out.println(emps.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				app.save();
				run = false;
			}
		}

		System.out.println("End of Program");

	}

}
