package com.yedam.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class VariableExe6 {
	public static void main(String[] args) throws FileNotFoundException {
		// 표준 입출력: 키보드(System.in), 모니터(Systm.out)
		InputStream is = new FileInputStream("test.txt");
		Scanner sc = new Scanner(is);
		
		String name = sc.nextLine();
		// 나이(age, int타입), 키(height, double타입), 
//		int age = sc.nextInt();
		int age = Integer.parseInt(sc.nextLine());
//		double height = sc.nextDouble();
		double height = Double.parseDouble(sc.nextLine());
		
//		System.out.println(": " + name + age + height);
		
		sc.close();
		// 이름은 홍길동, 나이는 20세, 키는 180.5cm
		System.out.printf("이름은 %s, 나이는 %d, 키는 %.2fcm 입니다.", name, age, height);
	}
}
