package com.yedam.exceptions;

public class ThrowExe {

	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		} catch (Exception ee) {
			System.out.println("알 수 없는 예외");
		}
		
	}
	
	static void method() throws ClassNotFoundException {
		
		Class.forName("java.lang.String");
		
	}
	
//	static void method() {
//		
//		try {
//			Class.forName("java.lang.String");
//		} catch (Exception e) {
//			System.out.println();
//		}
//		
//		try {
//			Class.forName("java.lang.String");
//		} catch (Exception e) {
//			System.out.println();
//		}
//	}

}
