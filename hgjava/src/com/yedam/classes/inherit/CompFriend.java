package com.yedam.classes.inherit;

import lombok.Data;

@Data

//부모클래스 Friend를 상속
public class CompFriend extends Friend {
	private String comp;	// 회사
	private String dept;	// 부서
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.comp = info1;
		this.dept = info2;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 회사는 " + comp + ", 부서는 " + dept;
	}
}
