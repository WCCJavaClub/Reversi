
public class Player extends Entity{

	private char charName = 'P';
	
	public Player(int health, int x, int y){
		super(health, x, y);

	}
	
	public void move(Character direction){
		
		switch (Character.toLowerCase(direction))
		{
		case 'w': y -= 1; break;
		case 's': y += 1; break;
		case 'a': x -= 1; break;
		case 'd': x += 1; break;
		default: break;	
		}
	}
	
	public char getCharName(){
		return charName;
	}
	
}
