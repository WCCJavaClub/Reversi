
public class Map {

	char [][] board;
	int size;

	public Map(int size){

		this.size = size;
		board = new char[size][size];

	}
	public void makeMap(){

		for (int i = 0; i < size; i++)
		{

			for (int j = 0; j < size; j++)
			{
				board[i][j] = 'O';
			}
		}

	}

	public void showMap(){
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public void addPlayer(Player p){
		p = (Player) this.checkBounds(p);
		int x = p.getX(), y = p.getY();
		
		board[y][x] = 'X';


	}

	
	public void addEntity(Entity e){
		e = checkBounds(e);
		int x = e.getX(), y = e.getY();
		if (e.getHealth() > 0)
			board[y][x] = e.getCharName();
		
	}

	public Entity checkBounds(Entity p){

		if (p.getX() < 0)
			p.setX(p.getX() + 1);
		if (p.getX() > size - 1)
			p.setX(p.getX() - 1);
		if (p.getY() < 0 )
			p.setY(p.getY() + 1);
		if (p.getY() > size - 1)
			p.setY(p.getY() - 1);
		return p;

	}

}
