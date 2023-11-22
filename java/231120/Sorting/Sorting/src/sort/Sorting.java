package sort;

import java.util.Scanner;

public class Sorting {
	
	private int number[];
	private boolean updown;

	// 입력	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
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
	}
	
	// 정렬
	public void sorting() {
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1;j < number.length; j++ ) {
				if(updown) {	// 오름
					if(number[i] > number[j]) {
						swap(i, j);
					}
				}else {			// 내림
					if(number[i] < number[j]) {
						swap(i, j);
					}					
				}				
			}			
		}
	}
	
	// 교환
	private void swap(int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
	// 출력
	public void print() {
		String message = "";
		if(updown)	message = "오름차순 정렬입니다";
		else		message = "내림차순 정렬입니다";		
		System.out.println(message);
		
		for(int i = 0;i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
	
}
