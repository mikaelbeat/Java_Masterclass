package abstraction_Challenge;

public class Barbarian extends Character{
	
	public Barbarian(String name, String race){
		super(name, race);
	}

	@Override
	public void move() {
		System.out.println(getRace()+" "+getName()+" moves throught landscape.");
	}

	@Override
	public void heal() {
		System.out.println(getRace()+" "+getName()+" drinks potion and is now healed.");
	}
}
