package interface_Challenge2;

import java.util.ArrayList;

public class Hero implements ICharacter{
	
	private static ArrayList<String> heroes =  new ArrayList<String>();
	
	private String name;
	private int strenght;
	private int level;
	private boolean isLoaded = false;
	private boolean isResponding;
	
	public Hero(String name, int strenght){
		this.name = name;
		this.strenght = strenght;
		this.level = 1;
		heroes.add(this.name+this.strenght+this.level);
	}
	
	public static void getHeroes(){
		for(int i=0; i<heroes.size(); i++){
			System.out.println("Hero number "+(1+i)+" is "+heroes.get(i)+".");
		}
	}
	
	@Override
	public String toString(){
		System.out.println("Hero "+name+" has strenght of "+strenght+" and is at level "+level+".");
		return this.name +": "+ this.strenght+": "+this.level;
	}
	
	@Override
	public void Loaded() {
		isLoaded = true;
		System.out.println("Hero "+name+" is loaded.");
		
	}

	@Override
	public void Action(String action) {
		if(isLoaded){
			System.out.println("Hero "+name+" is now "+action+".");
		}else{
			System.out.println("Game is not loaded yet.");
		}
		
	}

	@Override
	public void LevelUp(int newLevel) {
		if(isLoaded){
			this.level = newLevel;
			System.out.println("Hero "+name+" is now at level "+level+".");
		}else{
			System.out.println("Game is not loaded yet, cannot level up.");
		}
		
	}

	@Override
	public boolean callCharacter(String hero) {
		if(isLoaded){
			if(hero == name){
				System.out.println("Hero named "+name+" responded.");
			}else{
				System.out.println("No heroes with such name.");
			}
		}else{
			System.out.println("Game is not loaded yet, heroes cannot be called.");
		}
		return false;
	}

	@Override
	public boolean characterResponding() {
		// TODO Auto-generated method stub
		return false;
	}

}
