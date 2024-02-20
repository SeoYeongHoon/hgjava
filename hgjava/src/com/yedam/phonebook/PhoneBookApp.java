package com.yedam.phonebook;

import java.io.File;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

// 연락처 app
public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		// 사용자 권한 체크
		// UserManager => userCheck(아이디, 비번)
		// 3번 연속으로 인증이 실패할 경우 프로그램 종료
		
		int menu = 1;

		while (true) {
//			File file = new File("c:/temp/example.wav");
//			try {
//				AudioInputStream ais = AudioSystem.getAudioInputStream(file);
//				
//				Clip clip = AudioSystem.getClip();
//				clip.open(ais);
//				clip.start();
//				Thread.sleep(clip.getMicrosecondLength() / 1000);
//			} catch (Exception e) {
//				System.out.println("음악재생 종료");
//				break;
//			}
			
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (menu < InitMenu.INPUT || menu > InitMenu.EXIT) {
					throw new MenuChoiceException(menu);
				}

				if (menu == InitMenu.INPUT) {
//					System.out.println("입력처리");
					manager.inputData();
				} else if (menu == InitMenu.SEARCH) {
					System.out.println("검색처리");
					manager.searchData();
				} else if (menu == InitMenu.DELETE) {
//					System.out.println("삭제처리");
					manager.deleteData();
				} else if (menu == InitMenu.EXIT) {
					System.out.println("종료처리");
					manager.storeToFile();
					break;
				} 
//				else if (menu == InitMenu.PLAY) {
//					if ()
//				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}

		}

		System.out.println("END OF PROGRAM");
	}
}
