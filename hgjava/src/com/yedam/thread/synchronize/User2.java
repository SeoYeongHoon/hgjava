package com.yedam.thread.synchronize;

public class User2 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		setName("User2 Thread");
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(50);
	}
}
