package com.yedam.condition;

public class LoopExe4 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
//			for (int k = 2; k < 10; k++) {
//				for (int j = 1; j < i; j++) {
//					System.out.print("*");
//				}
//			}
		}
		
		for (int i = 10; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void method2() {
		// 구구단 출력
		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d \n", num, i, (num * i));
//			System.out.println("\t");
			for (int j = 2; j <= 20; j++) {
				System.out.printf("%2d x %d = %2d\t", j, i, (i * j), "\t");
			}
			System.out.println();
		}
	}

}
