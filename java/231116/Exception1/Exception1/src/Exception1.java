import java.io.BufferedReader;

public class Exception1 {
	public static void main(String[] args) {
		/*
			Exception : 예외처리
			
			원하지 않는 값이 설정되었을 경우
			0 ~ 9 -> 'a' 
			
			특정 (class, file)이 없는 경우
		*/
		
		int array[] = { 1, 2, 3, 4, 5 };
		
		System.out.println("프로그램 시작");
		
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");			
		//	return;
		}catch(NumberFormatException e) {
			System.out.println("숫자 입력이 안됨");
		}finally {
			System.out.println("반드시 실행!");
		}
		
		System.out.println("프로그램 끝");
		
		try {
			function();
		}catch(Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException!!!");
		}
				
	}
	
	static void function()throws ArrayIndexOutOfBoundsException {
		int array[] = { 1, 2, 3 };
		
	//	try {
			for(int i = 0;i < 4; i++) {
				System.out.println(array[i]);
			}	
	//	}catch(ArrayIndexOutOfBoundsException e) {
	//		System.out.println("function() 배열 범위초과");
	//	}
	}
	
	
	
}




