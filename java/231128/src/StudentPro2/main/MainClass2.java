package StudentPro2.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dto.HumanDto;

public class MainClass2 {
	public static void main(String[] args) {
		/*
			Collection : 수집
			
			List : 	목록
					데이터의 관리를 유동적으로 할 수 있는 배열.
					관리는 (index) number로 접근 및 관리한다.
					선형구조	o-o-o-o-o----  
					
			ArrayList(99%)
					검색이 효율이 우수
			
			LinkedList
					빈번하게 추가/삭제가 되는 경우에 적합한 구조					
		*/
		
		// 동적인 배열을 선언!	 ArrayList arrList[] = new ArrayList[];
		ArrayList<Integer> arrList = new ArrayList<Integer>();
	//	List<Integer> arrList = new ArrayList<Integer>();
		
		// 추가
		arrList.add(1111);	// 0
		
		Integer in = new Integer(2222);	// 1
		arrList.add(in);
		
		arrList.add(new Integer(3333));	// 2
		
		// 목록의 크기
		int len = arrList.size();	// == length
		System.out.println("size:" + len);
		
		// 목록에서 데이터를 산출	arrList[0 ~ n]
		Integer ii = arrList.get(0);		// arrList[0]
		System.out.println(ii);
		
		// 모든 데이터를 출력
		for(int i = 0;i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		for(Integer n : arrList) {
			System.out.println(n);
		}
		
		// 원하는 위치에 추가	0 ~ 2	1111 2222 3333	<- 3000
		Integer inum = 3000;
		arrList.add(2, inum);
		
		for(Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println();
		
		
		// 삭제
		arrList.remove(1);
	//	arrList.remove(new Integer(3000));
				
		for(int i = 0;i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}		
		
		
		// 검색
		int index = arrList.indexOf( 3000 );
		System.out.println(index);
		System.out.println(arrList.get(index));
		
		int idx = -1;
		for(int i = 0;i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			if(n == 3333) {
				idx = i;
				break;
			}
		}
		System.out.println("idx:" + idx);
		
		
		// 수정
		Integer newInt = 5555;
		arrList.set(1, newInt);
		
		for(int i = 0;i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		
		List<String> list = new ArrayList<String>();
		
		// 추가
		
		// 원하는 위치에 추가
		
		// 출력
		
		// 삭제
		
		// 출력
		
		// 검색
		
		// 출력
		
		// 수정
		
		// 출력
		
		
		List<HumanDto> hlist = new ArrayList<HumanDto>();
		
		// 추가
		String name = "홍길동";
		int age = 24;
		double height = 172.1;		
		HumanDto dto = new HumanDto(name, age, height);		
		hlist.add(dto);
		
		hlist.add(new HumanDto("성춘향", 16, 157.3));		
		hlist.add(new HumanDto("일지매", 22, 181.2));
		hlist.add(new HumanDto("홍두께", 21, 177.3));
		
		/*
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);			
		//	System.out.println(h.toString());
			System.out.println(h.getName());
		}
		*/
		for (HumanDto h : hlist) {
			System.out.println(h.toString());
		}
		System.out.println();
		
		// 원하는 위치에 추가
		HumanDto human = new HumanDto("홍두께", 25, 178.7);
		hlist.add(1, human);
		
		for (HumanDto h : hlist) {
			System.out.println(h.toString());
		}	
		System.out.println();
		
		// 삭제
		int findIndex = -1;
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if(h.getName().equals("성춘향")) {
				findIndex = i;
				break;
			}			
		}
		
		if(findIndex != -1) {
			hlist.remove(findIndex);
		}
		
		for (HumanDto h : hlist) {
			System.out.println(h.toString());
		}	
		System.out.println();
		
		
		// 검색
		List<HumanDto> findlist = new ArrayList<HumanDto>();		
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if(h.getName().equals("홍두께")) {
				findlist.add(h);
			}
		}
		
		for (HumanDto h : findlist) {
			System.out.println(h.toString());
		}
		System.out.println();		
		
		// 수정
		findIndex = -1;
		for (int i = 0; i < hlist.size(); i++) {
			HumanDto h = hlist.get(i);
			if(h.getName().equals("성춘향")) {
				findIndex = i;
				break;
			}			
		}
		
		// list 안에 Object를 변경
		HumanDto hman = new HumanDto("김인수", 26, 179.2);
		hlist.set(2, hman);
		
		for (HumanDto h : hlist) {
			System.out.println(h.toString());
		}	
		System.out.println();
		
		
		// list 안에 데이터를 수정
		HumanDto man = hlist.get(0);
		man.setAge(20);
		man.setHeight(180.0);
		
		for (HumanDto h : hlist) {
			System.out.println(h.toString());
		}	
		System.out.println();
		
		
		
		// 참고		
		List<Object> allDataList = new ArrayList<>();
		
		allDataList.add(new String("하이"));
		allDataList.add(new Integer(123));
		allDataList.add(new HumanDto("abc", 22, 180));
		allDataList.add(hlist);
		
		
		
		// array -> list
		String arr[] = { "hello", "world", "hi" };
				
	//	List<String> li = Arrays.asList(arr);
	//  위와 같이 하면 list로 변경은 되지만 list를 정상적으로 사용할 수 없음.	
		
		List<String> li = new ArrayList<String>();		
		li.addAll(Arrays.asList(arr));	// list에 추가		
		
		li.add(new String("good"));
		
		for (int i = 0; i < li.size(); i++) {
			String s = li.get(i);
			System.out.println(s);
		}		
		
		// list -> array
		List<String> slist = new ArrayList<String>();
		slist.add("Tigers");
		slist.add("Giants");
		slist.add("Twins");
		
		int slistSize = slist.size();
		String arrStr[] = slist.toArray(new String[slistSize]);
		
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		
	}
}












