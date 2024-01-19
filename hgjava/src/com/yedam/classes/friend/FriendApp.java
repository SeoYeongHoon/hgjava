package com.yedam.classes.friend;

// 등록기능, 수정기능, 삭제기능, 목록, 단건조회
public class FriendApp {
	// 필드선언 >> 친구 정보를 저장할 수 있는 배열
	Friend[] friends;
	
	// 생성자
	public FriendApp() {
		friends = new Friend[10];
	}
	
	// 메소드
	// 1.등록
	public boolean frdAdd(Friend frd) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}
	
	// 2.목록
	public Friend[] frdList() {
		return friends;
	}
	
	// 3.수정
	public boolean frdModify(String frdName, String frdPhone) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getFrdName().equals(frdName)) {
				friends[i].setFrdName(frdName);
				return true;
			}
		}
		return false;
	}
	
	// 친구 이름 검색
	public Friend getFriend(String frdName) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getFrdName().equals(frdName)) {
				return friends[i];
			}
		}
		return null;
	}
	
	// 4.삭제
	public boolean frdRemove(String frdName) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getFrdName().equals(frdName)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}
	
}
