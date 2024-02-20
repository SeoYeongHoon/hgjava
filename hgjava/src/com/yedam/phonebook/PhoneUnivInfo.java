package com.yedam.phonebook;

public class PhoneUnivInfo extends PhoneInfo {
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phone, String major, int year) {
		super(name, phone); // 부모 생성자
		this.major = major;
		this.year = year;
	}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major >>> " + major);
		System.out.println("year >>> " + year);
	}
	
	@Override
	public String toString() {
		// 1,홍길동,010-1111
		return InputSelect.UNIV + "," + getName() + "," + getPhone() + "," + major + "," + year;
	}
}
