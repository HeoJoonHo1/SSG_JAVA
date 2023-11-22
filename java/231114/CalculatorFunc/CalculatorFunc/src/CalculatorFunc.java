import java.util.Scanner;

public class CalculatorFunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int number1 = 0;
		
		while(true) {
			System.out.print("첫번째 수 = ");
			String numStr1 = sc.next();
			
			// 숫자인지 검사
			boolean isNum = true;
			for (int i = 0; i < numStr1.length(); i++) {
				int n = numStr1.charAt(i);
				if(n < 48 || n > 57) {
					isNum = false;
					break;
				}
			}	
			
			// 문자열 -> 숫자
			if(isNum) {	// 정상적으로 숫자가 입력된 경우
				number1 = Integer.parseInt(numStr1);
				break;
			}
			
			System.out.println("정확히 숫자를 입력해 주십시오");
		}		
				
		System.out.print("(+, -, *, /) = ");
		String oper = sc.next();
		
		System.out.print("두번째 수 = ");
		int number2 = sc.nextInt();
		
		// calculator
//		int result = 0;
//		switch(oper) {
//			case "+":
//				result = number1 + number2;
//				break;
//			case "-":
//				result = number1 - number2;
//				break;
//			case "*":
//				result = number1 * number2;
//				break;
//			case "/":
//				result = number1 / number2;
//				break;				
//		}
		int result = calculator(number1, number2, oper);
		
		// print
		System.out.println(number1 + " " + oper + " " + number2 + " = " + result);		
	}
	
	static int calculator(int num1, int num2, String oper) {
		int result = 0;
		switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;				
		}
		return result;
	}
	
}







