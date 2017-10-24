package interface_Challenge2;

import java.util.ArrayList;

public class Monster implements ICharacter{
	
	private static ArrayList<String> monsters =  new ArrayList<String>();
	
	private String name;
	private int strenght;
	private int level;
	private boolean isLoaded = false;
	private boolean isResponding;
	
	public Monster(String name, int strenght){
		this.name = name;
		this.strenght = strenght;
		this.level = 1;
		monsters.add(this.name+this.strenght+this.level);
	}
	
	public static void getMonsters(){
		for(int i=0; i<monsters.size(); i++){
			System.out.println("Monster number "+(1+i)+" named "+monsters.get(i)+".");
		}
	}
	
	@Override
	public String toString(){
		System.out.println("Monster "+name+" has strenght of "+strenght+" and is at level "+level+".");
		return this.name +": "+ this.strenght+": "+this.level;
	}
	
	@Override
	public void Loaded() {
		isLoaded = true;
		System.out.println("Monster "+name+" is loaded.");
		
	}

	@Override
	public void Action(String action) {
		if(isLoaded){
			System.out.println("Monster "+name+" is now "+action+".");
		}else{
			System.out.println("Game is not loaded yet.");
		}
		
	}

	@Override
	public void LevelUp(int newLevel) {
		if(isLoaded){
			this.level = newLevel;
			System.out.println("Monster "+name+" is now at level "+level+".");
		}else{
			System.out.println("Game is not loaded yet, cannot level up.");
		}
		
	}

	@Override
	public boolean callCharacter(String monster) {
		if(isLoaded){
			if(monster == name){
				System.out.println("Monster named "+name+" responded.");
			}else{
				System.out.println("No monsters with such name.");
			}
		}else{
			System.out.println("Game is not loaded yet, monsters cannot be called.");
		}
		return false;
	}

	@Override
	public boolean characterResponding() {
		// TODO Auto-generated method stub
		return false;
	}

}
