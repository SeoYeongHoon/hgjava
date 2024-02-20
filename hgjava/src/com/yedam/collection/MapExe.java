package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {

	public static void main(String[] args) {
		// 키: 값 => 중복 있어선 안됨
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "박길동");
		map.put(4, "최길동");

		map.put(3, "이길동");
		// 키 값이 동일하면, 마지막으로 들어오는 Value 값으로 바뀜
		
		map.remove(3); // 삭제

		System.out.println("크기: " + map.size());

		// 키 값만 set
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iter = keyset.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			String val = map.get(key); // 키의 값을 반환
//			System.out.printf("키: %d, 값: %s \n", key, val);
		}

		// 키와 값을 set
		Set<Entry<Integer, String>> entry =  map.entrySet();
		Iterator<Entry<Integer, String>> iter2 = entry.iterator();
		while (iter2.hasNext()) {
			Entry<Integer, String> ent = iter2.next(); // next(): 키 값, Value 값 둘 다 반환
			System.out.printf("키: %d, 값: %s \n", ent.getKey(), ent.getValue());
		}
		
	}

}
