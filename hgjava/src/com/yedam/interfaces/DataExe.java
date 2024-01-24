package com.yedam.interfaces;

public class DataExe {
	public static void main(String[] args) {
		// MySQL vs Oracle
//		MysqlDB mysql = new MysqlDB();
//		OracleDB oracle = new OracleDB();
		
		// 인터페이스의 참조변수
		DAO dao = new MysqlDB();

		int menu = 0;

		if (menu == 1) {
			dao.insert();
		} else if (menu == 2) {
			dao.update();
		} else if (menu == 3) {
			dao.delete();
		}

//		if (menu == 1) {
//			oracle.insert();
//		} else if (menu == 2) {
//			oracle.update();
//		} else if (menu == 3) {
//			oracle.delete();
//		}
	}
}
