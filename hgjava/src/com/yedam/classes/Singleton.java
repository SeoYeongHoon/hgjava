package com.yedam.classes;

// 전체 프로그램에서 인스턴스를 하나만 생성
public class Singleton {

	// 1. 생성자를 private로 선언(클래스 이름으로, 반환값 x)
	// 2. Singleton 타입의 필드 선언
	// 3. 인스턴스를 반환할 수 있도록 getInstance() 제공
	
	private Singleton() {
		
	}
	
	private static Singleton instance = new Singleton();
	// 2. instance라는 이름의 싱글톤타입 필드 선언
	
	
	public static Singleton getInstance() {
		return instance;
	}

}
