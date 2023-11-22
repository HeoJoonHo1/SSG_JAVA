
public class If {
	public static void main(String[] args) {
		/*
			조건문
			
			논리연산자: && || !
			
			부등호: > < >= <= == !=	
			
			형식:
				if( 조건(true/false) ) {
					처리
				}		
		*/
		
		int number = 1;
		
		if( number == 1 ) {
			System.out.println("number는 1입니다");
		}
		
		if( number > 0 && number < 10 && number != 5 ) {
			System.out.println("number는 0보다 크고 10보다 작다");
		}
		
		if( number < 5 || number > 10 ) {
			System.out.println("number는 5보다 작거나 10보다 크다");
		}
		
		if( true ) {
			System.out.println("무조건 실행!");
		}
		
		boolean b = true;
		
//		if( b == true ) {
//			System.out.println("b는 true입니다");
//		}
		if( b ) {
			System.out.println("b == true입니다");
		}
		
		b = false;
		
//		if(b == false) {
//			System.out.println("b는 false입니다");
//		}
		if( !b ) {
			System.out.println("b == false입니다");
		}
		
		String str = "";
		String msg = "hell";
		
		str = "hello";
		msg = msg + "o";
		
//		if(str == msg) {
//			System.out.println("같은 문자열입니다");
//		}
	//	boolean b1 = str.equals(msg);
		if( str.equals(msg) ) {
			System.out.println("같은 문자열입니다");
		}
		
		if( str.length() >= 5 ) {
			System.out.println("str은 5개의 문자입니다");
		}
		
		// str 이 빈문자열이 아닐 경우
//		if( str != "" ) {
//			System.out.println("str은 빈 문자열이 아닙니다");
//		}
		if( !str.equals("") ) {
			System.out.println("str은 빈 문자열이 아닙니다");
		}
		
		/*
			형식:
				if( 조건 ){
					처리1
				}
				else{
					처리2
				}		
		*/
		
		number = 5;
		
		if(number > 5) {
			System.out.println("number는 5보다 크다");
		}
		else {
			System.out.println("number는 5보다 작거나 같다");
		}
		
	//	String s = (number > 5) ? "number는 5보다 크다" : "number는 5보다 작거나 같다";
		System.out.println((number > 5) ? "number는 5보다 크다" : "number는 5보다 작거나 같다");
		
		number = 70;
		
		if(number == 100) {
			System.out.println("A+입니다");
		}
		else if(number >= 90) {
			System.out.println("A입니다");
		}
		else if(number >= 80) {
			System.out.println("B입니다");
		}
		else {
			System.out.println("C 또는 이하입니다");
		}
		
		number = 86;
		
		// 조건문 안의 조건문
		if( number >= 85 && number < 90 ) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		if( number >= 80 && number < 90 ) {
			if(number >= 85) {
				System.out.println("합격입니다");
			}
			else {
				System.out.println("불합격입니다");
			}			
		}
		
		
	}

}











