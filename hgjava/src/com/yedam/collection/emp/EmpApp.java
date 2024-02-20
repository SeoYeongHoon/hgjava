package com.yedam.collection.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		List<Employee> storage = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		while (run) {
			System.out.println("1.등록  2.조회(입사일자)  9.종료");
			int menu = Integer.parseInt(sc.nextLine());
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			
			switch (menu) {
			case 1:
				System.out.println("학번 이름 입사일(yy-MM-dd) 급여(만원)를 순서대로 입력하세요.");
				String[] inputArr = sc.nextLine().split(" ");
				boolean isOk = true;
				try {
					storage.add(new Employee(
							Integer.parseInt(inputArr[0]), 
							inputArr[1], 
							sdf.parse(inputArr[2]), 
							Integer.parseInt(inputArr[3])));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					System.out.println("날짜 형식이 잘못되었습니다.");
					isOk = false;
				}
				System.out.println("등록 완료");
				break;
			case 2:
				Date dateInput = null;
				while (true) {
					System.out.println("조회할 사원의 입사일(yy-MM-dd)을 입력하세요.");
					try {
						dateInput = sdf.parse(sc.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("날짜 형식이 다름");
					}
				}
				
				for (int i = 0; i < storage.size(); i++) {
					if (storage.get(i).getHireDate().after(dateInput) || 
							storage.get(i).getHireDate().equals(dateInput)) {
						System.out.println(storage.get(i).toString());
					} else {
						System.out.println("조건에 맞는 사원이 없습니다.");
					}
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
			
		}
		System.out.println("<<< END OF PROGRAM >>>");
	}

	// 참고
	void method() {
		// "101 홍길동 23-05-08 100"
		String val = "101 홍길동 23-05-08 100";
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String[] valArr = val.split(" "); // " " 공백을 기준으로 배열에 담음
		for (String value : valArr) {
			System.out.println(value);
		}
		try {
			new Employee(Integer.parseInt(valArr[0]), // 사원번호
					valArr[1], // 이름
					sdf.parse(valArr[2]), // 입사일
					Integer.parseInt(valArr[3])); // 급여
		} catch (Exception e) {

		}
	}

}
