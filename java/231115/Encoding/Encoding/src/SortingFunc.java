import java.util.Scanner;

public class SortingFunc {
	public static void main(String[] args) {
		// Sorting		
		
		// 선언부
		int number[] = null;
		boolean updown[] = new boolean[1]; 
		
		// 입력
		number = input(updown);
		/*
		// 	몇개를 정렬?
		System.out.print("정렬할 수의 갯수 = ");
		int count = sc.nextInt();
		
		number = new int[count];		
		// 	숫자들을 입력
		for(int i = 0;i < number.length; i++) {
			System.out.print((i + 1) + "번째 = ");
			number[i] = sc.nextInt();
		}
		
		//	오름/내림
		System.out.print("오름(1)/내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)		updown = true;
		else			updown = false;
		*/
		
		
		// 정렬처리
		sorting(number, updown[0]);
		/*
		//	오름/내림
		int temp = 0;
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1;j < number.length; j++ ) {
				if(updown) {	// 오름
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}else {			// 내림
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}					
				}				
			}			
		}
		*/
				
		// 결과출력
		print(number, updown[0]);
		/*
		String message = "";
		if(updown)	message = "오름차순 정렬입니다";
		else		message = "내림차순 정렬입니다";		
		System.out.println(message);
		
		for(int i = 0;i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		*/
	}
	
	static int[] input(boolean updown[]) {
		
		Scanner sc = new Scanner(System.in);
		//	몇개를 정렬?
		System.out.print("정렬할 수의 갯수 = ");
		int count = sc.nextInt();
		
		int number[] = new int[count];		
		// 	숫자들을 입력
		for(int i = 0;i < number.length; i++) {
			System.out.print((i + 1) + "번째 = ");
			number[i] = sc.nextInt();
		}
		
		//	오름/내림
		System.out.print("오름(1)/내림(2) = ");
		int ud = sc.nextInt();
		if(ud == 1)		updown[0] = true;
		else			updown[0] = false;
		
		return number;
	}
	
	static void sorting(int number[], boolean updown) {
		//	오름/내림
		int temp = 0;
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1;j < number.length; j++ ) {
				if(updown) {	// 오름
					if(number[i] > number[j]) {
						swap(number, i, j);
//						temp = number[i];
//						number[i] = number[j];
//						number[j] = temp;
					}
				}else {			// 내림
					if(number[i] < number[j]) {
						swap(number, i, j);
//						temp = number[i];
//						number[i] = number[j];
//						number[j] = temp;
					}					
				}				
			}			
		}
	}
	
	static void swap(int number[], int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
	static void print(int number[], boolean updown) {
		String message = "";
		if(updown)	message = "오름차순 정렬입니다";
		else		message = "내림차순 정렬입니다";		
		System.out.println(message);
		
		for(int i = 0;i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
	
	
}






