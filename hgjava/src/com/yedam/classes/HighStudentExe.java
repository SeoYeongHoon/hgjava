package com.yedam.classes;

public class HighStudentExe {

	public static void main(String[] args) {
		HighStudent hiStd = new HighStudent("T001", "김길동", 90, 80);
//		hiStd.showInfo();
		
		// 부모클래스의 참조변수에 자식클래스의 인스턴스를 대입
		Student std = new HighStudent("T002", "서길동", 180, 80);
//		std.showInfo();
		
		// 부모 클래스를 자식클래스로 강제형변환(Casting)
		HighStudent hstd = (HighStudent) std;
		System.out.println(hstd.getHeight());
		
		// 오류 발생
		Student std1 = new Student("S003", "박석민", 150, 90);
		if(std1 instanceof HighStudent) {
			// instanceof: std1의 인스턴스 유형이 HighStudent과 같은지
			
			HighStudent hstd1 = (HighStudent) std1;
			System.out.println(hstd1.getHeight());
		}
		
		Student[] students = new Student[10];
		
		students[0] = new Student("S010", "서영훈", 180, 90);
		students[1] = hiStd;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				students[i].showInfo();
			}
		}
		
		long ln1 = 10;	// 큰 범위 변수 = (큰 범위 변수)작은 범위 값. 즉 long ln1 = (int) 10;
	}

}
