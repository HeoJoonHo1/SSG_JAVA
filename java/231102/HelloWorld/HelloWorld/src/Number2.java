
public class Number2 {

	public static void main(String[] args) {
		
		// 변수의 자료형(그릇)의 종류
		// 숫자형
		// 정수
		byte by;	// 1 byte == 8 bit -> 256개
		by = -128;
		System.out.println(by); // 127 ~ -128
		
		short sh;	// 2 byte
		sh = 12345;
		System.out.println(sh);
		
		int i;		// 4 byte
		i = 123456789;
		System.out.println(i);
		
		long lo;
		lo = 324324324324234234L;
		
		// 소수
		float f;
		f = 123.456789f;
		System.out.println(f);
		
		double d;
		d = 123.456789012;
		System.out.println(d);
		
		// 문자형  
		// 문자
		char c;		// 2 byte character <- unicode  ASCII code
		c = 'a';
		c = '한';
		c = '+';
		c = 'A';
	//	c = 'ab';
		System.out.println(c);
		
		// 문자열
		// String == wrapper class
		String str;
		str = "hello";
		System.out.println(str);
		
		str = "world";
		System.out.println(str);
				
		// 논리형(참/거짓) true(1)/false(0)
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		
		
	}
}
