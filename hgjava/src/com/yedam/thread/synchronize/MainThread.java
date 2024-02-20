package com.yedam.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		// memory 필드를 User1, User2에 지정
		Calculator cal = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start(); // memory = 100, => 2초간 대기

		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start(); // memory = 50, => 2초간 대기
	}

}
