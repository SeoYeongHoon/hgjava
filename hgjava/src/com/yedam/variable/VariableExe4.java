package com.yedam.variable;

public class VariableExe4 {
	public static void main(String[] args) {
		boolean isTrue = 10 > 20;	// false 값이 담김
		
//		isTrue = update(11);
		
		if (isTrue) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		Member mem = new Member();
		mem.name = "홍길동";
		mem.age = 29;
		mem.height = 190.5;
		
		Member mem2 = new Member();
		mem2.name = "김민수";
		mem2.age = 35;
		mem2.height = 182.8;
		
		isTrue = mem.height > mem2.height; 
		System.out.println(isTrue);
		isTrue = mem.age == mem2.age;
		System.out.println(isTrue);
		
		byte a = 10;
		int b = (int) a;
		// 강제 형변환
	}
	
	public static boolean update(int arg) {
		return arg % 2 == 0;	// 11을 넣었을 때, 나머지가 1이 남으므로 false 값 반환
	}
}
