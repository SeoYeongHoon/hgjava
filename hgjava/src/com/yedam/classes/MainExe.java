package com.yedam.classes;

import java.util.Scanner;

public class MainExe {
	static Scanner sc = new Scanner(System.in);
	
	// 등록 메소드
	public static void insert() {
		
	}
	boolean run = true;
	
	static String stdNum, stdName = "";
	static int stdScore = 0;
	static double stdHeight = 0;
	static StudentApp stdApp = new StudentApp();
	
	public static void update() {
		System.out.println("학생번호 입력: ");
		stdNum = sc.nextLine();
		
		// 정상적인 번호 체크
		if(stdApp.get(stdNum) == null) {
			System.out.println("학생번호가 틀렸습니다.");
		}
		
		// 정상적인 점수 입력
		while(true) {
			System.out.println("학생점수 입력: ");
			stdScore = Integer.parseInt(sc.nextLine());
			
			if(stdScore < 0) {
				System.out.println("점수는 0보다 커야합니다.");
				continue;
			}
			break;
		}
		
		if(stdApp.modify(stdNum, stdScore)) {
			System.out.println("======= 수정완료 =======");
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentApp stdApp = new StudentApp();	// 인스턴스
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		String stdNum, stdName = "";
		int stdScore = 0;
		double stdHeight = 0;
		
		while(run) {
			System.out.println("1.등록  2.목록  3.수정  4.삭제  6.단건조회  9.종료");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				// 1. 등록
				case 1: 
					System.out.println("학생번호 입력: ");
					stdNum = sc.nextLine();
					System.out.println("학생이름 입력: ");
					stdName = sc.nextLine();
					System.out.println("학생점수 입력: ");
					stdScore = Integer.parseInt(sc.nextLine());
					System.out.println("학생키 입력: ");
					stdHeight = Double.parseDouble(sc.nextLine());

					// 매개값으로 쓰기위함
					Student std = new Student(stdNum, stdName, stdScore, stdHeight);
					
					if (stdApp.add(std)) {
						System.out.println("======= 입력성공 =======");
					} else {
						System.out.println("======= 입력실패 =======");
					}
					break;
					
				// 2. 목록
				case 2:
					Student[] list = stdApp.list();
					for(int i = 0; i < list.length; i++) {
						if(list[i] != null) {
							list[i].showInfo();
						}
					}
					System.out.println("======= 조회완료 =======");
					break;
					
				// 3. 수정
				case 3:
					System.out.println("학생번호 입력: ");
					stdNum = sc.nextLine();
					
					// 정상적인 번호 체크
					if(stdApp.get(stdNum) == null) {
						System.out.println("학생번호가 틀렸습니다.");
					}
					
					// 정상적인 점수 입력
					while(true) {
						System.out.println("학생점수 입력: ");
						stdScore = Integer.parseInt(sc.nextLine());
						
						if(stdScore < 0) {
							System.out.println("점수는 0보다 커야합니다.");
							continue;
						}
						break;
					}
					
					if(stdApp.modify(stdNum, stdScore)) {
						System.out.println("======= 수정완료 =======");
					} else {
						System.out.println("잘못된 번호입니다.");
					}
					break;
					
				// 4. 삭제
				case 4:
					System.out.println("학생번호 입력: ");
					stdNum = sc.nextLine();
					if(stdApp.remove(stdNum)) {
						System.out.println("======= 삭제완료 =======");
					} else {
						System.out.println("잘못된 번호입니다.");
					}
					break;
					
				// 6. 단건조회
				case 6:
					System.out.println("조회할 학생번호 입력: ");
					stdNum = sc.nextLine();
					
					Student std1 = stdApp.get(stdNum);
					if(std1 != null) {
						std1.showInfo();
					} else {
						System.out.println("학생 번호가 없음");
					}
				// 9. 종료
				case 9:
					run = false;
					System.out.println("======= 종료 =======");
					break;
			}
		}
		System.out.println("======= End of Program =======");

	}

}
