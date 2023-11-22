import java.util.Scanner;

public class Work5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 소문자를 대문자로 변경해서 출력하고
		// 대문자면 소문자로 출력하는 코드를 작성하라
		
		System.out.print("문자입력 >> ");
		String str = sc.next();
		
		char c = str.charAt(0);
	//	System.out.println("c:" + c);
		
		// 대문자/소문자의 판정
		int char_num = (int)c;
	//	System.out.println("char_num:" + char_num);
		
		int upper = 0;
		if(char_num >= 65 && char_num <= 90) {
			upper = 1;
		}
		else if(char_num >= 97 && char_num <= 122) {
			upper = 2;
		}
		else {
			upper = 3;
		}
		
		// 문자의 처리
		switch(upper){
			case 1:	// 대문자 -> 소문자
				char_num = char_num + 32;
				System.out.println((char)char_num);
				break;
			case 2: // 소문자 -> 대문자
				char_num = char_num - 32;
				System.out.println((char)char_num);
				break;
			default:
				System.out.println("영문자가 아닙니다");
		}

		
		// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;		
		for(int i = 1;i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("합계:" + sum);
		
		
		// 피보나치수열의 100번째 수는 무엇인지 계산하는 프로그램
		// 0 1 1 2 3 5 8 13 21 34 ...
		// a b cc
		//   a b cc
		//     a b cc
		long a, b, cc;
		long array[] = new long[20];
		
		a = 0;
		b = 1;
		
		array[0] = a;
		array[1] = b;
		
		int w = 0;
		
		while(w < 18) {
			
			cc = a + b;
			array[2 + w] = cc;			
			
			a = b;
			b = cc;
			
			w++;
		}
		System.out.println(array[19]);
		
	}
}











