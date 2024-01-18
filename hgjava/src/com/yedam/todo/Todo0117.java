package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {

	public static void main(String[] args) {
		// 친구 3명의 이름과 연락처를 입력하도록.. 메세지 출력
		// 입력완료
		
		// 이름: 홍길동
		// 연락처: 010-1111-2222
		// ===================
		// 이름: 김길동
		// 연락처: 010-2222-3333
		// ===================
		// 이름: 박길동
		// 연락처: 010-3333-4444
		// ===================
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[3];
		String[] phones = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요.");
			names[i] = sc.nextLine();
			System.out.println("전화번호를 입력하세요.");
			phones[i] = sc.nextLine();
			
		}
		
		for (int j = 0; j < names.length; j++) {
			System.out.println("이름: " + names[j]);
			System.out.println("연락처: " + phones[j]);
			System.out.println("===================");
		}
	}

}
