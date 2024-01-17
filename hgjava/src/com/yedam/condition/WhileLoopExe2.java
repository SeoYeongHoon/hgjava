package com.yedam.condition;

import java.util.Scanner;

public class WhileLoopExe2 {

	public static void main(String[] args) {
		// 어떤 조건일 동안 반복
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100) + 1;	// 1 ~ 10 사이의 정수
		// 크거나 작은 조건 추가해서 숫자 맞히기
		while (true) {
			System.out.println("값 입력: ");
			int input = sc.nextInt();
//			if (random == input) {
//				System.out.printf("정답 %d \n", random);
//				break;
//			} else if (random < input) {
//				System.out.println("떙! 답은 그것보다 작습니다.");
//			} else {
//				System.out.println("땡! 답은 그것보다 큽니다.");
//			}
//			System.out.println("다시 입력해주세요.");
			
			// continue 쓰기
			if (random == input) {
				System.out.printf("정답 %d \n", random);
				break;
			} 
			if (random < input) {
				System.out.println("떙! 답은 그것보다 작습니다.");
				continue;
			} 
			System.out.println("땡! 답은 그것보다 큽니다.");
			
			System.out.println("다시 입력해주세요.");
		}
		
		System.out.println("=======End Progress======");
	}

}
