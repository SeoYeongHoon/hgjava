package com.yedam.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassExe {

	public static void main(String[] args) throws FileNotFoundException {
		Class cls = String.class;
		String str = "";

		cls = str.getClass();
		try {
			cls = Class.forName("com.yedam.api.Member");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 해당 클래스의 메소드 확인
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("사용된 메소드: " + method.getName());
		}

		System.out.println("===========================");

		// 해당 클래스의 필드 확인
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("사용된 필드: " + field.getName());
		}

		System.out.println("===========================");

		// 경로 정보
		String path = cls.getResource("ObjectExe.class").getPath();
		System.out.println("경로: " + path);

		String path2 = cls.getResource("sample.txt").getPath();
		System.out.println("경로: " + path2);

//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File(path2));
		System.out.println(sc.nextLine());
		
		System.out.println("===========================");
	}

}
