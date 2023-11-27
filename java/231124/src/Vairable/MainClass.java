package Vairable;

public class MainClass {
	public static void main(String[] args) {
		/*
			local variable : 지역변수 -> stack
			parameter variable : (지역변수) -> stack
			member variable : 멤버변수 -> heap
			
			static variable : global variable 정적변수 -> static
			static function
		*/
		
		int number = 1;		// local(지역, 자동) 변수	-> stack

		{
			int num;	// local 변수	-> stack	
		//	System.out.println(num);
		}
		
	//	MyClass cls = new MyClass();
		
	//	System.out.println( MyClass.counting );
		
	//	MyClass.staticMethod();
		
		MyClass cls = new MyClass();
		cls.func();
		cls.func();
		cls.func();
		
		MyClass cls1 = new MyClass();
		cls1.func();
		cls1.func();
	}
	
	public static void func() {
		String str = "hello";	// local 변수	-> stack
		
		System.out.println( MyClass.counting );
	}
	
	public static void method(int n) {	// parameter -> stack
		n = 1;
		
		System.out.println( MyClass.counting );
	}	
}

class MyClass{
	private String name;	// class member 변수	-> heap
	
	int number = 0;
	static int counting = 0;	// 정적변수
	
	public static void staticMethod() {	// class method
		System.out.println("MyClass staticMethod()");	
	}
	
	public void func() {	// instance method
		int num = 0;	// 지역변수
		
		num = num + 1;
		System.out.println("지역변수: num = " + num);
		
		number = number + 1;
		System.out.println("멤버변수: number = " + number);
		
		counting = counting + 1;
		System.out.println("정적변수: counting = " + counting);		
	}
}

















