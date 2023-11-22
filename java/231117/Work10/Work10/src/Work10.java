import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Work10 {
	public static void main(String[] args)/* throws Exception */ {
		
		/*
		Scanner sc = new Scanner(System.in);
				
		// 파일명을 입력
		System.out.print("저장할 파일명 >> ");
		String filename = sc.next();
		
		// 파일 생성
		File file = new File("c:\\tmp\\" + filename + ".txt");
				
		try {
			if(file.createNewFile()) {
				System.out.println(filename + ".txt 파일이 생성되었습니다");
			}else {
				System.out.println(filename + ".txt 파일이 존재합니다");
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		// 3명의 학생 이름을 입력
		String studentName[] = new String[3];
		
		for (int i = 0; i < studentName.length; i++) {
			System.out.print((i + 1) + "번째 학생명 >> ");
			studentName[i] = sc.next();
		}		
		
		// 파일에 쓰기(save)를 한다
		try {
//			FileWriter fw = new FileWriter(file);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw);
			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for (int i = 0; i < studentName.length; i++) {
				pw.println(studentName[i]);
			}
			
			pw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		///////////////////////////////////
		
		File f = new File("c:\\tmp\\" + filename + ".txt");		
		
		// 파일로부터 데이터를 읽는다(load)
		String humanName[] = new String[3];
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			int count = 0;
			while((str = br.readLine()) != null) {
				humanName[count] = str;
				count++;
			}			 
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		// 콘솔출력
		for (int i = 0; i < humanName.length; i++) {
			System.out.println("humanName[" + i + "] = " + humanName[i]);
		}
						
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		// 파일명을 입력
		System.out.print("저장할 파일명 >> ");
		String filename = sc.next();
		
		// 파일 생성
		File f = createFile(filename);
		
		// 3명의 학생 이름을 입력
		String studentName[] = new String[3];		
		for (int i = 0; i < studentName.length; i++) {
			System.out.print((i + 1) + "번째 학생명 >> ");
			studentName[i] = sc.next();
		}
		
		// 파일에 쓰기(save)를 한다
		saveFile(f, studentName);
		
		// 파일로부터 데이터를 읽는다(load)
		String humanName[] = loadFile(f);
		
		// 콘솔출력
		System.out.println(Arrays.toString(humanName));
		
	}
	
	static File createFile(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println(filename + ".txt 파일이 생성되었습니다");
			}else {
				System.out.println(filename + ".txt 파일이 존재합니다");
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return file;
	}
	
	static void saveFile(File f, String name[]) {
		try {			
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			
			for (int i = 0; i < name.length; i++) {
				pw.println(name[i]);
			}
			
			pw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	static String[] loadFile(File f) {
		String humanName[] = new String[3];
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			int count = 0;
			while((str = br.readLine()) != null) {
				humanName[count] = str;
				count++;
			}			 
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return humanName;
	}
	
	
}








