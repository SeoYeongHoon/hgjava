package com.yedam.io.emp;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 초기화
// 추가
// 목록
// 종료(컬렉션 -> 파일저장)
public class EmpApp { // 직렬화, 역직렬화 이용
	List<Employee> storage = new ArrayList<>();

	public EmpApp() {
		init();
	}

	// 시작
	public void init() {

		try {
			File file = new File("c:/temp/emp.dat");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileInputStream fis = new FileInputStream("c:/temp/emp.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			storage = (List<Employee>) ois.readObject(); // 바이트 -> 객체생성(역직렬화)
			ois.close();
			fis.close();
		} catch (EOFException e) {
			
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
		}

	}

	// 등록
	public boolean add(Employee emp) {
		return storage.add(emp);
	}

	// 목록
	public List<Employee> list() {
		return storage;
	}

	public void save() {
		// 기본 스트림 -> 보조 스트림 -> 저장
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/emp.dat");
			ObjectOutput oos = new ObjectOutputStream(fos);

			oos.writeObject(storage); // 객체타입을 파일에 쓰기

			oos.flush();
			fos.flush();
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
