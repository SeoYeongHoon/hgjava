package com.yedam.classes.inherit;

import lombok.Data;

@Data

// 부모클래스 Friend를 상속
public class UnivFriend extends Friend {
	private String univ;	// 학교
	private String major;	// 전공
	
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.univ = info1;
		this.major = info2;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 학교는 " + univ + ", 전공은 " + major;
	}
}
