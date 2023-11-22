import java.util.Arrays;

public class Function1 {
	
	public static void main(String[] args) {
		/*
			function : 	함수
						처리자(processor)
			목적 :
				코드를 간략화
				동일한 처리 코드를 집약적으로 설정
				
			형식 :				매개변수(parameter), 인수, 인자
				자료형 함수명( 자료형 가상인수, 자료형 가상인수, ... ){
					
					처리(함수 내부)
					
					return 값;	<- 자료형				
				}
				
				return 값이 없는 경우: void
				int float, double, String			

		*/	

	//	function();
		
		
	// 	functionOne(123);	// 123 == 실(제)인수 == argument
		
		
	//	functionTwo("안녕하세요", 123.456);
		
		
	//	double d1 = functionThree();
	//	System.out.println("functionThree 에서 return값으로 받은 값:" + d1);		
	//	double r = Math.random();
		
		
//		int re = functionFour('A'); 
//		System.out.println("functionFour 에서 받은 return 값:" + re);
		
		
//		int array[] = { 1, 2, 3 };		
//		int arr[] = functionFive(array);
//		System.out.println(Arrays.toString(arr));
		
		
		// value의 의한 할당
//		int number = 1;
//		functionValue(number);
//		System.out.println("number = " + number);
		
		// address의 의한 할당
	//	int numarr[] = { 1 };
	//	functionAddress(numarr);
	//	System.out.println("numarr[0] = " + numarr[0]);
		
		
		char arrChar[] = { 'h', 'e', 'l', 'l', 'o' };
		
		UpperChar(arrChar);
		System.out.println(Arrays.toString(arrChar));
		
		String str = "abc";
		str = str.toUpperCase();
		System.out.println(str);
	}
	
	static void function() {
		System.out.println("function() 호출");
	}
	
	static void functionOne(int n) {	// n 가(상)인수 == parameter 값
		System.out.println("functionOne(int n) 호출");
		System.out.println("외부에서 매개변수를 통해서 전달된 값:" + n);
	}
	
	static void functionTwo(String str, double d) {
		System.out.println("functionTwo(String str, double d) 호출");
		System.out.println("str:" + str);
		System.out.println("d:" + d);
	}
	
	static double functionThree() {
		System.out.println("functionThree() 호출");		
		return 234.567;
	}
	
	static int functionFour(char c) {
		System.out.println("functionFour(char c) 호출");
		System.out.println("c = " + c);		
		return 333;
	}
	
	static int[] functionFive(int arr[]) {
		System.out.println("functionFive(int arr[]) 호출");
		
		for(int i = 0;i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}		
		return arr;
	}
	
	static void functionValue(int num) {
		System.out.println("functionValue(int num) 호출");
		num = 2;	
		System.out.println("함수안 number:" + num);
	}
	static void functionAddress(int num[]) {
		System.out.println("functionAddress(int num[]) 호출");
		num[0] = 2;
		System.out.println("함수안 numarr:" + num[0]);
	}
	
	static void UpperChar(char arrChar[]) {
		for(int i = 0;i < arrChar.length; i++ ) {
			int asc = (int)arrChar[i];
			asc = asc - 32;
			arrChar[i] = (char)asc;
		}		
	}
	
}







