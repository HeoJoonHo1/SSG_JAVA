package OOP8;

import OOP8.HeClass;


public class MainClass {
	public static void main(String[] args) {
		/*
			abstract class : abstract method + method + variable
							다중 상속이 불가능
			
			interface : abstract method 로만 구성되어 있는 (class)
						(선언되어 있는 메소드로만 구성)
						다중 상속이 가능
						빠르게 클래스 설계 또는 구성을 파악이 가능
						확장성에서 우수
		 */
		
		MyInterface myInter = new MyInterface() {			
			@Override
			public void abMethod() {
				System.out.println("MyInterface abMethod()");				
			}
		};				
		myInter.abMethod();
		
		
		MyClass mycls = new MyClass();
		mycls.abMethod();
		
		
		MyInterface my = new MyClass();
		my.abMethod();
		
		
		HeClass hc = new HeClass();
		hc.abMethod();
		hc.func();
		
		MyInterface my1 = new HeClass();
		my1.abMethod();		
		
		
	}
}






/*
다중 상속이 불가능
class ParentOne{
	
}
class ParentTwo{
	
}
class Child extends ParentOne, ParentTwo{
	
}
*/







