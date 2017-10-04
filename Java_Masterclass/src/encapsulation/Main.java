package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		EnchancedPlayer player = new EnchancedPlayer("Tim", 200, "Spear");
		System.out.println("Initial health is: "+player.getHealth());
		
//		Player player = new Player();
//		player.name = "Tim";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = "+ player.healthRemaining());

	}

}
