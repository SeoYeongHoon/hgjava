package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.");
//		System.out.println("나이를 입력하세요.");
		
//		String result = sc.nextLine();	// 입력값을 문자열로 반환
//		System.out.println("당신의 이름은 " + result + "입니다.");
		
//		int age = sc.nextInt();
//		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		System.out.println("이름: ");
		System.out.println("휴대폰 번호: ");
		
		System.out.println("영어점수: ");
		System.out.println("수학점수: ");
		
		// 이름입력(name), 연락처(phone)
		String name = sc.nextLine();
		String phone = sc.nextLine();
		
		// 영어(eng), 수학(math) => 합계(sum) 
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int sum = eng + math;
		
		System.out.println("이름은 " + name + ", 휴대폰번호는 " + phone + " 입니다.");
		System.out.println("영어: " + eng + " 수학: " + math + " 합계: " + sum);
	}

}
