package com.yedam.classes.friend;

// 친구이름, 연락처, 나이 >> 관리하는 프로그램
public class Friend {
	// 필드
	String frdName = "";
	String frdPhone = "";
	int frdAge = 0;

	// 메소드
	void showInfo() {
		System.out.printf("친구이름은 %s, 전화번호는 %s, 나이는 %s살입니다. \n", frdName, frdPhone, frdAge);
	}

	
	public Friend(String frdName, String frdPhone, int frdAge) {
		// TODO Auto-generated constructor stub
		this.frdName = frdName;
		this.frdPhone = frdPhone;
		this.frdAge = frdAge;
	}
	
	public String getFrdName() {
		return frdName;
	}


	public void setFrdName(String frdName) {
		this.frdName = frdName;
	}


	public String getFrdPhone() {
		return frdPhone;
	}


	public void setFrdPhone(String frdPhone) {
		this.frdPhone = frdPhone;
	}


	public int getFrdAge() {
		return frdAge;
	}


	public void setFrdAge(int frdAge) {
		this.frdAge = frdAge;
	}
}
