package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Iterator;

// 생성자(초기화), 등록, 검색, 삭제, 종료(파일 저장)
public class PhoneBookManager {

	private File dataFile = new File("c:/temp/phonebook.dat");

	// 컬렉션 선언
	HashSet<PhoneInfo> storage = new HashSet<>();

	// 싱글턴
	private static PhoneBookManager instance; // 초기값: null

	private PhoneBookManager() {
		// 초기화 작업
		readFromFile();

		// 확인(콘솔)
//		for (PhoneInfo in : storage) {
//			in.showPhoneInfo();
//		}
	}

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	// 메소드 1, 2, 3유형
	// 1유형
	private PhoneInfo getFriendInfo() {
		System.out.println("이름 >>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처 >>> ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	// 2유형
	private PhoneInfo getCompFriendInfo() {
		System.out.println("이름 >>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처 >>> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사 >>> ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	// 3유형
	private PhoneInfo getUnivFriendInfo() {
		System.out.println("이름 >>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처 >>> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공 >>> ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.println("학년 >>> ");
		int year = MenuViewer.keyboard.nextInt();
		return new PhoneUnivInfo(name, phone, major, year);
	}

	// 추가
	public void inputData() {
		System.out.println("===== 구분 =====");
		System.out.println("1.일반  2.회사  3.학교");
		System.out.print("선택 >>> ");

		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();

		PhoneInfo info = null;
		switch (choice) {
		case InputSelect.NORMAL:
			info = getFriendInfo();
			break;
		case InputSelect.COMPANY:
			info = getCompFriendInfo();
			break;
		case InputSelect.UNIV:
			info = getUnivFriendInfo();
			break;
		}

		if (storage.add(info)) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록오류");
		}
	}

	// 검색
	public void searchData() {
		System.out.println("===== 구분 =====");
		System.out.print("검색할 이름 >>> ");
		String name = MenuViewer.keyboard.nextLine();

		Iterator<PhoneInfo> iter = storage.iterator();
		while (iter.hasNext()) {
			PhoneInfo info = iter.next();
			
			if (info.getName().equals(name)) {
				System.out.println(info);
				return;
			}
		}
		System.out.println("검색한 이름이 없음");
	}

	// 삭제
	public void deleteData() {
		// 이름 기준 검색 -> 같은 이름이면 storage에서 빼기
		System.out.println("===== 구분 =====");
		System.out.print("삭제할 이름 >>> ");
		String name = MenuViewer.keyboard.nextLine();

		Iterator<PhoneInfo> iter = storage.iterator();
		while (iter.hasNext()) {
			PhoneInfo info = iter.next();

			if (info.getName().equals(name)) {
				iter.remove();
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 이름이 없음");
	}

	// 초기화
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return; // 메소드 종료
		}

		// 있으면 => 파일 읽기
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			PhoneInfo info = null;

			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				// 컬렉션에 저장
				int type = Integer.parseInt(record[0]);
				switch (type) {
				case InputSelect.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case InputSelect.COMPANY:
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				case InputSelect.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
				}
				storage.add(info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 저장
	public void storeToFile() {
		try {
			FileWriter fw = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = storage.iterator();

			while (iter.hasNext()) {
				PhoneInfo info = iter.next();

				// toString 활용
				fw.write(info.toString() + "\n");
			}
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
