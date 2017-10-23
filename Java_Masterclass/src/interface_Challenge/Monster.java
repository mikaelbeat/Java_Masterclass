package interface_Challenge;

import java.util.ArrayList;

public class Monster implements ICharacter{
	
	private static ArrayList<String> monsters =  new ArrayList<String>();
	
	private String name;
	private boolean isLoaded;
	private boolean isResponding;
	
	
	public Monster(String name){
		this.name = name;
	}
	
	public static void addMonster(String name){
		monsters.add(name);
		System.out.println("Monster named: "+name+" added.");
	}

	@Override
	public void Loaded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LevelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callCharacter(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean characterResponding() {
		// TODO Auto-generated method stub
		return false;
	}

}
