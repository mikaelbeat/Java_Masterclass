package compositionChallange;

public class Main {

	public static void main(String[] args) {

		Game game = new Game("Madden 18");

		PS4 ps4 = new PS4("PS4 Pro", "4K", game);
		Monitor monitor = new Monitor("Samsung", "4K", 28);
		
		System.out.println("Console information:");
		ps4.getModel();
		ps4.getResolution();
		ps4.startPS4();
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		System.out.println("Monitor information:");
		monitor.getModel();
		monitor.getResolution();
		monitor.getSize();
		monitor.turnMonitorOn();
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		game.getGame();
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		System.out.println("Playing starts");
		Play play = new Play(monitor, ps4);
		play.gameOn();


	}

}
