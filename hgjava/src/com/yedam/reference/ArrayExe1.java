package com.yedam.reference;

public class ArrayExe1 {

	public static void main(String[] args) {
		// 선언
		int[] intArr = {10, 20, 30}; // intArr !== int, 하지만 intArr[0] === int
		int[][] intArray = {{10, 20}, {30, 40}};	// 배열요소를 다시 배열로 담겠다.
		
		String[] strArr = new String[5];	// 크기 선언
		strArr = new String[] {"Hello ", "World", "!"};
//		System.out.println(strArr[0]);
		
		for (String elem : strArr) {
			System.out.print(elem);
		}
	}

}
