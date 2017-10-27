package abstraction_Challenge;

public class DarkElf extends Character implements Magic{

	public DarkElf(String name, String race) {
		super(name, race);
	}

	@Override
	public void move() {
		System.out.println(getRace()+" "+getName()+" is dashing thought forest.");
	}

	@Override
	public void heal() {
		System.out.println(getRace()+" "+getName()+" is healing itself by sleeping. ");
	}

	@Override
	public void lightning() {
		System.out.println(getRace()+ " cannot use lightning magic.");
	}

	@Override
	public void fireball() {
		System.out.println(getRace()+" "+getName()+" is throwing some fireballs.");
	}
}
