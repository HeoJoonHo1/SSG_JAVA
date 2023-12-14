package main;

import java.util.Scanner;

import addressbook.AddressBook;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AddressBook book = new AddressBook();
		
		// menu
		out:while(true) {
			
			System.out.println(" << 주소록 >> ");
			System.out.println("1. 지인추가");
			System.out.println("2. 지인삭제");
			System.out.println("3. 이름검색");
			System.out.println("4. 주소검색");
			System.out.println("5. memo검색");
			System.out.println("6. 지인수정");				
			System.out.println("7. 종료");
			
			System.out.print(">> ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:		// 1.지인추가
					book.add();
					break;		
					
				case 2:		// 2.지인삭제
					book.drop();
					break;
					
				case 3:		// 3.이름
					book.nameSearch();
					break;
					
				case 4:		// 4.주소
					book.addressSearch();
					break;
					
					// 5.memo
				case 5:
					book.memoSearch();
					break;
		
					// 6.지인수정
				case 6:
					book.upgrade();
					break;
					
				case 7:					
					break out;
				default:					
			}
		}
		
		System.out.println("프로그램을 종료합니다");
		
	}

}
