package main;

import db.DBConnection;
import jdbc.MyClass;

public class MainClass {
	public static void main(String[] args) {
		DBConnection.initConnection();
				
		
		MyClass mycls = new MyClass();
		/*
		String id = "cde";
		int count = mycls.userDelete(id);
		if(count > 0) {
			System.out.println("삭제되었습니다");
		}
		*/
		
		String id = "abc";
		String name = "홍두께";
		
		int count = mycls.userUpdate(id, name);
		if(count > 0) {
			System.out.println("수정되었습니다");
		}
		
	}
}



