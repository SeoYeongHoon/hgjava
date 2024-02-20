package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.collection.emp.Employee;

public class StudentExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StudentApp app = new StudentApp();

		while (run) {
			System.out.println("1.등록 2.목록 9.종료");
			System.out.println("선택 >> ");

			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1: // 번호 이름 점수 (엔터)
				System.out.println("학번 이름 점수를 순서대로 입력하세요.");
				String[] inputArr = sc.nextLine().split(" ");
				try {
					app.storage.add(new Student(
						Integer.parseInt(inputArr[0]),
						inputArr[1],
						Integer.parseInt(inputArr[2])
					));
				} catch (NumberFormatException e) {
					System.out.println("등록 에러");
				}
				System.out.println("등록 완료");
				break;
			case 2:
				List<Student> list = app.list(); // app.list(): 목록을 가져오겠다는 메소드
				for (Student std : list) {
					System.out.println(std.toString());
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				app.save();
				run = false;
			}
		}

		System.out.println("End of Program");
	}

	static void StudentCollection() {
		// text.dat 파일 읽어서 => Student 컬렉션 저장
		List<Student> storage = new ArrayList<>();
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String read = br.readLine(); // 101 홍길동 90
				if (read == null)
					break;
				String[] readArr = read.split(" ");
				Student std = new Student( // Student 인스턴스 만들어서 std에 블럭 형태로 담기
						Integer.parseInt(readArr[0]), // 학생번호
						readArr[1], // 이름
						Integer.parseInt(readArr[2]) // 점수
				);
				storage.add(std); // std를 storage에 넣기
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 컬렉션 정보 출력
		for (Student std : storage) {
			System.out.println(std.toString());
		}
	}

}
