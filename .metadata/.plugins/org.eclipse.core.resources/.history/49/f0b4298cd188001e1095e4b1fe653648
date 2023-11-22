import java.util.Arrays;

public class Work9 {
	public static void main(String[] args) {	// arguments
		
		/*
			function : 	함수
						처리를 간략화.
						처리를 분산.
						동일한 처리를 하도록 하는 요소.
						
			구성 : parameter(인수, 인자, 매개변수)
				  return value를 (안)가질 수 있다.
				  void 형도 return을 사용할 수 있다.	
		*/		
//		char c = 'A';
//		double d = function(c, "Hello", 1.25);
		
		
		
		// 배열의 값에 *2배의 연산된 값이 산출되도록 메소드를 작성하시오.
		/*
		int num1[] = {1, 2, 3, 4, 5};
		// num1 = getDouble(num1);
		getDouble(num1);
		System.out.println(Arrays.toString(num1));
		*/
		
		
		// 두 수를 나눗셈 연산으로 몫과 나머지를 구하는 메소드를 작성하시오
	/*	int num1, num2;
		int result, tag[];
		
		num1 = 7;
		num2 = 2;
		tag = new int[1];		
		
		result = getResult(num1, num2, tag); 
		System.out.println("몫:" + result + " 나머지:" + tag[0]);
	*/			
		
		
		/*
		int num1, num2;
		int value[];
		
		num1 = 9;
		num2 = 2;
		value = new int[2];	
		
		getResult(num1, num2, value);
		System.out.println("몫:" + value[0] + " 나머지:" + value[1]);	
		*/
		
		
		// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다
//		double d = getDistance(1, 1, 2, 2);
//		System.out.println(d);
		
		
		// shuffle메소드를 작성하시오
		/*
		int[] original = {1,2,3,4,5,6,7,8,9};		
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);		
		System.out.println(Arrays.toString(result));
		*/
		
		
		// max메소드를 작성하시오.
//		int[] data = { 3, 2, 9, 4, 7 };
//		System.out.println(Arrays.toString(data));
//		System.out.println("최대값:"+ max(data));
		
		
		
		// isNumber메소드를 작성하시오
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
		str = "1a234";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
	
	}
	
	/*
		함수명: function
		parameter:	char, String, double
		return:	double
		내용: 문자열의 처리 함수
	*/
	static double function(char c, String str, double d) {
		System.out.println("function 호출");
		System.out.println(c + " " + str + " " + d);		
		return 123.456;
	}
	/*
	static int[] getDouble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		return arr;
	}
	*/
	
	static void getDouble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 3;
		}		
	}
		
//	static int getResult(int num1, int num2, int tag[]) {
//		int result = num1 / num2;
//		tag[0] = num1 % num2;		
//		return result;
//	}
	
	static void getResult(int num1, int num2, int value[]) {
		value[0] = num1 / num2;
		value[1] = num1 % num2;
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		
		int yy = (int)Math.pow(y1 - y, 2);
		int xx = (int)Math.pow(x1 - x, 2);
		
		double sqrt = Math.sqrt(yy + xx);
		
		return sqrt;
	}
	
	static int[] shuffle(int original[]) {		
		for(int i = 0;i < 100000; i++) {		
			int x = (int)(Math.random() * 9);	// 0 ~ 8
			int y = (int)(Math.random() * 9);	// 0 ~ 8
			
			int temp = original[x];
			original[x] = original[y];
			original[y] = temp;
		}
		
		return original;
	}
	
	static int max(int data[]) {
		if(data == null || data.length == 0) return -999999;		
		
		int max = data[0];		
		for (int i = 1; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}		
		return max;
	}
	
	// utility 함수
	static boolean isNumber(String str) {
		if(str == null || str.equals("")) return false;
		
		boolean r = true;
		for(int i = 0;i < str.length(); i++) {
			char c = str.charAt(i);
			int asc = (int)c;
			if(asc < 48 || asc > 57) {
				r = false;		
				break;
			}			
		}
		return r;
	}
	
}







