package com.yedam.classes.inherit.nested;

import java.util.Map;

// 중첩 클래스 이용 연습
public class NestedExe {

	public static void main(String[] args) {
		// 인스턴스 선언
		Outer outer = new Outer();
		outer.method1();
		// => 외부(Outer) 클래스의 (중첩)메소드 사용
		
		Outer.NestClass nest = outer.new NestClass();
		nest.field2 = "반갑습니다.";
		System.out.println(nest.field2);
		
		nest.method2();
		
		Map.Entry<String, Integer> entry;
	}

}
