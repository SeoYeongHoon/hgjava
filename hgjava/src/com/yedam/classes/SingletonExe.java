package com.yedam.classes;

public class SingletonExe {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();	// = new Singleton();
		Singleton s2 = Singleton.getInstance();
		// 객체의 주소값 반환
		
		System.out.println(s1 == s2);	// true
		// 같은 메모리 주소에 담기 때문
	}

}
