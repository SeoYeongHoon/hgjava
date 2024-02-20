package com.yedam.collection;

// 어떤 타입의 값이라도 담을 수 있는 박스
public class Box<T> {	// T: 제너릭, 타입 파라미터 => 타입을 나중에 정하겠다.
	T obj;

	void setObj(T obj) {
		this.obj = obj;
	};

	T getObj() {
		return obj;
	}
}
