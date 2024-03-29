package com.yedam.thread;

class PrintThread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("실행중...");

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// Thread 종료하기 위한 코드 작성
				break;
			}
		}
		System.out.println("자원정리...");
		System.out.println("실행종료...");
	}
}

public class InterruptExe {

	public static void main(String[] args) {

		PrintThread2 thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.interrupt(); // 실행되는 thread에 Interrupted(예외 발생시킴)

	}

}
