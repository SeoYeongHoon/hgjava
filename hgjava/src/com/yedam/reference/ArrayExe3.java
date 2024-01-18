package com.yedam.reference;

public class ArrayExe3 {

	public static void main(String[] args) {
		Friend f1 = new Friend();	// f1으로 초기화
		f1.name = "홍길동";
		f1.weight = 78.4;
		f1.score = 80;
		
		Friend f2 = new Friend();
		f2.name = "김길동";
		f2.weight = 80.1;
		f2.score = 90;
		
		Friend f3 = new Friend();
		f3.name = "이길동";
		f3.weight = 66.2;
		f3.score = 88;
		
		// 새로운 친구
		String name = "김말숙";
		double weight = 55.5;
		int score = 78;
		
		Friend f4 = new Friend();
		f4.name = "김말숙";
		f4.weight = 55.5;
		f4.score = 70;
		
		Friend[] friends = { f1, f2, f3, f4 };
		friends = new Friend[5];
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;	
		friends[3] = f4;	// { f1, f2, f3, f4, null }
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals("김말숙")) {
				f4.name = "서영훈";
				f4.weight = 77.9;
				f4.score = 90;
				System.out.printf("이름은 %s 몸무게는 %.1fkg 점수는 %d점", friends[i].name, 
						friends[i].weight, (friends[i].score));
//				System.out.println("몸무게는 " + friends[i].weight + "kg, 점수는 " + friends[i].score);
			}
		}
	}

}
