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

public class Work11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String human[][] = {
				{ "홍길동", "24", "서울시" },		// 홍길동-24-서울시
				{ "성춘향", "16", "남원시" },
				{ "일지매", "22", "부산시" },
		};		
		
		// token을 포함해서 데이터를 편집한다.
		String data[] = new String[human.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = human[i][0] + "-" + human[i][1] + "-" + human[i][2];
		}
		
		System.out.println(Arrays.toString(data));
		
		File file = new File("c:\\tmp\\human.txt");
		
		// 데이터 저장(쓰기)
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
			for (int i = 0; i < data.length; i++) {
				pw.println(data[i]);				
			}			
			pw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		// 데이터 불러오기(읽기)
		String student[][] = new String[3][3];
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";	
			int count = 0;
			while((str = br.readLine()) != null) {				
				System.out.println(count + ": " + str);
				
				String array[] = str.split("-");
				System.out.println("array[0]: " + array[0]);
				System.out.println("array[1]: " + array[1]);
				System.out.println("array[2]: " + array[2]);
				
				student[count][0] = array[0];
				student[count][1] = array[1];
				student[count][2] = array[2];
				count++;
			}	
			br.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}	
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}		
		
		// 나이의 합계
		int ageSum = 0;
		for (int i = 0; i < student.length; i++) {
			ageSum = ageSum + Integer.parseInt(student[i][1]);
		}
		
		System.out.println("나이의 총합:" + ageSum);
		
	}
}




