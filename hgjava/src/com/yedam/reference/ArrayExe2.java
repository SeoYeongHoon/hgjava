package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {

	public static void main(String[] args) {
//		int[] scores = new int[10];
////		System.out.println(scores[0]);
//		
//		scores[3] = 40;
//		scores = new int[5];
//		scores[4] = 500;
//		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("Scores[" + i + "] => " + scores[i]);
//		}
//		
//		int[] my_score = new int[5];
//		my_score[0] = 78;
//		my_score[1] = 82;
//		my_score[2] = 77;
//		my_score[3] = 90;
//		my_score[4] = 85;
//		
//		int count = 0;
//		
//		// 80점 이상인 학생은 3명입니다.
//		for (int i = 0; i < my_score.length; i++) {
//			if (my_score[i] >= 90) {
////				System.out.println("인덱스" + i);
//				count++;
//				break;
//			} else {
//				count = 0;
//				System.out.println("90점 이상인 학생은 없습니다.");
//				break;
//			}
//		}
//		System.out.println("90점 이상인 학생은 " + count + "명 입니다.");
//		System.out.println("======= End of Program =======");
		
//		double[] dbArr = { 67.3, 72.5, 98.3, 79.3, 90.4 };
//		double avg = 0;
//		double sum = 0;
//		// 친구의 평균 몸무게는 ?? 입니다.
//		
//		for (int i = 0; i < dbArr.length; i++) {
//			sum += dbArr[i];
//			avg = sum / dbArr.length;
//		}
////		System.out.printf("친구의 평균 몸무게는 %.1f입니다.\n", avg);
////		System.out.println("친구의 평균 몸무게는 " + avg + "입니다.");
//		
//		// 배열의 값 중에서 제일 큰 값을 출력
//		double max = 0;
//		double min = dbArr[0];
//		for (int i = 0; i < dbArr.length; i++) {
//			if (max < dbArr[i]) {
//				max = dbArr[i];
//			}
//			if (min > dbArr[i]) {
//				min = dbArr[i];
//			}
//		}
//		System.out.println("가장 큰 값은: " + max);
//		System.out.println("가장 작은 값은: " + min);
//		System.out.println("======= End of Program =======");
		
		Scanner sc = new Scanner(System.in);
		double[] weight = new double[5];
		weight[0] = 78.3;
		weight[1] = 82.5;
		weight[2] = 77.9;
		weight[3] = 90.0;
		weight[4] = 100.1;
		
		int[] score = new int[5];
		score[0] = 90;
		score[1] = 80;
		score[2] = 95;
		score[3] = 82;
		score[4] = 75;
		
//		System.out.println("친구입력: ");
//		String name = sc.nextLine();
		boolean isExist = false;
		
		String[] friends = {"홍길동", "김민수", "박석민", "최홍만", "서영훈"};
		// 김민수는 2번째에 있습니다.
		
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i].equals(name)) {
//				System.out.println(name + "은(는) " + weight[i] + "kg, " + score[i] + "점입니다.");
//				isExist = true;
//			}
//		}
//		if (!isExist) {
//			System.out.println("이름을 다시 입력해주세요.");
//		}
		
		// 김민수는 82.5kg, 92점입니다.
		double max_weight = 0;
		double min_weight = weight[0];
		
		int max_score = 0;
		int min_score = score[0];
		
		// friends 위치에 담을 인덱스
		int index = 0;
		
		String name = "";
		String my_weight = "";
		
		for (int i = 0; i < score.length; i++) {
			if (max_score < score[i]) {
				max_score = score[i];
				name = friends[i];
			}
			if (min_score > score[i]) {
				min_score = score[i];
				name = friends[i];
			}
		}
		for (int i = 0; i < weight.length; i++) {
			if (max_weight < weight[i]) {
				max_weight = weight[i];
				my_weight = friends[i];
			}
			if (min_weight > weight[i]) {
				min_weight = weight[i];
				my_weight = friends[i];
			}
		}
		System.out.println("점수가 가장 높은 사람은 " + name + ", \n몸무게가 가장 높은 사람은 " + my_weight + "입니다.");
		// 점수가 젤 높은 사람은 ??, 가장 몸무게가 높은 사람은 ??
		System.out.println("======= End of Program =======");
	}

}
