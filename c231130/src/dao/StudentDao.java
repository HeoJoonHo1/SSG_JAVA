package dao;

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
		
	}
	public void select() {
		
	}
	public void update() {
		
	}
	
	public void allData() {
		SingletonClass sc = SingletonClass.getInstance();
		
		for (int i = 0; i < sc.list.size(); i++) {
			StudentDto s = sc.list.get(i);
			s.print();			
		}
	}	
}














