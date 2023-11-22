
public class Switch {
	public static void main(String[] args) {
		/*
			switch:
				조건문에 해당된다
				값이 명확해야 한다(범위는 설정할 수 없다)
				소수값은 사용 불가
				
			형식:
				 switch ( 변수 ){
				 	case 값1:		변수 == 값1
				 		처리1				 	
				 		break;
				 	case 값2:		변수 == 값2
				 		처리2				 	
				 		break;
				 	case 값n:		변수 == 값n
				 		처리n				 	
				 		break;
				 		:
				 	default:		== else	 생략이 가능
				 		위의 처리가 되지 않은 경우
				 		break;	
				 }
		*/
		
		int number = 2;
		
		switch(number) {
			case 1:		// if(number == 1)
				System.out.println("number는 1입니다");
				break;
			case 2:		// if(number == 2)
				System.out.println("number는 2입니다");				
				break;	
			case 3:
				System.out.println("number는 3입니다");
				break;
			default:
				System.out.println("number는 ?입니다");
				break;
		}
		
		// < > <= !
		/*
		char c = '가';
		switch( c ) {
			case '가'> c:
			case !'가':
				break;				
		}
		*/
		
		// 소수
		/*
		double d = 123.1;
		switch( d ) {
			case 123.1:
				break;
		}
		*/
		
		String str = "ABC";
		switch(str) {
			case "ABC":
				System.out.println("str은 ABC입니다");	
				break;
		}
		
		
		
	}
}







