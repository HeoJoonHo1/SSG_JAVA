package Work13;

import Work13.Point3D;

public class MainClass {
	public static void main(String[] args) {
		
		/*
			다음과 같은 실행결과를 얻도록 Point3D클래스의 equals()를 
			멤버변수인 x, y, z	의 값을 비교하도록 오버라이딩하고, 
			toString()은 실행결과를 참고해서 적절히 오버라이딩하시오.
		*/
		/*
		Point3D p1 = new Point3D(1, 2, 3);
		Point3D p2 = new Point3D(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 == p2?"+ (p1 == p2));
		System.out.println("p1.equals( p2 )?"+ ( p1.equals( p2 ) ));
		*/	
		
		
//		아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
//		클래스를 상속받도록 코드를 변경하시오.
		/*
		Unit unit[] = new Unit[3];
	//	Unit unit1, unit2, unit3;		
		
		unit[0] = new Marine();
		unit[1] = new Tank();
		unit[2] = new Dropship();
		
		unit[0].move(100, 200);
		unit[1].move(640, 120);
		unit[2].move(320, 240);
		
		unit[0].stop();
		unit[1].stop();
		unit[2].stop();
		
		for (int i = 0; i < unit.length; i++) {
			if(unit[i] instanceof Marine) {
				Marine m = (Marine)unit[i];
				m.stimPack();
			}
			else if(unit[i] instanceof Tank) {
				((Tank)unit[i]).changeMode();
			} 
			else if(unit[i] instanceof Dropship) {
				Dropship d = (Dropship)unit[i];
				d.load();
				d.unload();
			}
		}
		*/
		
		
		/*
		[실행결과]
		춤을 춥니다.
		노래를 합니다.
		그림을 그립니다.
		*/
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}		
	}

	static void action(Robot robot) {		
		if(robot instanceof DanceRobot) {			
			DanceRobot d = (DanceRobot)robot;
			d.dance();
		}
		else if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();
		} 
		else if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}		
	}
}

class Unit{
	int x, y;
	
	void move(int x, int y) { 
		System.out.println("x = " + x + " y = " + y);
	}
	void stop() { 
		System.out.println("멈춤!");
	}
}


class Marine extends Unit{ // 보병
	void stimPack() { 
		/* 스팀팩을 사용한다.*/
		System.out.println("Marine stimPack!");
	}
}
class Tank extends Unit{ // 탱크			특성 == property
	void changeMode() { 
		/* 공격모드를 변환한다. */
		System.out.println("Tank changeMode~");
	}
}
class Dropship extends Unit{ // 수송선
	void load() { 
		/* 선택된 대상을 태운다.*/ 
		System.out.println("야 타!");
	}
	void unload() { 
		/* 선택된 대상을 내린다.*/ 
		System.out.println("야 내려~");
	}
}




class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
//허준호 테스트

