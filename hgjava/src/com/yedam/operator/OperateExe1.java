package com.yedam.operator;

import java.util.Scanner;

public class OperateExe1 {

	public static void main(String[] args) {
//		method1();
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 값을 입력: 정수입력
		
		while (true) {
			System.out.println("숫자를 입력하세요: ");
			String input = sc.nextLine();
			
			if (input.equals("quit")) {
				break;
			}
			
			try {
				result += Integer.parseInt(input);
			} catch (Exception  e) {
				System.out.println("정수만 입력해주세요.");
			}
		}
		
		System.out.println("누적값은 " + result + "입니다.");
		System.out.println("<<< end of program >>>");
		
		// result에 입력한 값을 누적
		// 누적값은 ??입니다.
		// quit 입력하면 프로그램 종료
		
	}
	
	public static void method1() {
		int sum = (1 + 2) * 3;
		System.out.println(sum);
		sum = sum + 5;
		System.out.println(sum);
		
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자열을 입력하세요 >>> ");
			String input = sc.nextLine();
			if (input.equals("quit")) {
				break;
			}
			str += input + " ";
		}
		System.out.printf("누적 내용: %s\n", str);
	}

}
