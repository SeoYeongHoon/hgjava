package com.yedam.condition;

public class DoWhileExe3 {

	public static void main(String[] args) {
		
		boolean run = false;
		int count = 0;
		
		do {
			System.out.println("한 번 출력합니다....");
			run = true;
			if (count++ > 3) {
				run = false;
			}
		}
		while (run);
		System.out.println("=======End Progress======");

	}

}
