package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("홍길동");
		names.add("최민식");
		names.add("손흥민");
		names.add("이병헌");

		names.remove("손흥민");

		System.out.println(names.size());

		// 반복자. String(타입)에 해당하는 반복 요소를 가져옴
		Iterator<String> iter = names.iterator();
		while (iter.hasNext()) { // 대상이 있는지 체크
			String result = iter.next(); // 선택해서 가져옴
			System.out.println(result);
		}

		// 확장 for
		for (String name : names) {
			System.out.println(name);
		}

		// 중복된 값 제거
		int[] numbers = { 10, 20, 30, 20 };
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		for (int num : set) {
			System.out.println(num);
		}
	}

}
