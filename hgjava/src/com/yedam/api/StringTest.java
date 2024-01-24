package com.yedam.api;

import java.text.ParseException;

public class StringTest {

	public static void main(String[] args) throws ParseException {
		// 1번 문제의 데이터
		String[] jumins = { "970101-1234567", // 남자
				"970101-2345678", // 여자
				"9701011234567", // 남자
				"970101 1234567", // 남자
				"030101 4234567", // 여자
//				"030101 1234567"	// 오류

		};

		for (String ssn : jumins) {
			checkGender(ssn);
		}
		;

		// 2번 문제의 데이터. '길동'이라는 이름이 몇 번 나오는지?
		String[] names = { "홍길동", "이상민", "김민수", "길동이", "서영훈", "김길동", "서길동" };

		int count = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].indexOf("길동") != -1) {
				System.out.println("index: " + i);
				count++;
			}
		}
		System.out.println("길동이 들어간 이름은 " + count + "명");
	}

	static void checkGender(String ssn) {
//		System.out.println(ssn);
	}

}
