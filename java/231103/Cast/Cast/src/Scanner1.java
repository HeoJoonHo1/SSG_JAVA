import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;	// module

public class Scanner1 {
	public static void main(String[] args) throws IOException  {
		/*
			input -> console
			출력 -> System.out.println(변수 or 값(value))	
			
			입력 -> 변수
		*/
		// 출력
//		int number = 123;
//		System.out.println(number + " " + 224);
		
		Scanner sc = new Scanner(System.in);
		
		// boolean
//		boolean b;
//		System.out.print("b = ");
//		b = sc.nextBoolean();	// true/false
//		System.out.println("b:" + b);
		
		// int
//		int age;
//		System.out.print("당신의 나이 = ");
//		age = sc.nextInt();
//		System.out.println("age:" + age);
		
		// double
//		double height;
//		System.out.print("당신의 키 = ");
//		height = sc.nextDouble();
//		System.out.println("height:" + height);
		
		// String
//		String name;
//		System.out.print("이름 = ");
//		name = sc.next();
//		System.out.println("name:" + name);	// ' ' == nul(빈)문자
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String address;
		System.out.print("주소 = ");
		address = br.readLine();
		System.out.println("address:" + address);
		
	}
}




