package interface_Challenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ICharacter character;
		character = new Hero("White Knight", 85);
		character.Loaded();
		character.Action("training");
		character.LevelUp(5);
		character.callCharacter("White Knight");
		character.toString();
		Hero.getHeroes();
		
		System.out.println("");
		
		character = new Hero("Forest Wizard", 23);
		character.Loaded();
		character.Action("drinking coffee");
		character.LevelUp(2);
		character.callCharacter("Forest Wizard");
		character.toString();
		Hero.getHeroes();

		System.out.println("");
		
		character = new Monster("Ogre", 45);
		character.Loaded();
		character.Action("killing");
		character.LevelUp(56);
		character.callCharacter("Ogre");
		character.toString();
		Monster.getMonsters();
		
		System.out.println("");
		
		character = new Monster("Giant Spider", 70);
		character.Loaded();
		character.Action("Sleeping");
		character.LevelUp(77);
		character.callCharacter("Giant Spider");
		character.toString();
		Monster.getMonsters();
	}
	
	
	

}
