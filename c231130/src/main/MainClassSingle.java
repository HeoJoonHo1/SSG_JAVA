package main;

import cls.Animal;
import cls.Human;
import cls.Woman;
import single.SingletonClass;

public class MainClassSingle {
	public static void main(String[] args) {
		
		Human h = new Human();
		Animal a = new Animal();
		Woman w = new Woman();
		
	//	String name = h.getName();
	//	a.setName(name);
		
	//	System.out.println(a.toString());
		
	//	System.out.println(SingletonClass.getInstance());
		
		h.func();
		a.method();
		w.proc();
		
		System.out.println(a.toString());
		System.out.println(w.toString());
		
		w.method();
		h.method();
		
	}
}




