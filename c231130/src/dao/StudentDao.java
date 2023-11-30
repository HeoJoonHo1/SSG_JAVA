package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.StudentDto;
import singleton.SingletonClass;

public class StudentDao {
	Scanner sc = new Scanner(System.in);
		
	public StudentDao() {
	}
	
	public void insert() {
		System.out.println("학생 정보 입력입니다");	
		
		System.out.print("이름 >> ");
		String name = sc.next();
		
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		System.out.print("신장 >> ");
		double height = sc.nextDouble();
		
		System.out.print("주소 >> ");
		String address = sc.next();
		
		System.out.print("국어 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 >> ");
		int math = sc.nextInt();
		
		StudentDto dto = new StudentDto(name, age, height, address, kor, eng, math);
		
		SingletonClass sc = SingletonClass.getInstance();
		sc.list.add(dto);
		
	}
	public void delete() {
		System.out.print("삭제하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int index = search(name);		
		if(index == -1) {
			System.out.println("학생정보를 찾을 수 없습니다");
			return;
		}
		
		SingletonClass sc = SingletonClass.getInstance();
		sc.list.remove(index);
		
		System.out.println("삭제되었습니다");
	}
	public void select() {
		System.out.print("검색하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		List<StudentDto> findList = new ArrayList<StudentDto>();
		
		SingletonClass sc = SingletonClass.getInstance();
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto s = sc.list.get(i);
			if(name.equals(s.getName())) {
				findList.add(s);
			}
		}
		
		if(findList.size() < 1) {
			System.out.println("학생정보를 찾을 수 없습니다");
			return;
		}
		
		System.out.println("검색하신 정보는 다음과 같습니다");
		for (StudentDto s : findList) {
			s.print();			
		}		
	}
	public void update() {
		System.out.print("수정하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int index = search(name);		
		if(index == -1) {
			System.out.println("학생정보를 찾을 수 없습니다");
			return;
		}
		
		System.out.println("수정할 데이터를 찾았습니다");		
		System.out.print("국어 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 >> ");
		int math = sc.nextInt();
		
		SingletonClass sc = SingletonClass.getInstance();
		StudentDto dto = sc.list.get(index);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMath(math);
		
		System.out.println("수정되었습니다");		
	}
	
	public int search(String name) {
		int index = -1;
		
		SingletonClass sc = SingletonClass.getInstance();
		
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto dto = sc.list.get(i);
			if(name.equals(dto.getName())) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public void allData() {
		SingletonClass sc = SingletonClass.getInstance();
		
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto s = sc.list.get(i);
			s.print();			
		}
	}	
}














