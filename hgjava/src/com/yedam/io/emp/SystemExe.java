package com.yedam.io.emp;

import java.io.IOException;

public class SystemExe {

	public static void main(String[] args) {
		while (true) {
			System.out.println("입력 >> ");
			try {
				int input = System.in.read();
				if (input == 54) {
					break;
				}
				System.in.read();
				System.in.read();
				System.out.println((char) input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
