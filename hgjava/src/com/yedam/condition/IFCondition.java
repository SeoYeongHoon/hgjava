package com.yedam.condition;

public class IFCondition {

	public static void main(String[] args) {
		boolean isTrue = true;
		
		if (isTrue) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		int score = 80;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		System.out.println("==============End Progress==============");
	}

}
