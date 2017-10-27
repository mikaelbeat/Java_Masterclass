package abstraction_Challenge;

public class Main {

	public static void main(String[] args) {
		
		Barbarian barbarian = new Barbarian("Conan", "Human");
		barbarian.move();
		barbarian.heal();
		
		System.out.println("");
		
		DarkElf darkElf = new DarkElf("Tamriel", "Dark Elf");
		darkElf.move();
		darkElf.heal();
		darkElf.fireball();
		darkElf.lightning();
		
		System.out.println("");
		
		WhiteMage whiteMage = new WhiteMage("Gandalf", "Human");
		whiteMage.move();
		whiteMage.heal();
		whiteMage.fireball();
		whiteMage.lightning();
	}
}