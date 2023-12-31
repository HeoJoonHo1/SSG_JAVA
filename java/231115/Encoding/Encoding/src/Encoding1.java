import java.util.Arrays;

public class Encoding1 {
	public static void main(String[] args) {
		
		// 입력 -> 숫자 + 문자
		// 암호화, 복호화 -> 함수
		String str = "abc123";
		
		String encode = Encoding(str);
		System.out.println("암호화:" + encode);
		
		String decode = Decoding(encode);
		System.out.println("복호화:" + decode);

		
		// 2차원배열 -> 1차원배열 (함수화)
		int arr2[][] = {
			{ 1, 2, 3 },
			{ 4, 5, 6 }
		};
		
		int arr1[] = Array2_to_Array(arr2);
		System.out.println(Arrays.toString(arr1));
		
		int arr22[][] = {
			{ 11, 22 },
			{ 33, 44 },
			{ 55, 66 }
		};
		
		int arr11[] = Array2_to_Array(arr22);
		System.out.println(Arrays.toString(arr11));
		
		/*
		// a b c d e ...
		char abcCode[] = {	
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		// 0 1 2 3 4 5 ...
		char numCode[] = {	
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		
		// 암호화
		String src = "yoonpy56781";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int n = (int)ch;	// 아스키 코드 취득
		
			// 알파벳의 경우(97 ~)
			if(n >= 97 && n <= 122) {
				n = n - 97;
				result = result + abcCode[n];
			}
//					if(ch >= 'a' && ch <= 'z') {
//						
//					}			
			// 숫자의 경우(48 ~ )
			else if(n >= 48 && n <= 57){
				n = n - 48;
				result = result + numCode[n];
			}			
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		
		
		// 복호화
		String originalSrc = "";
		for(int i = 0;i < result.length(); i++) {
			char ch = result.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			
			// 알파벳인 경우(숫자였던 것)
			if(n >= 97 && n <= 122) {
				
				for(int j = 0;j < numCode.length; j++) {
					if(ch == numCode[j]) {
						index = j;
						break;
					}					
				}	
				index = index + 48;
				originalSrc = originalSrc + (char)index;				
			}			
			// 그 외의 경우(알파벳이였던 경우)
			else {
				
				for(int j = 0;j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				originalSrc = originalSrc + (char)index;
			}			
		}
		
		System.out.println("복호화된 코드:" + originalSrc);
		*/		
	}
	
	// 암호화
	static String Encoding(String src) {
		// a ~ z
		char abcCode[] = {	
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		// 0 1 2 3 4 5 ...
		char numCode[] = {	
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		// 대문자가 들어 온 경우
	//	src = src.toLowerCase();
		
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			int n = (int)ch;	// 아스키 코드 취득
		
			// 알파벳의 경우(97 ~)
			if(n >= 97 && n <= 122) {
				n = n - 97;
				result = result + abcCode[n];
			}
		
			// 숫자의 경우(48 ~ )
			else if(n >= 48 && n <= 57){
				n = n - 48;
				result = result + numCode[n];
			}			
		}
		
		return result;
	}
	
	// 복호화
	static String Decoding(String str) {
		char abcCode[] = {	
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		// 0 1 2 3 4 5 ...
		char numCode[] = {	
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		String originalSrc = "";
		for(int i = 0;i < str.length(); i++) {
			char ch = str.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			
			// 알파벳인 경우(숫자였던 것)
			if(n >= 97 && n <= 122) {
				
				for(int j = 0;j < numCode.length; j++) {
					if(ch == numCode[j]) {
						index = j;
						break;
					}					
				}	
				index = index + 48;
				originalSrc = originalSrc + (char)index;				
			}			
			// 그 외의 경우(알파벳이였던 경우)
			else {
				
				for(int j = 0;j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				originalSrc = originalSrc + (char)index;
			}			
		}
		
		return originalSrc;
	}
	
	static int[] Array2_to_Array(int array2[][]) {
		int array[] = new int[array2.length * array2[0].length];
		int count = 0;
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array[count] = array2[i][j];
				count++;
			}
		}		
		return array;		
	}
	
	
}






