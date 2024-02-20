package com.yedam.thread;

// stop 플래그(Flag) 변경 => 해당되는 Thread 종료
class PrintThread extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("실행중...");
		}
		System.out.println("자원정리...");
		System.out.println("실행종료...");
	}
}

public class StopFlagExe {

	public static void main(String[] args) {
		PrintThread pThread = new PrintThread();
		pThread.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		pThread.setStop(true);
	}

}
