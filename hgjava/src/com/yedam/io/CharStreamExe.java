package com.yedam.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Class cls = CharStreamExe.class;
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path);
		path = "/D:/git/hgjava/hgjava/bin/com/yedam/io/ByteStreamExe.class";

		try {
			FileReader fr = new FileReader(path);

			while (true) {
				int read = fr.read();
				if (read == -1)
					break;
				System.out.println((char) read);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of Program");
	}

	// 문자기반 입출력
	static void write() {
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			while (true) {
				System.out.println("입력 >> ");
				String str = sc.nextLine();
				if (str.equals("stop"))
					break;
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
