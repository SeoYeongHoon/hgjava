package com.yedam.classes.inherit;

public class FriendApp {
	private Friend[] friends;

	public FriendApp() {
		friends = new Friend[10];
	}

	// CRUD(Create, Read, Update, Delete)
	// Create: 친구 등록
	public boolean add(Friend frd) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}

	// Read: 목록, 이름
	private int idx = 0; // list의 인덱스 값 담기 위한 변수

	public Friend[] list(String name) {
		Friend[] list = new Friend[10];
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(name) || name.equals("")) {
					// getName() 메소드는 외부 패키지 lombok이 만들어줌
					list[idx++] = friends[i];
				}
			}
		}
		return list;
	}

	// Update: 수정(전화번호로 조회 => 회사: 회사, 부서정보 || 학교: 학교, 전공정보)
	public boolean modify(String phone, String info1, String info2) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(phone)) {
					friends[i].changeInfo(info1, info2);
					return true;
				}
			}
		}
		return false;
	}

	// 전화번호(키) 단건조회
	public Friend getFriend(String phone) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(phone)) {
					return friends[i];
				}
			}
		}
		return null;
	}

	// Delete(전화번호로 찾아서 삭제)
	public boolean remove(String phone) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(phone)) {
					friends[i] = null;
					return true;
				}
			}
		}
		return false;
	}
}
