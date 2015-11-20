import java.util.Random;
import java.util.Scanner;

public class Battle {

	public Battle(Player p, Monster m){
		int playerHealth = p.getHealth(),
				monsterHealth = m.getHealth();
		char playerInput, monsterInput;
		char[] rps = {'r', 'p', 's'};
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		while(playerHealth > 0 && monsterHealth > 0)
		{
			System.out.println("input r-rock p-paper s-sissor");
			playerInput = keyboard.next().charAt(0);
			monsterInput = rps[r.nextInt(3)];
			
			if (playerInput == 'r' && monsterInput == 'p')
				playerHealth -= 10;
			else if (playerInput == 's' && monsterInput == 'p')
				monsterHealth -= 10;
			else if (playerInput == 'r' && monsterInput == 's')
				monsterHealth -= 10;
			else if (playerInput == 'p' && monsterInput == 's')
				playerHealth -= 10;
			else if (playerInput == 'p' && monsterInput == 'r')
				monsterHealth -= 10;
			else if (playerInput == 's' && monsterInput == 'r')
				playerHealth -= 10;
			else
				System.out.println("clang");
				 
			System.out.println("MonsterHP:" + monsterHealth + "\nPlayerHP:" + playerHealth);
			
		}
		p.setHealth(playerHealth);
		m.setHealth(monsterHealth);

	}

}
