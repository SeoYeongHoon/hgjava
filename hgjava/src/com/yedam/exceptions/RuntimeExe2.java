package com.yedam.exceptions;

public class RuntimeExe2 {

	public static void main(String[] args) {
		// 실행 예외
		String str = "10";
		
		str = null;
		
		try {
			str = "ten";
			System.out.println(str.toString());	// NullPointer
			int num = Integer.parseInt(str);	// NumberFormat	
//		} catch (NullPointerException eNull) {
////			eNull.printStackTrace();
//			System.out.println("참조값이 없음");
//		} catch (NumberFormatException eNum) {
////			eNum.printStackTrace();
//			System.out.println("숫자로 변경 불가");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외");
		}
		
		System.out.println("END");
	}

}
