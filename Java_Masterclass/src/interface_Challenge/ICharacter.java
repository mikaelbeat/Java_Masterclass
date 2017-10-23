package interface_Challenge;

public interface ICharacter {
	
	void Loaded();
	void Action();
	void LevelUp();
	
	boolean callCharacter(String name);
	boolean characterResponding();

}
