package abstraction_Challenge;

public class WhiteMage extends Character implements Magic{

	public WhiteMage(String name, String race) {
		super(name, race);
	}

	@Override
	public void lightning() {
		System.out.println(getRace()+" "+getName()+" is summoning big lightning show.");
	}

	@Override
	public void fireball() {
		System.out.println(getRace()+" "+getName()+" is not able to use fire magic.");
	}

	@Override
	public void move() {
		System.out.println(getRace()+" "+getName()+" is riding horse in the countryside.");
	}

	@Override
	public void heal() {
		System.out.println(getRace()+" "+getName()+" is brewing healing potions.");
	}
}