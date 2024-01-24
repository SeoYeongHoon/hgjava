package com.yedam.interfaces;

public interface DAO {
	
	// 규칙: abstract를 쓰지 않아도 자동으로 추상메소드
	public void insert();
	public void update();
	public void delete();
	
//	public void add();
//	public void modify();
//	public void remove();
}
