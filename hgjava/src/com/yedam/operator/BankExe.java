package com.yedam.operator;

import java.util.Scanner;

// 은행 계좌
// 잔고 한계: 10만원
// 마이너스 계좌 X
public class BankExe {

	public static void main(String[] args) {
		// 입금, 출금, 잔고확인, 종료
		
		Scanner sc = new Scanner(System.in);
		
		// 계좌
		int balance = 0;
		
		// 실행
		boolean run = true;
		
		while (run) {
			System.out.println("1.입금 2.출금 3.잔고확인 4.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
				case 1: System.out.println("입금할 금액을 입력하세요.");
						int input = Integer.parseInt(sc.nextLine());
						if (balance + input > 100000) {
							System.out.println("계좌 한도를 초과했습니다. 출금해주세요.");
							break;
						} 
						balance += input;
						System.out.println("입금을 완료했습니다.");
						break;
				case 2: System.out.println("출금할 금액을 입력하세요.");
						int input_minus = Integer.parseInt(sc.nextLine());
						if (balance - input_minus < 0) {
							System.out.println("출금 실패.");
							break;
						}
						balance -= input_minus;
						System.out.println("출금을 완료했습니다.");
						break;
				case 3:	System.out.println("현재 " + balance + "원이 남아있습니다.");
						break;
				case 4: run = false;
						System.out.println("<<< End of Program >>>");
			}
		}
	}

}
