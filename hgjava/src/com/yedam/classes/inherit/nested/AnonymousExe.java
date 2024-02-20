package com.yedam.classes.inherit.nested;

class Parent {
	String name;
	
	void showName() {
		System.out.println("이름은 " + name);
	}
}

interface Runnable {
	
	// 함수형 인터페이스 => 구현해야 할 메소드가 하나만 존재
	void run(String name);
}

public class AnonymousExe {

	public static void main(String[] args) {
		
		// 익명 구현 객체
//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("달리다");
//			}
//		};
//		
		Runnable runnable1 = new Runnable() {
			@Override
			public void run(String name) {
				System.out.println(name + "은 뛰다.");
			}
		};
		runnable1.run("이길동");
		
		Runnable runnable = (name) -> System.out.println(name + "이 달리다.");
		runnable.run("김길동");
		
		runnable = (name) -> System.out.println(name + "은 걷다.");
		runnable.run("홍길동");
		
		// 익명 자식 객체
		Parent parent = new Parent() {
			int age;
			void showInfo(String name, int age) {
				this.name = name;
				this.age = age;
				System.out.println("이름은 " + name + ", 나이는 " + age + "살");
			}
			
			// 부모(Parent) 클래스가 가지고 있는 메소드를 재정의(오버라이딩)
			@Override
			void showName() {
				System.out.println("이름은 " + name + "입니다.");
				showInfo("홍길동", 20);
			}
		};
		
		parent.showName();
//		parent.showInfo();	// 사용불가능. 자식메소드
	}

}
