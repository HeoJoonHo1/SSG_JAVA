package factory;

import bomb.Bomb;
import item.Item;
import weapon.Weapon;

public class Person {
	
	public Weapon m_weapon;
	public Bomb m_bomb;
	
	public void create(Item item) {
		m_weapon = item.createWeapon();
		m_bomb = item.createBomb();
	}
}







