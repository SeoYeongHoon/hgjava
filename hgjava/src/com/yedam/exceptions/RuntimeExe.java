package com.yedam.exceptions;

public class RuntimeExe {

	public static void main(String[] args) {

		// 일반 예외
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// 실행 예외
//		String str = "asdf";
//		int num = Integer.parseInt(str);
//		System.out.println(num);
		String str = null;

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("참조값이 없음\n" + e);
			str = "10";
		}
		
		
//		try {
//			int num = Integer.parseInt(str);
//			System.out.println(num);
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 변경 불가");
//			System.out.println(e);
//		}
	}

}
