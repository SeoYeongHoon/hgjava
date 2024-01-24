package com.yedam.classes.abstracts;

// 추상 클래스(abstract 붙이기)
public abstract class Animal {
	private String name;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "이(가) 음식을 먹습니다.");
	}
	
	// 추상 메소드(구현 부분이 없음 => 자식클래스에서 반드시 재정의, 즉 Overriding 해야함)
	public abstract void sleep();
}
