package addressbook;

import java.util.List;
import java.util.Scanner;

import dao.AddressBookDao;
import dto.AddressBookDto;

public class AddressBook {
	Scanner sc = new Scanner(System.in);

	// input
	public void add() {
		System.out.println("지인추가입니다");
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		System.out.print("전화번호 >> ");
		String phone = sc.next();
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		System.out.print("메모 >> ");
		String memo = sc.next();
		
		AddressBookDao dao = AddressBookDao.getInstance();		
		boolean b = dao.insert(new AddressBookDto(name, age, phone, address, memo));
		if(!b) {
			System.out.println("지인이 추가되지 않았습니다");
		}
		
		System.out.println("성공적으로 추가되었습니다");
	}
	
	public void drop() {
		System.out.println("삭제입니다");
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		AddressBookDao dao = AddressBookDao.getInstance();
		boolean b = dao.delete(name);
		if(!b) {
			System.out.println("데이터가 없거나 삭제되지 않았습니다");
		}
		
		System.out.println("삭제되었습니다");
	}
	
	public void nameSearch() {
		System.out.println("이름으로 검색합니다");
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		AddressBookDao dao = AddressBookDao.getInstance();
		List<AddressBookDto> list = dao.nameSelect(name);
		
		if(list.size() == 0) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		for (AddressBookDto a : list) {
			System.out.println(a.toString());			
		}	
	}
	
	public void addressSearch() {
		System.out.println("주소로 검색합니다");
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		AddressBookDao dao = AddressBookDao.getInstance();
		List<AddressBookDto> list = dao.addressSelect(address);
		
		if(list.size() == 0) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		for (AddressBookDto a : list) {
			System.out.println(a.toString());			
		}		
	}
	
	public void memoSearch() {
		System.out.println("메모로 검색합니다");
		
		System.out.print("검색어 >> ");
		String keyword = sc.next();
		
		List<AddressBookDto> list = AddressBookDao.getInstance().memoSelect(keyword);
		
		if(list.size() == 0) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		for (AddressBookDto a : list) {
			System.out.println(a.toString());			
		}		
	}
	
	public void upgrade() {
		System.out.println("수정입니다");
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		System.out.print("수정할 항목(1.전화번호, 2.주소, 3.메모) >> ");
		int choice = sc.nextInt();
		
		String title = "";
		AddressBookDto dto = null;
		switch(choice) {
			case 1:
				title = "전화번호";
				System.out.print("전화번호 >> ");
				String phone = sc.next();
				dto = new AddressBookDto(null, 0, phone, null, null);
				break;
			case 2:
				title = "주소";
				System.out.print("주소 >> ");
				String address = sc.next();
				dto = new AddressBookDto(null, 0, null, address, null);
				break;
			case 3:
				title = "메모";
				System.out.print("메모 >> ");
				String memo = sc.next();
				dto = new AddressBookDto(null, 0, null, null, memo);
				break;
		}
		
		AddressBookDao dao = AddressBookDao.getInstance();
		boolean b = dao.update(name, dto, title);
		if(!b) {
			System.out.println("데이터에 없거나 수정되지 않았습니다");
		}
		
		System.out.println("수정되었습니다");
	}
}







