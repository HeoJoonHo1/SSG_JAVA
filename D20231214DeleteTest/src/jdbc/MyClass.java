package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBClose;
import db.DBConnection;

public class MyClass {

	// delete
	public int userDelete(String id) {
		
		String sql = " 	delete from user "
				+ " 	where id = '" + id + "'";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		
		int count = 0;
		
		try {
			stmt = conn.createStatement();		// 상태 초기화
			
			count = stmt.executeUpdate(sql);	// Query 문을 실행!
			
			System.out.println("정상적으로 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			
			DBClose.close(conn, stmt, null);
		}
		
		return count;		
	}
	
	// update
	public int userUpdate(String id, String name) {
		
		String sql = " 	update user "
				+ "		set name = '" + name + "' "
				+ "		where id = '" + id + "' ";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		
		int count = 0;
		
		try {
			stmt = conn.createStatement();
			
			count = stmt.executeUpdate(sql);
			
			System.out.println("정상적으로 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			
			DBClose.close(conn, stmt, null);			
		}		
		
		return count;
	}
	
	
}







