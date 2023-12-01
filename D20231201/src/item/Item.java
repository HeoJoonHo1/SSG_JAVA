package item;

import bomb.Bomb;
import weapon.Weapon;

public interface Item {

	Weapon createWeapon();
	Bomb createBomb();
}
