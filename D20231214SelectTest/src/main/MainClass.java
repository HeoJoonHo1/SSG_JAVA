package main;

import java.util.List;

import cls.SelectTest;
import db.DBConnection;
import dto.UserDto;

public class MainClass {
	public static void main(String[] args) {
		DBConnection.initConnection();
		
		String id = "bcd";
		
		SelectTest st = new SelectTest(); 
		/*		
		UserDto user = st.getUser(id);
		if(user != null) {
			System.out.println(user.toString());
		}else {
			System.out.println("등록되지 않은 id입니다");
		}
		*/
		
		List<UserDto> list = st.getUserList();
		if(list.size() > 0) {
			for (UserDto userDto : list) {
				System.out.println(userDto.toString());
			}
			
		}else {
			System.out.println("등록된 id가 없습니다");
		}

	}
}
