package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

// hashCode, equals
public class ObjectExe2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("김길동");
		set.add("이길동");
		set.add("박길동");
		set.add("이길동");
		set.add("이길동");
		// => set으로 인해 중복저장 x
		for(String name : set) {	// for .. of ..
			System.out.println(name);
		}

		Set<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 29));
		members.add(new Member("박길동", 50));
		members.add(new Member("김길동", 40));
		members.add(new Member("김길동", 40));

		for (Member mem : members) {
//			System.out.println(mem.name + ": " + mem.age);
			System.out.println(mem.toString());
		}
	}

}
