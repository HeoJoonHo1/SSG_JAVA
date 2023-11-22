
public class Exception {

	public static void main(String[] args) {
		/*
			Exception : 예외(처리) != 에러
			
			calculator -> 숫자입력 0 ~ 9 -> 'A' == 65
			
			number -> format 
			array -> int array[] = new int[5]
						 0 ~ 4
					array[0] = 1;
					array[5] = 5;			-> 예외
			class -> Scanner 못찾는 경우		-> 예외
			file  -> file 이 없는 경우 		-> 예외
			
			try{
			
				예외1가 나올 수 있는 소스코드
				
				예외2가 나올 수 있는 소스코드
			
			}catch(예외1클래스 e){
				예외1가 나온 경우
			}catch(예외2클래스 e){
				예외2가 나온 경우
			}finally{	// 생략이 가능
				무조건 실행!!
				반드시 해야 될 뒷처리
				(파일 close, database close)
			}
						
			void function() throws 예외클래스 {
				예외가 나올 수 있는 코드
			}			
		*/
		
		int array[] = { 1, 2, 3 };
		
		System.out.println("프로그램 시작");
		
		try {
			
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 초과");
		//	e.printStackTrace();
		//	System.out.println(e.getMessage());
			
			return;
		}catch(NumberFormatException e) {
			System.out.println("형식이 다른 예외");
		}finally {			
			System.out.println("finally 실행");
		}
		
		System.out.println("프로그램 끝");
		
	}

}




