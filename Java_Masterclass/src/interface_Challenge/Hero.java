package interface_Challenge;

import java.util.ArrayList;

public class Hero implements ICharacter{
	
	private static ArrayList<String> heroes =  new ArrayList<String>();
	
	private String name;
	private boolean isLoaded;
	private boolean isResponding;
	
	public Hero(){
		this.name = name;
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
