package com.yedam.api;

import java.util.ArrayList;
import java.util.List;

public class WrapperExe {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));	// 기본 타입 => Wrapper클래스 
		
		double d1 = Double.valueOf("2.3").doubleValue();
		
		System.out.println(Math.ceil(-133.31));
	}

}
