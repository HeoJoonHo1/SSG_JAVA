package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {

		// 학생 성적관리 프로그램 -> 가계부, 주소록
		/*
			과목: 국어, 영어, 수학	<- column(항목)
			이름, 나이, 키, 주소
			
			2차원 배열 -> 10개
			
			메뉴:		Data Access Object(DAO) CRUD
				1.학생정보(추가)입력		insert	create
				2.학생정보삭제 			delete	delete	
				3.학생정보검색				select	read
				4.학생정보수정				update	update
				
				5.파일저장
				6.파일불러오기
		*/
		Scanner sc = new Scanner(System.in);
		
		String student[][] = new String[10][7];
		
//		String student[][] = {
//				{ "홍길동", "24", "172.1", "부산시", "100", "90", "80" },
//				{ "성춘향", "16", "157.4", "남원시", "95", "95", "100" },
//				{ "일지매", "22", "181.8", "강릉시", "90", "80", "75" },				
//		};		
		
		int count = 0;
		
		while(true) {
			System.out.println("========= 학생정보 프로그램 ==========");
			System.out.println("1.학생정보추가");
			System.out.println("2.학생정보삭제");	
			System.out.println("3.학생정보검색");
			System.out.println("4.학생정보수정");
			System.out.println("5.학생정보저장");
			System.out.println("6.학생정보불러오기");
			
			System.out.print("메뉴의 번호 >> ");
			int menuNumber = sc.nextInt();
			
			switch(menuNumber) {
				case 1:
					count = insert(student, count);
					allData(student);
					break;
				case 2:
					delete(student);
					allData(student);
					break;
				case 3:
					select(student);
					break;
				case 4:
					update(student);
					allData(student);
					break;
				case 5:
					save(student);
					break;
				case 6:
					student = load();					
					allData(student);
					break;
			}			
		}	
	}
	
	static int insert(String student[][], int count) {
		Scanner sc = new Scanner(System.in);
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
		int lang = sc.nextInt();
		
		System.out.print("영어 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 >> ");
		int math = sc.nextInt();
		
		student[count][0] = name;
		student[count][1] = age + "";
		student[count][2] = height + "";
		student[count][3] = address;
		student[count][4] = lang + "";
		student[count][5] = eng + "";
		student[count][6] = math + "";
		
		count++;
		
		return count;
	}
	static void delete(String student[][]) {	// 삭제
		Scanner sc = new Scanner(System.in);
		// 이름입력
		System.out.print("삭제하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		// 검색
		int findIndex = search(name, student);
//		int findIndex = -1;
//		for (int i = 0; i < student.length; i++) {
//			if(name.equals(student[i][0])) { // 찾았다
//				findIndex = i;
//				break;
//			}
//		}
		
		
		if(findIndex != -1) {	// 찾았음
			student[findIndex][0] = "";
			student[findIndex][1] = "0";
			student[findIndex][2] = "0.0";
			student[findIndex][3] = "";
			student[findIndex][4] = "0";
			student[findIndex][5] = "0";
			student[findIndex][6] = "0";
			
			System.out.println("정상적으로 삭제되었습니다");
		}else {
			System.out.println("학생명단에 없습니다");
		}		
		
		// name = ""	<- string
		// age = 0		<- int
	}
	static void select(String student[][]) {	// 검색
		Scanner sc = new Scanner(System.in);
		// 이름입력
		System.out.print("검색하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name, student);
		
		if(findIndex != -1) {
			System.out.println("데이터를 찾았습니다");
			System.out.println("이름:" + student[findIndex][0]);
			System.out.println("나이:" + student[findIndex][1]);
			System.out.println("키:" + student[findIndex][2]);
			System.out.println("주소:" + student[findIndex][3]);
			System.out.println("국어:" + student[findIndex][4]);
			System.out.println("영어:" + student[findIndex][5]);
			System.out.println("수학:" + student[findIndex][6]);			
		}else {
			System.out.println("학생명단에 없습니다");
		}		
	}
	static void update(String student[][]) {	// 수정
		Scanner sc = new Scanner(System.in);
		// 이름입력
		System.out.print("수정하고 싶은 학생의 이름 >> ");
		String name = sc.next();
		
		int findIndex = search(name, student);
		 
		if(findIndex == -1) {
			System.out.println("학생명단에 없습니다");
			return;
		}
		
		// 국어, 영어, 수학 점수 수정
		System.out.println("수정할 데이터를 찾았습니다");
		
		System.out.print("국어 >> ");
		String lang = sc.next();
		
		System.out.print("영어 >> ");
		String eng = sc.next();
		
		System.out.print("수학 >> ");
		String math = sc.next();
		
		student[findIndex][4] = lang;
		student[findIndex][5] = eng;
		student[findIndex][6] = math;
		
		System.out.println("수정을 완료했습니다");
	}
	
	static int search(String name, String student[][]) {
		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			if(name.equals(student[i][0])) { // 찾았다
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}
	
	// 모두 출력으로 확인
	static void allData(String student[][]) {
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				if(student[i][j] != null) {
					System.out.print(student[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	static void save(String student[][]) {
		File f = new File("c:\\tmp\\student.txt");
		
		String strLine[] = new String[student.length];
		
		for (int i = 0; i < student.length; i++) {
			if(student[i][0] != null && !student[i][0].equals("")) {
				strLine[i] = student[i][0] + "-" 
							+ student[i][1] + "-"
							+ student[i][2] + "-"
							+ student[i][3] + "-"
							+ student[i][4] + "-"
							+ student[i][5] + "-"
							+ student[i][6];
			}else {
				strLine[i] = "";
			}
		}		
		
//		for (String s : strLine) {
//			System.out.println(s);
//		}
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			
			for (String s : strLine) {
				if(s != null && !s.equals("")) {
					pw.println(s);
				}
			}
			
			pw.close();			
		} catch (IOException e) {			
			System.out.println("파일에 저장되지 않았습니다");
			return;
		}		
		
		System.out.println("정상적으로 저장되었습니다");
	}
	
	static String[][] load(){
		File f = new File("c:\\tmp\\student.txt");
		
		String student[][] = new String[10][7];		
		
		try {			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String str = "";
			int count = 0;			
			while((str = br.readLine()) != null) {
				String data[] = str.split("-");				
				student[count][0] = data[0];	// 이름
				student[count][1] = data[1];	// 나이
				student[count][2] = data[2];	// 키
				student[count][3] = data[3];	// 주소
				student[count][4] = data[4];	// 국어
				student[count][5] = data[5];	// 영어
				student[count][6] = data[6];	// 수학
				
				count++;				
			}			
			br.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
		return student;
	}

}







