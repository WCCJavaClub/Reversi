import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner pin = new Scanner(System.in);
		char PlayerInputChar;
		Map m = new Map(7);
		Monster mon = new Monster(40, 2, 3);
		Player p = new Player(100, 2, 4);
		Battle b;

		while(p.getHealth() > 0)
		{
			m.makeMap();
			m.addEntity(p);
			m.addEntity(mon);
			m.showMap();
			if(p.getX() == mon.getX() && p.getY() == mon.getY())
			{
				b = new Battle(p,mon);
				m.makeMap();
				m.addEntity(p);
				m.addEntity(mon);
				m.showMap();
			}
			System.out.print("Enter a move: ");
			PlayerInputChar = pin.next().charAt(0);
			p.move(PlayerInputChar);
			mon.move();

		}

	}

}
