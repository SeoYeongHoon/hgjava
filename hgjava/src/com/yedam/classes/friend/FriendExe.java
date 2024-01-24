package com.yedam.classes.friend;

import java.util.Scanner;

public class FriendExe {

	public static void main(String[] args) {
		// 메뉴: 1.등록 2.목록 3.수정 4.삭제 9.종료
		// 사용자의 입력 or 처리된 결과 => 콘솔출력

		Scanner sc = new Scanner(System.in);

		// 인스턴스 선언
		FriendApp frdApp = new FriendApp();

		String frdName, frdPhone = "";
		int frdAge = 0;

		boolean run = true;

		while (run) {
			System.out.println("======= 친구 관리 프로그램 =======");
			int menu = 0;
			while (true) {
				try {
					System.out.println("1.친구등록  2.친구목록  3.정보수정  4.삭제  9.종료");
					menu = Integer.parseInt(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력하세요");
				}
			}

			switch (menu) {

			// 1.등록
			case 1:
				System.out.println("친구이름 입력 >>> ");
				frdName = sc.nextLine();
				System.out.println("전화번호 입력 >>> ");
				frdPhone = sc.nextLine();
				System.out.println("나이 입력    >>> ");
				frdAge = sc.nextInt();

				// 매개변수 선언
				Friend frd = new Friend(frdName, frdPhone, frdAge);

				if (frdApp.frdAdd(frd)) {
					System.out.println("======= 입력 성공 =======");
				} else {
					System.out.println("======= 입력 실패 =======");
				}
				break;

			// 2.목록
			case 2:
				// Friend부터 받아올 배열 하나 선언
				Friend[] frdList = frdApp.frdList();
				for (int i = 0; i < frdList.length; i++) {
					if (frdList[i] != null) {
						frdList[i].showInfo();
					}
				}
				System.out.println("======= 조회 완료 =======");
				break;

			// 3.수정
			case 3:
				System.out.println("친구이름 입력 >>> ");
				frdName = sc.nextLine();

				// 있는 이름인지 체크
				if (frdApp.getFriend(frdName) == null) {
					System.out.println("없는 이름입니다.");
				}

				// 이름 검색
				while (true) {
					System.out.println("전화번호 입력 >>> ");
					frdPhone = sc.nextLine();
					break;
				}

				if (frdApp.frdModify(frdName, frdPhone)) {
					System.out.println("======= 수정 완료 =======");
				} else {
					System.out.println("======= 수정 실패 =======");
				}
				break;

			// 4.삭제
			case 4:
				System.out.println("친구이름 입력 >>> ");
				frdName = sc.nextLine();
				if (frdApp.frdRemove(frdName)) {
					System.out.println("======= 삭제 완료 =======");
				} else {
					System.out.println("없는 이름입니다.");
				}
				break;

			// 9.종료
			case 9:
				run = false;
				System.out.println("======= 종료 =======");
				break;
			}
		}
		System.out.println("======= END =======");
	}
}
