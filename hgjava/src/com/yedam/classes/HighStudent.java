package com.yedam.classes;

// 담임 선생님
public class HighStudent extends Student {
	private String teacher;
	
	// 기본 생성자 선언
	public HighStudent(String num, String name, double height, int nick) {
		super(num, name, height, nick);
		// super: 부모클래스(Student)의 생성자 값으로 호출
		// Ctrl + 클릭으로 위치 확인 가능
		
		this.teacher = teacher;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	// 부모 메소드를 재정의(오버라이딩 Overriding)
	public void showInfo() {
		// 자식 클래스: teacher정보도 출력
		System.out.printf("선생님의 번호는 %s, 이름은 %s, 키는 %scm, 점수는 %d점입니다. \n", 
				getNum(), getName(), getHeight(), getScore());
	}

}
