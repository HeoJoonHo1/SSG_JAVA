package cls;

import single.SingletonClass;

public class Woman {

	private String name;
	private String address;	
	
	public Woman() {
		address = "부산시 수영구";
	}
	
	public void proc() {
		SingletonClass sc = SingletonClass.getInstance();
		
		this.name = sc.name;
	}
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		sc.address = this.address;
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + "]";
	}
	
	
}
