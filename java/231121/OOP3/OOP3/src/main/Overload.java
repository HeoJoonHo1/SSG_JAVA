package main;

public class Overload {
	public static void main(String[] args) {
		/*
			Over load : 함수(메소드)명은 같고
			 			매개변수(인수, 인자)의 자료형이나
			 			매개변수의 갯수가 다른 것을 의미한다.
			 			
			imageDraw(int x, int y)
			imageDraw(int x, int y, int a) -> 0.0 ~ 1.0 
		*/
		
		func();
		
		func('A');
		
		func(333);
		
		func(1.23, "hello");	
		
		func("world", 2.34);
		
		
		int num1 = Integer.parseInt("123");
		int num2 = Integer.parseInt("1010", 2);
		
	}
	
	static void func() {
		System.out.println("func() 호출");
	}
	
//	static int func() {		return value가 다른 것은 overload 가 아니다	
//	}
	
	static void func(char c) {
		System.out.println("func(char c) 호출");
	}
	
//	static void func(char a) {	가인수가 다른 것은 적용 안됨		
//	}
	
	static void func(int i) {
		System.out.println("func(int i) 호출");
	}
	
	static void func(double d, String str) {
		System.out.println("func(double d, String str) 호출");
	}
	
	static void func(String str, double d) {
		System.out.println("func(String str, double d) 호출");
	}
	
}







