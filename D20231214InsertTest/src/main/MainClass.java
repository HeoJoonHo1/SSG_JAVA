package main;

import jdbc.JdbcConnect;

public class MainClass {

	public static void main(String[] args) {
		
		// JDBC : Java DataBase Connectivity
		
		JdbcConnect jc = new JdbcConnect();
		
		// jc.getConnection();
		
		String id = "cde";
		String name = "일지매";
		int age = 22;
		
		int count = jc.userInsert(id, name, age);
		if(count > 0) {
			System.out.println("정상적으로 추가되었습니다");			
		}
		
	}

}




