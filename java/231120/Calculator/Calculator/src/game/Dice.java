package game;
 
public class Dice {
	private int number;

	// random
	public void setRandom() {
		number = (int)(Math.random() * 6) + 1;
	}
	
	// getter
	public int getNumber() {
		return number;
	}
}
