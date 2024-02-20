package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김민석");
		names.add(1, "이민수");	// 배열의 1번 자리에 "이민수" 추가 => 배열크기 +1
		names.add(1, "최민식");
		names.set(1, "고길동");	// 배열의 1번 자리에 "고길동" 교체
		names.remove(1);		// 배열의 1번 자리 삭제 => 배열크기 -1
		
//		names.clear();			// 컴파일 에러
		
		System.out.println(names.size());	// 배열의 크기
		System.out.println(names.get(1));	// names배열의 1번 자리값
		System.out.println(names);
		
		// 컴파일 에러 처리
//		if (names.size() > 2) {
//			System.out.println(names.get(1));
//		}
		
		// names에서 받아온 값을 name에 담는다
		for (String name : names) {
			System.out.println(name);
		}
		
		// members: 컬렉션, Member: 인스턴스
		List<Member> members = new ArrayList<>();
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "김민석"));
		members.add(new Member(3, "이충희"));
		
		for (int i = 0; i < members.size(); i++) {
//			Member member = members.get(i);	// 둘의 타입이 같아야함
			String name = members.get(i).getName();
			int id = members.get(i).getMid();
			
			if (name == "김민석") {
				members.set(i, new Member(4, "김길동"));
			}
			
//			System.out.printf("이름: %s, 아이디: %d\n", name, id);
			System.out.printf("%s\n", members.get(i).toString());
		}
	}

}
