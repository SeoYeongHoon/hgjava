package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamExe {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자기반 입출력
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String read = br.readLine(); // 한 라인씩 읽기

				if (read == null) // eof => null 반환
					break;

				System.out.println(read);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void write() {
		// 바이트 출력 스트림
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.date");
			fos.write(10);
			fos.write(20);
			fos.write(30);
			fos.flush();
			fos.close(); // 자원환원
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void read() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.date");
			while (true) {
				int bytes = fis.read(); // 파일의 마지막 부분(End of file)이 되면 -1 값을 반환
				if (bytes == -1)
					break;
				System.out.println(bytes);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of File");
	}

	static void copy() {
		// 입력과 출력을 이용해서 복사 기능 구현
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.jpg");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.jpg");

			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				fos.write(buf);
			}
			fos.flush();
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void buff() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.jpg");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.jpg");
//			byte[] byteArr = new byte[100]; // 배열활용한 속도 향상

			// 보조스트림: Buffered...
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (true) {
//				int buf = fis.read(byteArr);
				int buf = bis.read();
				if (buf == -1) {
					break;
				}
//				fos.write(byteArr);
				bos.write(buf);
			}
//			fos.flush(); 
//			fos.close();
//			fis.close();
			bos.flush();
			bos.close();
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
