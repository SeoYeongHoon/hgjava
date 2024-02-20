package com.yedam.api;

public class Member extends Object {
	String name;
	int age;

	Member() {
	}

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
		// name이 String타입
		// String타입이 가지고 있는 hashCode를 가져와 쓰겠다.
		// => 중복x
	}

	// name 같으면 논리적으로 동일한 객체
	// => Object.equals() 메소드 사용
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member target = (Member) obj;
			if (this.name.equals(target.name) && this.age == target.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}
}
