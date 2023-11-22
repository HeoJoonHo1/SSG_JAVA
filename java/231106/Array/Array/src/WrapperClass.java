
public class WrapperClass {

	public static void main(String[] args) {
		/*
			Wrapper class
			일반 자료형(char, int..)들을 클래스화 해 놓은 것
			String
			
			일반자료형			Wrapper class
			boolean			Boolean
			
			byte			Byte
			short			Short
			int				Integer		-->
			long			Long
			
			float			Float
			double			Double		-->
			
			char			Character
			char[]			String		-->			
		*/
		
		Integer iobj = 123;
		System.out.println(iobj);
		
		iobj = iobj * 2;
		System.out.println(iobj);
		
		// 숫자 -> 문자열
	//	String str = iobj + "";
		String str = iobj.toString();
		System.out.println(str);
		
		str = 123.4567 + "";
		System.out.println(str);
				
		// 문자열 -> 숫자
		String strNum = "2345";
		int number = Integer.parseInt(strNum);
		System.out.println(number * 2);
		
		String strDNum = "123.4567";
		double dnumber = Double.parseDouble(strDNum);
		System.out.println(dnumber);
		
		// 10진수 -> 2진수
		int n10 = 12;
		String n2 = Integer.toBinaryString(n10);
		System.out.println(n2);
				
		// 2진수 -> 10진수
		n2 = "11001010";
		n10 = Integer.parseInt(n2, 2);
		System.out.println(n10);
		
		// 10진수 -> 16진수
		n10 = 162;
		String n16 = Integer.toHexString(n10);
		System.out.println(n16);
		
		// 16진수 -> 10진수
		n16 = "CA";
		n10 = Integer.parseInt(n16, 16);
		System.out.println(n10);
	}
}







