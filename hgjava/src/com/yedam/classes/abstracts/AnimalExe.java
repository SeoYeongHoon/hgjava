package com.yedam.classes.abstracts;

public class AnimalExe {

	public static void main(String[] args) {
		// Animal animal = new Animal();
		// 추상 클래스라서 스스로 인스턴스를 만들지 못함
		Animal animal = null;
		animal = new Bird("제비");
		animal.eat();
		animal.sleep();
		
		// => 자식클래스를 통해 존재
		Bird bird = new Bird("참새");
		bird.eat();
		bird.sleep();
		
		Animal[] animals = new Animal[10];
		animals[0] = bird;
	}

}
