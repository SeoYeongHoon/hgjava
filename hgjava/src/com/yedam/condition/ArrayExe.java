package com.yedam.condition;

public class ArrayExe {

	public static void main(String[] args) {
//		String[] strArr = {"Hong", "Park", "Kim"};
//		
//		System.out.println(intArr[2]);
//		
////		intArr = new int[] {10, 20, 30, 40, 50};
//		intArr[0] = 100;

		int[] intArr = {};
		
		for (int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random() * 10);
		}
		
		int sum2, sum3;
		sum2 = sum3 = 1;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
			if (intArr[i] % 2 == 0) {
				sum2 += intArr[i];
			}
			if (intArr[i] % 3 == 0) {
				sum3 += intArr[i];
			}
			if (intArr[i] % 2 == 0 && intArr[i] % 3 == 0) {
				sum2 += intArr[i];
				sum3 += intArr[i];
			}
		}
		System.out.println("2의 배수의 값: " + sum2);
		System.out.println("3의 배수의 값: " + sum3);
		
	}

}
