package composition_Challange;

public class Game {
	
	private String game;
	
	public Game(String game){
		this.game = game;
	}
	
	public String getGame(){
		System.out.println("Game is: "+game);
		return game;
	}

}
