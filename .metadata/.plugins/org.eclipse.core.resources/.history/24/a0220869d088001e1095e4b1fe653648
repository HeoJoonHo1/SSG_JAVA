import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		int number;
		
		number = 5;
		/*
		  	0000 0101  -> 5
				 8421
			
			0000 1010  -> 10 	
				 8421
			
			0001 0100 -> 20
			0010 1000 -> 40
			0101 0000 -> 80			
		*/
		number = number << 4;
		System.out.println(number);
		
		number = number >> 3;
		System.out.println(number);
		
		number = number << 1;
		System.out.println(number);
		
		
		byte num1, num2;
		num1 = 127;
		num2 = 56;
		
		/*
			0111 1111	<- 127
			8421 8421
			0011 1000   <- 56
						
			0111 1111
			0011 1000
			0011 1000 -> num1
			
			0111 1111
			0011 1000
			
			0100 0111
			1011 1000
			
			8421 8421
						
			0100 0111
			0x47
			
			 111 1111
			  11 1000
		*/
		
		num1 = (byte)((num1 & num2)|(num1 & num2));
		System.out.println(num1);
		
		// 10진수 -> 2진수
		String n2 = Integer.toBinaryString(num1);
		System.out.println(n2);
		
		String n2_1 = Integer.toBinaryString(num2);
		System.out.println(n2_1);
		
		num2 = (byte)~(num1 ^ num2);
		System.out.println(num2);
		System.out.printf("%x\n", num2);	
		
		
	//	하나의 수를 입력 받고 삼항 연산자를 사용하여 양수인지 음수인지 판단하라.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("number = ");
//		number = sc.nextInt();
//		
//		String message = (number > 0)?"양수입니다":"음수입니다";
//		System.out.println("message:" + message);
		
		
		// 범위: 0 ~ 99 개수: 1개
		int r1 = (int)(Math.random() * 100);
		System.out.println(r1);
		
		// 범위: 11, 12, 13, 14, 15 개수: 1개
		int r2 = (int)(Math.random() * 5) + 11;
		System.out.println(r2);
		
		// 범위: 1 ~ 45 개수: 6개
		int numArr[] = new int[6];
		
		numArr[0] = (int)(Math.random() * 45) + 1;
		numArr[1] = (int)(Math.random() * 45) + 1;
		numArr[2] = (int)(Math.random() * 45) + 1;
		numArr[3] = (int)(Math.random() * 45) + 1;
		numArr[4] = (int)(Math.random() * 45) + 1;
		numArr[5] = (int)(Math.random() * 45) + 1;
		
		for(int i = 0;i < 6; i++) {
			System.out.print(numArr[i] + " ");
		}
	}
}





