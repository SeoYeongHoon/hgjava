package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe2 {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		
		// Member.java에서 hashCode와 equals 오버라이딩 후 중복 제거
		
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "최민식"));
		members.add(new Member(3, "이병헌"));
		members.add(new Member(1, "홍길동"));
		
		members.remove(new Member(3, "이병헌"));
		
		System.out.println(members.size());
		
		// 키 값 없음. 반복된 요소를 가져오거나 삭제하는 컬렉션
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			Member member = iter.next(); // iter의 다음 값 가져오기
			System.out.println(member);
		}
	}

}
