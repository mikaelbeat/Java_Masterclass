package abstraction_Challenge;

public abstract class  Character {
	
	private String name;
	private String race;
	
	public Character(String name, String race){
		this.name = name;
		this.race = race;
	}
	
	public abstract void move();
	public abstract void heal();
	
	public String getName(){
		return name;
	}
	
	public String getRace(){
		return race;
	}
}
