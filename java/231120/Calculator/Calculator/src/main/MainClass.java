package main;

import cal.Calculator;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.input();
		cal.process();
		cal.print();
	}
}
