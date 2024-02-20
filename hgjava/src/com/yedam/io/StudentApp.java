package com.yedam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentApp {
	// 초기화(text.dat) => 컬렉션에 저장
	// 추가 => 컬렉션에 추가
	// 목록
	// 종료 => 컬렉션 -> 파일저장(text.dat)

	List<Student> storage = new ArrayList<>();

	public StudentApp() {
		init();
	}

	// text.dat 파일 읽어서 => Student 컬렉션 저장
	public void init() {
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
	}
	// end of init

	// 추가
	public boolean add(Student std) {
		return storage.add(std);
	}

	// 목록 반환
	public List<Student> list() {
		return storage;
	}

	// 종료
	public void save() {
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			BufferedWriter bw = new BufferedWriter(fw);

			// 반복
			for (Student std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore();
				bw.write(str + "\n");
			}
			bw.flush();
			bw.close();

			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
