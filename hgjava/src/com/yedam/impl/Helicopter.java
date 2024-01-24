package com.yedam.impl;

public class Helicopter extends Airplane {
	// Airplane의 기능들을 그대로 물려받는 것

	// 재정의
	@Override
	public void takeOff() {
		System.out.println("[Helicopter] - 이륙");
	}
	
	@Override
	public void fly() {
		System.out.println("[Helicopter] - 이륙");
	}
	
	@Override
	public void land() {
		System.out.println("[Helicopter] - 착륙");
		
	}
}
