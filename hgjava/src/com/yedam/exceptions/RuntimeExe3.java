package com.yedam.exceptions;

import java.util.Scanner;

public class RuntimeExe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int menu = 0;
			
			while (true) {
				System.out.println("1.실행  2.종료");
				
				try {
					menu = Integer.parseInt(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자 입력");
				}
			}

			if (menu == 1) {
				System.out.println("실행합니다.");
			} else if (menu == 2) {
				System.out.println("종료합니다.");
				break;
			}
		}
		
		System.out.println("END");
	}

}
