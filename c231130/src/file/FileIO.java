package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dto.StudentDto;
import singleton.SingletonClass;

public class FileIO {
		
	public static void save(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
			SingletonClass sc = SingletonClass.getInstance();
			
			for (int i = 0; i < sc.list.size(); i++) {
				StudentDto dto = sc.list.get(i);
				pw.println(dto.toString());
			}
			pw.close();	
			
			System.out.println("성공적으로 저장되었습니다");
			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
	
	public static void load(String filename) {
		File file = new File("c:\\tmp\\" + filename + ".txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
					
			SingletonClass sc = SingletonClass.getInstance();
			
			// 데이터 읽기
			String str = "";
			while((str = br.readLine()) != null) {
				String arr[] = str.split("-");
				
				StudentDto dto = new StudentDto(arr[0], 
												Integer.parseInt(arr[1]), 
												Double.parseDouble(arr[2]), 
												arr[3], 
												Integer.parseInt(arr[4]), 
												Integer.parseInt(arr[5]), 
												Integer.parseInt(arr[6]));				
				sc.list.add(dto);
			}
			br.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}	
}








