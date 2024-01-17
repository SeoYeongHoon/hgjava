package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// while문 사용
		while(true) {
			System.out.println("값을 입력 >>> ");
			String input = sc.nextLine();
			System.out.println("입력값은 " + input + "입니다.");
			if (input.equals("quit")) {
				System.out.println("<< end of program >>");
				break;
			}
		} 
		// 입력값은 홍길동 입니다.
		// input.equals("quit");
		
		// quit 값이 들어오면 << end of program >> 출력
		
	}

}
