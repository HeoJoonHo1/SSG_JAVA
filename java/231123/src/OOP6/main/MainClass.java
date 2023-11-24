package OOP6.main;

import OOP6.animal.Animal;
import OOP6.animal.Cat;
import OOP6.animal.Cow;
import OOP6.animal.Dog;
import OOP6.cls.Child;
import OOP6.cls.Parent;

public class MainClass {
	public static void main(String[] args) {
		/*
		Parent p = new Parent();
		p.method();
	//	p.func();
		
		Child c = new Child();
		c.parent_method();
		c.method();
		*/
				
		Parent p = new Child();
		p.method();
		
		
		Cat cat[] = new Cat[10];
		Dog dog[] = new Dog[10];
		Cow cow[] = new Cow[10];		
		cat[0] = new Cat();
		cat[1] = new Cat();
		dog[0] = new Dog();
		cow[0] = new Cow();
		
		
		Animal animal[] = new Animal[10];		
		animal[0] = new Cat();
		animal[1] = new Cat();
		animal[2] = new Dog();
		animal[3] = new Cow();
		
		for (int i = 0; i < animal.length; i++) {
			if(animal[i] != null) {
				animal[i].speech();
				
				if(animal[i] instanceof Dog) {
					Dog d = (Dog)animal[i];
					d.dog_method();
				}
				else if(animal[i] instanceof Cat) {
					Cat c = (Cat)animal[i];
					c.cat_method();
				}
				else if(animal[i] instanceof Cow) {
					Cow co = (Cow)animal[i];
					co.cow_method();
				}				
			}
		}
		
		
		
		/*
		Animal ani = new Dog();		
		ani.speech();
		
		// instanceOf : 어떤 자식클래스로 생성되었는지 산출하는 키워드		
		if(ani instanceof Dog) {
			System.out.println("ani는 Dog클래스로 생성되었음");
		}
		
		// 자식클래스의 자료형으로 (cast)변환
		Dog d = (Dog)ani;
		d.dog_method();
		*/
		
		Object obj = new MyClass();
		MyClass mycls = (MyClass)obj;
		mycls.myclass_method();
	
		Object yobj = new YouClass();
	}
}

class MyClass {	
	public void myclass_method() {
		System.out.println("MyClass myclass_method()");
	}
}
class YouClass{
	
}













