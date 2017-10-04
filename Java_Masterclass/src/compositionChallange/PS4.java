package compositionChallange;

public class PS4 {
	
	private String model;
	private String resolution;
	private Game game;
	
	public PS4(String model, String resolution, Game game){
		this.model = model;
		this.resolution = resolution;
		this.game = game;
	}
	
	public void startPS4(){
		System.out.println("PS4 started. 4K resolution looks good!");
	}
	
	public String getModel(){
		System.out.println("Console model is: "+model);
		return model;
	}
	
	public String getResolution(){
		System.out.println("Resolution is: "+resolution);
		return resolution;
	}
	
	public Game getGame(){
		return game;
	}

}
