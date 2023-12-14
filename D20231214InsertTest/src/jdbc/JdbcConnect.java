package jdbc;

import java.sql.Connection;		// <- module(Library) == *.jar
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnect {
	
	public JdbcConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver Loading Success");
			
		} catch (ClassNotFoundException e) {			
			System.out.println("DB Driver를 찾을 수 없습니다");
			e.printStackTrace();
		}
	}
	
	// DB와 연결 처리를 할 때 DB의 정보
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
		
			System.out.println("MySQL Connection Success");
			
		} catch (SQLException e) {		
			System.out.println("MySQL에 연결할 수 없습니다");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public int userInsert(String id, String name, int age) {
		
		String sql = " insert into user(id, name, age, joindate) "
				+ "    values('" + id + "', '" + name + "', " + age + ", now()) ";
		
		Connection conn = getConnection();
		Statement stmt = null;
		int count = 0;
		
		try {
			stmt = conn.createStatement();	// 접속 초기화
			
			count = stmt.executeUpdate(sql);	// sql을 실행 + 결과
			
			System.out.println("MySQL에 데이터 추가 성공!");			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			
			try {
				if(stmt != null) {	// 후처리
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}		
		}
		
		return count;
	}
	
	
	

}


