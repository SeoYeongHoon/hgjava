package com.yedam.thread.synchronize;

public class User1 extends Thread {
	private Calculator cal;
	
	public void setCalculator(Calculator cal) {
		setName("User1 Thread");
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(100);
	}
}
