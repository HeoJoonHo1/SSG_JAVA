import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		/*
			편의점
			
			입력 >>
			지불해야될 금액: 3230원
			입력 >>
			자신이 지불한 금액: 10000원
			
			거스름돈
			5000원 : ?장  1
			1000원 : ?장  1
			500원 : ?개   1
			100원 : ?개   2
			50원 : ?개    1
			10원 : ?개    2
		*/
		Scanner sc = new Scanner(System.in);
		
		int price;
		int myMoney;
		int changeMoney;	// 거스름돈

		// 입력
	//	price = 3230;
	//	myMoney = 10000;
		
		System.out.print("구매한 물건값을 입력 >> ");
		price = sc.nextInt();
		
		System.out.print("본인의 돈입력 >> ");
		myMoney = sc.nextInt();		
		
		// 거스름돈
		changeMoney = myMoney - price;
		
		// 5000
		int m5000 = changeMoney / 5000; // 6770
		
		// 1000
		int m1000 = (changeMoney % 5000) / 1000;
		
		// 500
		int m500 = (changeMoney % 1000) / 500;
		
		// 100
		int m100 = (changeMoney % 500) / 100;
		
		// 50
		int m50 = (changeMoney % 100) / 50;
		
		// 10
		int m10 = (changeMoney % 50) / 10;
		
		System.out.println("거스름돈은 " + changeMoney + "원입니다");
		System.out.println("5000원권은 " + m5000 + "장입니다");
		System.out.println("1000원권은 " + m1000 + "장입니다");
		System.out.println("500원권은 " + m500 + "개입니다");
		System.out.println("100원권은 " + m100 + "개입니다");
		System.out.println("50원권은 " + m50 + "개입니다");
		System.out.println("10원권은 " + m10 + "개입니다");
		
		
	}
}




