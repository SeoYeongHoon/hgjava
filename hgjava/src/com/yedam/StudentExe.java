package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		Student std = new Student("S001", "홍길동", 180, 90);
		std.setHeight(176);
		
		std.showInfo();
	}
}
