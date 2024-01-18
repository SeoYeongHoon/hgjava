package com.yedam.reference;

public class RefExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2);	// 값을 비교(=> true)
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1 == str2);	// 주소값을 비교(=> false)
		System.out.println(str1.equals(str2));	// equals로 값 비교(=> true)
		
		String str3 = "a";
		String str4 = "a";
		System.out.println(str3 == str4);
		
		int[] intArr = new int[10];
		System.out.println(intArr);	// 주소값이 나옴(참조변수)
		intArr = null;
		System.out.println(intArr[0]);	// exception 오류
		
	}

}
