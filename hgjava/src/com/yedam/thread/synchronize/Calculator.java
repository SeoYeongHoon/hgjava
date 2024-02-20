package com.yedam.thread.synchronize;

public class Calculator {
	// User1, User2 작업 공간
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		System.out.println(Thread.currentThread().getName());
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " >> " + this.memory);
		// 메모리 필드값을 출력하기 위해 this.memory
	}
}
