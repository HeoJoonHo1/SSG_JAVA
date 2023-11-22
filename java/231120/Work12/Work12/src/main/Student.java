package main;

public class Student {

	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public void method() {		
	}
	
	public int getTotal(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
		return (kor + eng + math);
	}
	
	public double getAverage() {
	//	return (kor + eng + math) / 3;
		return (double)getTotal(kor, eng, math) / 3;
	}
	
}





