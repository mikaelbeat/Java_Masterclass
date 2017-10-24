package interface_Challenge2;

public interface ICharacter {
	
	void Loaded();
	void Action(String action);
	void LevelUp(int newLevel);
	
	boolean callCharacter(String name);
	boolean characterResponding();

}
