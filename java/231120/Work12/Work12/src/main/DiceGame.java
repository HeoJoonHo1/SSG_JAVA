package main;

import cls.MyTv2;
import game.Game;

public class MainClass {
	public static void main(String[] args) {

		// 코드를 넣어 완성하시오
		/*
		Student s = new Student();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+ s.name);
	//	System.out.println(s.method());
		System.out.println("총점:"+ s.getTotal(s.kor, s.eng, s.math) );
		System.out.println("평균:"+ s.getAverage( ) );
		*/
		
		
				
		// 코드를 넣어 완성하시오
		/*
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+ t.getChannel());		
		t.setVolume(20);
		System.out.println("VOL:"+ t.getVolume());
		*/
		
		
		// 주사위 게임		
		Game game = new Game();
		
		game.play();
		
//		while(true) {
//			game.init();
//			game.userInput();
//			game.finding();
//			game.result();
//		}
	}
}



