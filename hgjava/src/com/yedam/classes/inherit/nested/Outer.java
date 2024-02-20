package com.yedam.classes.inherit.nested;

public class Outer {
	String field1;

	// 인스턴스 멤버 클래스
	class NestClass { // 중첩 클래스
		String field2;

		void method2() {
			System.out.println("method2() 실행됨");
		}
	}

	// 정적 멤버 클래스
	static class StaticClass {
		static String field3;
		static void method3() {
			System.out.println("method3() 실행됨");
		}
	}
	
	void method1() {
		NestClass nest = new NestClass();
		nest.field2 = "안녕";

		System.out.println(nest.field2);
		nest.method2();
		
		StaticClass.method3();
	}
}
