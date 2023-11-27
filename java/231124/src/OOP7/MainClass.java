package OOP7;

public class MainClass {
	public static void main(String[] args) {
		/*
			abstract class : 추상 클래스
						추상 메소드를 하나이상 포함하고 있는 클래스
			abstract method : 추상 함수
						내용은 없고 선언만 되어 있는 함수
			
			일반함수
			public void method(int i){
				내용
			}
			
			추상함수
			public abstract void method(int i);	<- 함수의 사양(prototype)
			상속후에 (customizing)클래스에 원하는 데로 구현하는 것.
					사용자 지정
		*/		
		
		
	//	AbstractClass ac = new AbstractClass();	
		
//		1.
//		MyClass cls = new MyClass();
//		cls.method();
//		cls.abstractMethod();
		
//		2.
//		AbstractClass ac = new AbstractClass() {			
//			@Override
//			public void abstractMethod() {
//				System.out.println("AbstractClass abstractMethod()");				
//			}
//		};
//		ac.method();
//		ac.abstractMethod();
		
//		3.
		AbstractClass ac = new MyClass();
		ac.method();
		ac.abstractMethod();
		
		
		
		
	}
}

// 추상클래스
abstract class AbstractClass{
	
	private String name;

	// 추상메소드
	public abstract void abstractMethod();
	
	public void method() {
		System.out.println("AbstractClass method()");
	}	
}

class MyClass extends AbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("MyClass abstractMethod()");		
	}
}











