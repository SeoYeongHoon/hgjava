package com.yedam.classes;

// 학생정보관리 기능
public class StudentApp {
	// 필드
	Student[] students;
	
	// 생성자
	public StudentApp() {
		students = new Student[10];	// 배열크기 설정
		
	}
	
	// 메소드
	
	// 1.등록
	public boolean add(Student std) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
	}
	
	// 2.목록
	public Student[] list() {
		return students;
	}
	
	// 3.수정
	public boolean modify(String stdNum, int stdScore) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNum().equals(stdNum)) {
				students[i].setScore(stdScore);
				return true;
			}
		}
		return false;
	}
	
	// 4. 삭제
	public boolean remove(String stdNum) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNum().equals(stdNum)) {
				students[i] = null;
				
				return true;
			}
		}
		return false;
	}
	
	// 5. 단건조회(학생번호)
	public Student get(String stdNum) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getNum().equals(stdNum)) {
				return students[i];
			}
		}
		return null;
	}
}
