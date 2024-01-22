package com.yedam.classes.inherit;

import lombok.Data;

//외부 패키지(lombok) import 하기
@Data

// 이름, 연락처 (Friend 클래스 생성)
// 이름, 연락처, 학교, 전공 (UnivFriend. 대학교 친구)
// 이름, 연락처, 회사, 부서 (CompFriend. 회사 친구)
public class Friend {
	private String name;
	private String phone;
	
	// get메소드, set메소드 생성 => 외부 패키지 lombok이 자동으로 생성
	
	public void changeInfo(String info1, String info2) {
		return;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + ", 연락처는 " + phone;
	}
}
