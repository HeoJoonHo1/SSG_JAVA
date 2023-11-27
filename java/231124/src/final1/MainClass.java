package final1;

public class MainClass {
	public static void main(String[] args) {
		/*
			final : 제약
			변수, 메소드, 클래스
		*/
		
		final int number = 10;	// 변수 -> 상수
	//	number = 20;		
		int num = number;		// 초기값
		
		final int MAX = 100;
		final int MIN = 10;
		int count = 25;
		
		if(count > MIN && count <= MAX) {			
		}		
	}
}

// 상속금지!
final class Parent{
	
	// OverRide 금지!
	public final void method() { 	
		
	}		
}
/*
class Child extends Parent{	
	
//	public void method() {	// OverRide
//		
//	}
}
*/








