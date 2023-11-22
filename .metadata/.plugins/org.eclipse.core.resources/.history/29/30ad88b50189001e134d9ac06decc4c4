package dao;

import java.util.Scanner;

import dto.StudentDto;

// Data Access Object : 데이터를 취급하는 클래스
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	// 학생 데이터 관리 배열
	private StudentDto student[];
	
	private int count;
	
	// 추가, 삭제, 검색, 수정 (CRUD)
	public StudentDao() {
		count = 0;
		
		student = new StudentDto[10];	// 변수만 생성
		// StudentDto student1, student2, student3, ...;
				
		// dto를 생성
//		for (int i = 0; i < student.length; i++) {
//			student[i] = new StudentDto();
//		}
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
		
		student[count] = new StudentDto(name, age, height, address, kor, eng, math);		
		count++;	// 배열의 다음으로 이동
	}
	public void delete() {
		
	}
	public void select() {
		
	}
	public void update() {
		
	}
	
	public void allData() {
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null) {
				System.out.println(dto.toString());
			}
		}
	}
	
	
}





