import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {
		
		// TODO:1 ~ 1000 사이에 수를 전부 합친 값을 출력하라.
		int count = 1;
		int sum = 0;
		for(int i = 0;i < 1000; i++) {
			sum = sum + count;
			count++;
		}
		
		System.out.println("총합:" + sum);
		
		
		// TODO:1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라
		int sum1, sum2;
		sum1 = sum2 = 0;
//		for(int i = 1;i <= 100; i++) {
//			if(i % 2 == 0) {
//				sum2 = sum2 + i;
//			}else {
//				sum1 = sum1 + i;
//			}			
//		}
		
		for(int i = 1;i <= 100; i=i+2) {
			sum1 = sum1 + i;						
		}
		for(int i = 0;i <= 100; i=i+2) {
			sum2 = sum2 + i;						
		}
		
		System.out.println("홀수의 합:" + sum1);
		System.out.println("짝수의 합:" + sum2);
		
		/*
		 	TODO:하나의 수를 입력받고 10의 배수로 입력 받은 수는 어느 범위에 있는지 출력되는
			프로그램을 작성하라. 
		 */
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자입력 >> ");
//		int number = sc.nextInt();
		/*
		if(number > 0 && number <= 10) {
			System.out.println("number는 0보다 크고 10보다 작거나 같은 범위에 있습니다");
		}
		else if(number > 10 && number <= 20) {
			System.out.println("number는 10보다 크고 20보다 작거나 같은 범위에 있습니다");
		}
		else if(number > 20 && number <= 30) {
			System.out.println("number는 20보다 크고 30보다 작거나 같은 범위에 있습니다");
		}
		*/
		
//		int n = 0;
//		for(int i = 0;i < 30; i++) {
//			n = 10 * i;	// 0 10 20 30 40 ... 90
//			if(number > n && number <= (n + 10)) {
//				System.out.println("number는 " + n + "보다 크고 " + (n + 10) + "보다 작거나 같은 범위에 있습니다");
//			}
//		}
		
		
		// TODO:임의 수를 입력 받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라
//		System.out.print("출력할 구구단의 숫자입력 >> ");
//		int num99 = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.print(num99 + "x" + i + "=" + (num99 * i) + " ");
//		}
		
		
		// TODO:구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
//		for(int i = 1;i < 10; i++) {
//			
//			for(int j = 1;j < 10; j++) {
//				
//				System.out.print(i + "x" + j + "=" + (i*j) + "\t");				
//			}
//			System.out.println();
//		}
		System.out.println();
		
		/*
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*/
		
		for(int i = 0;i < 9; i++) {
			for(int j = 0;j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		int len = 0;
		for(int i = 0;i < 9; i++) {
			
			if(i < 5) 	len++;
			else 		len--;
			
			for(int j = 0;j < len; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
				
	}
}








