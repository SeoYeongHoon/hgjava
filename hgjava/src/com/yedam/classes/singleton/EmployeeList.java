package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeList {
	Scanner sc = new Scanner(System.in);

	// 싱글턴
	private static EmployeeList instance = new EmployeeList();

	Employee[] empList; // 사원 배열
//	int empAllnum;	// 사원 인원수
	int empNum = 0;

	private EmployeeList() {
		empList = new Employee[10];
	}

	public static EmployeeList getInstance() {
		return instance;
	}

	// 추가 기능
	// 사원수 입력 초기화
	public void init() {
		System.out.println("사원수 >>> ");
		int num = sc.nextInt();
		empList = new Employee[num];
//		empAllnum = num;
	}

	// 사원정보 입력: 배열추가
	public void input() {
		if (empNum == empList.length) {
			System.out.println("입력초과");
			return;
		}
//		System.out.printf("%d 사번", empAllnum);
		System.out.println("사번 >>> ");
		int no = sc.nextInt();

		System.out.println("이름 >>> ");
		String name = sc.next();

		System.out.println("급여 >>> ");
		int sal = sc.nextInt();

		empList[empNum++] = new Employee(no, name, sal);
//		empList[empAllnum++] = new Employee(no, name, sal);
	}

	// 사번에 해당하는 이룸 출력
	public String search(int empId) {
		// 해당 사번이 있으면 이름 반환, 없으면 공백
		for (int i = 0; i < empNum; i++) {
			if (empList[i].getEmpId() == empId) {
				return empList[i].getEmpName();
			}
		}
		return "";
	}

	// 급여 합계
	public int sum() {
		int total = 0;
		for (int i = 0; i < empNum; i++) {
			total += empList[i].getEmpSal();
		}
		return total;
	}

	// 전체 출력
	public void print() {
		// 사원번호, 이름, 급여 출력
		System.out.println("사원번호   이름   급여");
		for (int i = 0; i < empList.length; i++) {
			if (empList[i] != null) {
				empList[i].showInfo();
			}
		}
	}
}
