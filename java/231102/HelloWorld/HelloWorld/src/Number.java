
public class Number {
	public static void main(String[] args) {
		/*
			숫자(상수) : 정해진 숫자. 12, 45, ...
				2진수 : 0, 1
				8진수 : 0 ~ 7  -> 8 == 10 => 010
				10진수 : 0 ~ 9
				16진수 : 0 ~ 9 A B C D E F(15) -> 0xf => 255 => 0xff
				
				2진수 -> 16진수			
				1010 1100
				8421 8421
				A 	 C  -> 0xAC
				
				16진수 -> 2진수
				F    3
				1111 0011				
							
			변수(variable) : 변경되는 수.
				별명을 작명해서 그 이름에 값을 넣는다.
				그릇(크기, 자료형)
				변수이 작명은 선택
				
			자료형 변수명;   <- 변수선언
			변수명 = 값;	  <- 대입		
			
			int number;
			number = 135;	
		*/
		
		System.out.println(010);
		System.out.println(0xac);
		
		int number;
		number = 123;
		System.out.println(number);
		
		int num = 234;
		System.out.println(num);
		
		number = num;
		System.out.println(number);
		
		
		// 변수의 작명(규칙)
		int a;		// integer(정수)
		int A;
		
		// 예약어
	//	int int;
	//	int 2aa;   맨앞의 숫자는 안됨
		int aa2;
		
	//	int 123;   상수만으로 이루어진 변수는 사용못함
		
		int _abc;
	//	int -abc;	// + - * /  연산자는 안됨
		
		int number_position_char;
		int numPosChar;  // 낙타형 -> 많이 사용
		int numposchar;
		
		int 마징가;
		마징가 = 2022;
		System.out.println(마징가);
		
		int iCharPos;
		iCharPos = 마징가;
		System.out.println(iCharPos);
		
		// 흔한 변수명은 피하는 것이 좋다
		// object, length, number, size
		
	}
}



