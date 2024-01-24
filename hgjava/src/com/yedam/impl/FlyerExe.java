package com.yedam.impl;

public class FlyerExe {

	public static void main(String[] args) {
		// ---- 매개변수의 다형성		
		
		Flyer flyer = new Airplane();
//		flyer.takeOff();	// airplane 결과
		
		flyer = new Helicopter();
//		flyer.takeOff();	// helicopter 결과
		
		
		Driver driver = new Driver();
		driver.drive(flyer);
	}

}
