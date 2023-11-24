package OOP6.cls;

public class Child extends Parent{

	public void func() {
		System.out.println("Child func()");
	}

	@Override	// <- namespace 주석(제시어)문 
	public void method() {
		System.out.println("Child method()");		
	}	
}
