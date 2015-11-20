
public abstract class Entity {


	protected int health;
	protected int x, y;
	protected int exp;
	protected char charName;
	
	public Entity(int health, int x, int y){
		this.health = health;
		this.x = x;
		this.y = y;
		
	}	
	

	public int getHealth() {
		return health;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getExp() {
		return exp;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public char getCharName(){
		return charName;
	}
	
}


