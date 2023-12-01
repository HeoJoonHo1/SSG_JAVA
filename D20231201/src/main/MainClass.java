package main;

import java.util.ArrayList;
import java.util.List;

import factory.Person;
import item.Soldier;
import item.Warrior;

public class MainClass {
	public static void main(String[] args) {
		
		Person personOne = new Person();
		personOne.create(new Warrior());
		
		personOne.m_weapon.DrawWeapon();
		personOne.m_bomb.DrawBomb();
		
		
		List<Person> list = new ArrayList<Person>();
		
		
		
	}
}





