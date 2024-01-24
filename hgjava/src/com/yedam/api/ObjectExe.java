package com.yedam.api;

public class ObjectExe {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));	// 객체 비교 Ojbect.equals()
		
		String str1 = "Hi";
		String str2 = "Hi";
		System.out.println(str1.equals(str2));
		
		Member mbr1 = new Member();
		Member mbr2 = new Member();
		mbr1.name = "김회원";
		mbr2.name = "김회원";
		mbr1.age = 13;
		mbr2.age = 14;
		System.out.println(mbr1.equals(mbr2));
	}

}
