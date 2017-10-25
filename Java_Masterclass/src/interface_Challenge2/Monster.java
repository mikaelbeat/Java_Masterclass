package interface_Challenge2;

import java.util.ArrayList;

public class Monster implements ICharacter{
	
	private static ArrayList<String> monsters =  new ArrayList<String>();
	
	private String name;
	private int strenght;
	private int level;
	private static boolean isLoaded = false;
	
	public Monster(String name, int strenght, int level){
		this.name = name;
		this.strenght = strenght;
		this.level = level;
		monsters.add(this.name+" strenght: "+this.strenght+", level: "+this.level);
	}
	
	public static void getMonsters(){
			System.out.println("");
			System.out.println("----------All monsters in the game----------");
			for(int i=0; i<monsters.size(); i++){
				System.out.println("Monster number "+(1+i)+" is "+monsters.get(i)+".");
			}
	}
	
	@Override
	public String toString(){
		if(isLoaded){
			System.out.println("Monster "+name+" has strenght of "+strenght+" and is at level "+level+".");
			return this.name +": "+ this.strenght+": "+this.level;
		}else{
			System.out.println("Monster is not loaded, cannot get monster details.");
			return null;
		}
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
			System.out.println("Monster is not loaded, cannot do any actions.");
		}
	}

	@Override
	public void LevelUp(int newLevel) {
		if(isLoaded){
			this.level = newLevel;
			System.out.println("Monster "+name+" is now at level "+level+".");
		}else{
			System.out.println("Monster is not loaded, cannot level up.");
		}
	}

	@Override
	public boolean callCharacter(String monster) {
		if(isLoaded){
			if(monster == name){
				System.out.println("Monster "+name+" responded.");
			}else{
				System.out.println("No monsters with such name.");
			}
		}else{
			System.out.println("Monster is not loaded, monster cannot respond.");
		}
		return false;
	}
}