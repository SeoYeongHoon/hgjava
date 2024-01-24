package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 싱글톤 패턴으로 가져오기
		EmployeeList app = EmployeeList.getInstance();

		boolean run = true;
		int menu = 0;

		while (run) {
			System.out.println("1.사원수 2.사원입력 3.사원리스트 4.검색 5.급여합계 9.종료");
			System.out.println("선택 >>> ");
			menu = sc.nextInt();

			if (menu == 1) {
				app.init();
			} else if (menu == 2) {
				app.input();
			} else if (menu == 3) {
				app.print();
			} else if (menu == 4) {
				System.out.println("조회할 사원번호 >>> ");
				int no = sc.nextInt();
				String name = app.search(no);
				if (app.search(no) == "") {
					System.out.println("없는 사원번호입니다.");
				} else {
					System.out.println(name);
				}
			} else if (menu == 5) {
				System.out.printf("급여의 합계는 %d입니다.\n", app.sum());
			} else if (menu == 9) {
				run = false;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
		System.out.println("END");

	}

}
