import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		/*
			Sorting : 	정렬
						숫자의 크기에 따라서 순번대로 배치하는 처리.
						오름차순(큰값이 뒤로), 내림차순(작은 값이 뒤로)
						입사순위				연봉순위
						
						선택, 버블, 합병, 퀵						
		*/
		
		/*
		int number[] = { 2, 4, 3, 5, 1 };
		int temp;	// swap용 변수
		
		for(int i = 0;i < number.length - 1; i++) {	// 0 ~ 3
			
			for(int j = i + 1;j < number.length; j++) {	// 1 ~ 4, 2 ~ 4, 3 ~ 4, 4
				
				if(number[i] > number[j]) {	// 오름	1 2 3 4 5
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}				
			}
		}
		
//		for(int i = 0;i < number.length; i++) {
//			System.out.println(number[i] + " ");
//		}
		
		System.out.println(Arrays.toString(number));
		*/
		
		
		/*
		// 두 배열의 데이터를 교환하는 경우
		int myArray[] = { 1, 2, 3, 4, 5 };
		int youArray[] = { 3, 6, 9, 12, 15 };
	//	int temp;
		
		
//		for(int i = 0;i < myArray.length; i++) {			
//			temp = myArray[i];
//			myArray[i] = youArray[i];
//			youArray[i] = temp;
//		}
		
			
		int mArr[] = myArray;
		int yArr[] = youArray;
		
		System.out.println(Arrays.toString(mArr));
		System.out.println(Arrays.toString(yArr));
		
		int temp[] = mArr;
		mArr = yArr;
		yArr = temp;
		
		System.out.println(Arrays.toString(mArr));
		System.out.println(Arrays.toString(yArr));
		*/
		
		
		// Sorting
		Scanner sc = new Scanner(System.in);
		
		// 선언부
		int number[] = null;
		boolean updown = true; 
		
		// 입력
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
		
		
		
		// 정렬처리
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
				
		// 결과출력
		String message = "";
		if(updown)	message = "오름차순 정렬입니다";
		else		message = "내림차순 정렬입니다";		
		System.out.println(message);
		
		for(int i = 0;i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		
		
	}
}






