package com.yedam.variable;

public class VariableExe1 {
	public void sum() {
		int n2;	// 다른 블럭에서는 같은 이름의 변수 선언 가능
	}
	
	public static void main(String[] args) {
		
		int n1 = 100;
		// int: wrapper 클래스(integer)
		
		System.out.println(n1);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Long.MAX_VALUE);
		long n2 = 2147483647L;
		n2 = -2147483648L;
		System.out.println(n2);
		
		double n3 = Math.random();	// 0이상 1미만의 실수 중 랜덤
		System.out.println(n3);
		
		
		int ranNum = (int)(Math.random() * 10);	// 0이상 10미만의 정수 중 랜덤
		System.out.println(ranNum);
		
		String str = "홍길동";	// 문자열
		String str2 = "입니다.";
		System.out.println(str + str2);
		
		byte b1 = 127;
		System.out.println(b1);
		byte b2 = -128;
		
		System.out.println(Short.MAX_VALUE);
		short s1 = 32767;
		short s2 = -32768;
		
		short s3 = (short) (s1 - 30);	// 정수 연산은 int 타입에서만 이뤄짐
		System.out.println(s3);
		
		// 왼쪽항 = 오른쪽항 => 항상 타입이 동일해야 한다
		double d1 = 40;	// 내부에서 형 변환이 자동으로 됨
		System.out.println(d1);
	}
}
