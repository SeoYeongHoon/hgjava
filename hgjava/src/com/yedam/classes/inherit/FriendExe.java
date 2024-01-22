package com.yedam.classes.inherit;

import java.util.Scanner;

// 사용자 입력 -> 처리결과 출력: 컨트롤
public class FriendExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		FriendApp app = new FriendApp();
		
		// start of while
		while(run) {
			System.out.println("======== 친구 관리 프로그램 ========");
			System.out.println("1.등록  2.목록  3.수정  4.삭제  9.종료");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			Friend friend = null;
			
			switch(menu) {
				// 1.등록: 1>이름-연락처(공통) 2>학교친구 3>회사친구
				case 1:
					System.out.println("1.친구  2.학교  3.회사 ");
					int subMenu = Integer.parseInt(sc.nextLine());
					
					System.out.println("이름 입력: ");
					String name = sc.nextLine();
					System.out.println("전화번호 입력: ");
					String phone = sc.nextLine();
					
					if(subMenu == 1) {
						friend = new Friend();
						friend.setName(name);
						friend.setPhone(phone);
					} else if(subMenu == 2) {
						UnivFriend univFriend = new UnivFriend();
						univFriend.setName(name);
						univFriend.setPhone(phone);
						
						System.out.println("대학이름 입력: ");
						String univ = sc.nextLine();
						univFriend.setUniv(univ);
						System.out.println("전공이름 입력: ");
						String major = sc.nextLine();
						univFriend.setMajor(major);
						
						friend = univFriend;
					} else if(subMenu == 3) {
						CompFriend compFriend = new CompFriend();
						compFriend.setName(name);
						compFriend.setPhone(phone);

						System.out.println("회사이름 입력: ");
						String company = sc.nextLine();
						compFriend.setComp(company);
						System.out.println("부서이름 입력: ");
						String dept = sc.nextLine();
						compFriend.setDept(dept);
						
						friend = compFriend;
					}
					
					if(app.add(friend)) {
						System.out.println("======== 정상 등록 ========");
					} else {
						System.out.println("!!!!!!!! 등록 안됨 !!!!!!!!");
					}
					
					break;
					
				// 2.목록
				case 2:
					System.out.println("조회할 이름입력: ");
					
					String fname = sc.nextLine();
					Friend[] list = app.list(fname);
					
					for(int i = 0; i < list.length; i++) {
						if(list[i] != null) {
							System.out.println(list[i].toString());
							// 외부 패키지 lombok이 toString() 메소드를 정의해둠
							// => Override로 toString 메소드 선언
						}
					}
					break;
				
				// 3. 수정
				case 3:
					System.out.println("수정할 전화번호입력: ");
					String mphone = sc.nextLine();
					Friend mfrd = app.getFriend(mphone);
					String info1 = "", info2 = "";
										
					if(mfrd instanceof UnivFriend) {
						System.out.println("수정할 학교입력: ");
						info1 = sc.nextLine();
						System.out.println("수정할 전공입력: ");
						info2 = sc.nextLine();
						
						
					} else if (mfrd instanceof CompFriend){
						System.out.println("수정할 학교입력: ");
						info1 = sc.nextLine();
						System.out.println("수정할 전공입력: ");
						info2 = sc.nextLine();
					}
					
					if(app.modify(mphone, info1, info2)) {
						System.out.println("======== 수정 완료 ========");
					} else {
						System.out.println("!!!!!!!! 수정 실패 !!!!!!!!");
					}
										
					break;
					
					
				// 4. 삭제
				case 4:
					System.out.println("삭제할 전화번호입력: ");
					
					String rphone = sc.nextLine();
					
					if(app.remove(rphone)) {
						System.out.println("======== 삭제 완료 ========");
					} else {
						System.out.println("!!!!!!!! 삭제 안됨 !!!!!!!!");
					}
					break;
					
				// 9.종료
				case 9:
					System.out.println("!!!!!!!! 종료 !!!!!!!!");
					break;
			}
			
		}
		// end of while
		
		System.out.println("======== End of Program ========");
	}

}
