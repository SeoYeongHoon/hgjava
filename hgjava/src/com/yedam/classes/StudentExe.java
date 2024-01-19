package com.yedam.classes;

public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student("S001", "홍길동", 80, 80.5);	// 생성자
		System.out.println(s1.num);
		s1.setHeight(-50);
		System.out.println(s1.getHeight());
		s1.setNum("");
		System.out.println("번호: " + s1.getNum());
		s1.showInfo();
		
//		Student s2 = new Student("S002", "김길동", 77, 87.2);	// 생성자
//		System.out.println(s2.num);
//		s2.showInfo();
//		
//		Student s3 = new Student("S003", "박길동", 94, 76);	// 생성자
//		System.out.println(s3.num);
//		s3.showInfo();
	}
}
