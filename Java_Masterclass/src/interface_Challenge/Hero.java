package interface_Challenge;

import java.util.ArrayList;

public class Hero implements ICharacter{
	
	private static ArrayList<String> heroes =  new ArrayList<String>();
	
	private String name;
	private static boolean isLoaded = false;
	private boolean isResponding;
	
	public Hero(){
		this.name = name;
	}
	
	public static void addHero(String name){
		if(isLoaded){
			heroes.add(name);
			System.out.println("Hero named: "+name+" added.");
		}else{
			System.out.println("Heroes application is not loaded yet.");
		}
		
	}
	
	static ArrayList<String> getHeroes(){
		for(int i=0; i<heroes.size(); i++){
			System.out.println("Position: "+(1+i)+" is hero named: "+heroes.get(i));
		}
		if(heroes.size()<=0){
			System.out.println("No heroes in list.");
		}
		return heroes;
	}
	
	static void removeHero(String name){
		heroes.remove(name);
		System.out.println("Hero: "+name+" is now removed.");
	}
	

	@Override
	public void Loaded() {
		isLoaded = true;
		System.out.println("Loading heroes application.");
		
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
