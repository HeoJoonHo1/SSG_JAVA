
public class Cast {
	public static void main(String[] args) {
		/*
			(자료)형 변환			우선순위
			byte		1        낮음 
			short		2
			int			4
			long		8
			
			float		4
			double		8        높음 
			
			auto(자동), cast(강제)변환
		*/
		
		// 자동형 변환
		short sh = 10000;
		int num;
		
		num = sh;
		System.out.println(num);
		
		// 강제(cast)형 변환
		num = 12345;
		sh = (short)num;
		System.out.println(sh);
		
		
		double result;		
		result = (double)3 / 2;
		System.out.println(result);
		
		
		long l = 123456789L;
		float f = l;
		
		System.out.println(f);
		
		double d = l;
		System.out.println(d);
		
		/*
			1.23456789E8
					  * 10 의 8승	
		*/
		
		double value = 1250.45;
		int money = (int)value;
		System.out.println(money);
		
	}
}






