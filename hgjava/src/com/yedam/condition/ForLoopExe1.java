package com.yedam.condition;

public class ForLoopExe1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 1000000; i*=2) {
//			sum += i;
			System.out.println(i);
			
			if (i > 500000) {
				break;
			}
		}
		
		// 1 ~ 10까지 합 계산
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		
		// 1 ~ 31까지 반복
		System.out.println("일   월   화   수   목   금   토");
		for (int j = 1; j <= 31; j++) {
			System.out.printf("%3d ", j);
			if (j % 7 == 0) {
				System.out.println("");
			}
		}
	}

}
