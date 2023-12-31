import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		/*
			10진수 -> 2진수
			2진수 -> 10진수
			10진수 -> 16진수
			16진수 -> 10진수
			2진수 -> 16진수
			16진수 -> 2진수			
		*/
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("다음 중 원하는 변환의 번호를 입력해 주십시오.");
			System.out.println("1. 10진수를 2진수로 변환");
			System.out.println("2. 2진수를 10진수로 변환");
			System.out.println("3. 10진수를 16진수로 변환");
			System.out.println("4. 16진수를 10진수로 변환");
			System.out.println("5. 2진수를 16진수로 변환");
			System.out.println("6. 16진수를 2진수로 변환");
			
			System.out.print("원하는 변환 번호 >> ");
			int work = sc.nextInt();
			
			switch(work) {
				case 1:
				{
					System.out.print("10진수 = ");
					int num10 = sc.nextInt();					
					String num2 = Integer.toBinaryString(num10);					
					System.out.println("10진수 " +  num10 + " 은 2진수 " + num2 + " 입니다");
				}
					break;
				case 2:		
				{
					System.out.print("2진수 = ");
					String num2 = sc.next();
					int num10 = Integer.parseInt(num2, 2);
					System.out.println("2진수 " +  num2 + " 은 10진수 " + num10 + " 입니다");
				}	
					break;	
				case 3:
				{
					System.out.print("10진수 = ");
					int num10 = sc.nextInt();					
					String num16 = Integer.toHexString(num10);					
					System.out.println("10진수 " +  num10 + " 은 16진수 0x" + num16 + " 입니다");
				}
					break;
				case 4:
				{
					System.out.print("16진수 = ");
					String num16 = sc.next();
					int num10 = Integer.parseInt(num16, 16);
					System.out.println("16진수 " +  num16 + " 은 10진수 " + num10 + " 입니다");
				}
					break;	
				case 5:
				{
					System.out.print("2진수 = ");
					String num2 = sc.next();
					int num10 = Integer.parseInt(num2, 2);
					String num16 = Integer.toHexString(num10);					
					System.out.println("2진수 " +  num2 + " 은 16진수 0x" + num16 + " 입니다");
				}
					break;
				case 6:
				{
					System.out.print("16진수 = ");
					String num16 = sc.next();
					int num10 = Integer.parseInt(num16, 16);
					String num2 = Integer.toBinaryString(num10);
					System.out.println("16진수 " +  num16 + " 은 2진수 " + num2 + " 입니다");
				}
					break;					
			}	
			
			System.out.println();		
		}
	}
}






