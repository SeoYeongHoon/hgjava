package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setObj("문자열");
		String str = box.getObj();
		
		Box<Integer> boxNum = new Box<Integer>();
		boxNum.setObj(12345);
		Integer num = boxNum.getObj();
		
		System.out.println(str + num);
//		box.setObj("String");
//		box.setObj(100);
//		System.out.println(box.getObj());
		
//		String result = (String) box.getObj();
//		System.out.println(result);
		
		List<String> list = new ArrayList<>();
		list.add("");
		
		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i);
		}
	}

}
