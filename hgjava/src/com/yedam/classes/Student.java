package com.yedam.classes;

// 학생번호, 이름, 점수, 키
// 소개/(학생번호, 이름, 점수)
public class Student {
	// 필드
	String num;
	String name;
	int score;
	double height;
	
	// 생성자: 기본 생성자. new Friend()
	
	// 메소드
	public void showInfo () {
		System.out.printf("학생번호는 %s, 이름은 %s, 키는 %scm, 점수는 %d점입니다. \n", num, name, height, score);
	}
	
	String showInfoStr() {
		return "번호는 " + num;
	}
	
	public Student(String num, String name, double height, int score) {
		super();
		this.num = num;
		this.name = name;
		this.height = height;
		this.score = score;
	}
	
	public void setHeight(double height) {
		if(height < 0) {
			this.height = 160;
		} else {
			this.height = height;
		}
	}
	public double getHeight() {
		return this.height;
	}
	
	// num, name, score 작성
	public void setNum(String num) {
		this.num = num;
	}
	public String getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
}
