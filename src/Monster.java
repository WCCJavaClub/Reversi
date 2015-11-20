import java.util.Random;

public class Monster extends Entity {

	
	private char charName = 'M';
	
	public Monster(int health, int x, int y){
		super(health, x, y);
		
	}
	
	public void move(){
		Random r = new Random();
		int randomNumber = r.nextInt(5);
		switch (randomNumber)
		{
		case 0: y -= 1; break;
		case 1: y += 1; break;
		case 2: x -= 1; break;
		case 3: x += 1; break;
		case 4: break;
		default: break;	
		}
		
	}
	


	public char getCharName(){
		return charName;
	}
	
}
