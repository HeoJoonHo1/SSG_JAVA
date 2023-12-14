package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.AddressBookDto;

public class AddressBookDao {

	private static AddressBookDao abd = null;
	// Database 와 통신, Singleton
	
	private AddressBookDao() {
	}
	
	public static AddressBookDao getInstance() {
		if(abd == null) {
			abd = new AddressBookDao();
		}
		return abd;
	}
	
	public boolean insert(AddressBookDto dto) {
		String sql = " 	insert into addressbook(name, age, phone, address, memo) "
				+ "		values('" + dto.getName() + "', "
								  + dto.getAge() + ", '" 
								  + dto.getPhone() + "', '"
								  + dto.getAddress() + "', '"
								  + dto.getMemo() + "') "; 
		
		Connection conn = null;
		Statement stmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
				
			stmt = conn.createStatement();			
			count = stmt.executeUpdate(sql);
			
			System.out.println("정상적 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, null);
		}
		
		return count>0?true:false;
	}
	
	public boolean delete(String name) {
		String sql = " delete from addressbook "
				+ "    where name = '" + name + "' ";
		
		Connection conn = null;
		Statement stmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
				
			stmt = conn.createStatement();
			
			count = stmt.executeUpdate(sql);
			
			System.out.println("정상 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, null);
		}	 	
		
		return count>0?true:false;
	}
	
	public List<AddressBookDto> nameSelect(String findname) {
		String sql = " select name, age, phone, address, memo "
				+ "    from addressbook "
				+ "    where name like '%" + findname + "%' ";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AddressBookDto> list = new ArrayList<AddressBookDto>();
		
		try {
			conn = DBConnection.getConnection();
				
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String memo = rs.getString("memo");
				
				AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);
				
				list.add(dto);				
			}
			System.out.println("정상 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, rs);
		}
		
		return list;
	}
	
	public List<AddressBookDto> addressSelect(String addr) {
		String sql = " select name, age, phone, address, memo "
				+ "    from addressbook "
				+ "    where address like '%" + addr + "%' ";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AddressBookDto> list = new ArrayList<AddressBookDto>();
		
		try {
			conn = DBConnection.getConnection();
				
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String memo = rs.getString("memo");
				
				AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);
				
				list.add(dto);				
			}
			System.out.println("정상 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, rs);
		}
		
		return list;
	}

	public List<AddressBookDto> memoSelect(String keyword) {
		
		String sql = " select name, age, phone, address, memo "
				+ "    from addressbook "
				+ "    where memo like '%" + keyword + "%' ";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AddressBookDto> list = new ArrayList<AddressBookDto>();
		
		try {
			conn = DBConnection.getConnection();
				
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String memo = rs.getString("memo");
				
				AddressBookDto dto = new AddressBookDto(name, age, phone, address, memo);
				
				list.add(dto);				
			}
			System.out.println("정상 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, rs);
		}
		
		return list;
	}
	
	public boolean update(String name, AddressBookDto dto, String title) {
		String sql = " update addressbook ";
		
		if(title.equals("전화번호")) {
			sql += "set phone = '" + dto.getPhone() + "' "; 
		}else if(title.equals("주소")) {
			sql += "set address = '" + dto.getAddress() + "' ";
		}else {
			sql += "set memo = '" + dto.getMemo() + "' ";
		}
				
		sql += " where name = '" + name + "' ";
		
		Connection conn = null;
		Statement stmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
			
			stmt = conn.createStatement();
			
			count = stmt.executeUpdate(sql);
			
			System.out.println("정상 처리되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, null);
		}
		
		return count>0?true:false;
	}
	
}










