package generics;

public class Generics2 {

	public static void main(String[] args) {
		
		
		// Adding players
		FootballPlayer joe = new FootballPlayer("Joe");
		FootballPlayer banks = new FootballPlayer("Gordon");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		// Adding teams
		Team<SoccerPlayer> manchester = new Team<>("Manchester United");
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		// Adding players to teams
		manchester.addPlayer(beckham);
		baseballTeam.addPlayer(pat);
		adelaideCrows.addPlayer(joe);
		melbourne.addPlayer(banks);
		System.out.println("========================================");
		
		// Playing games
		
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		adelaideCrows.matchResult(fremantle, 2, 1);
//		adelaideCrows.matchResult(baseballTeam, 1, 1);
		System.out.println("========================================");
		
		
		
		System.out.println(adelaideCrows.numPlayers());
		System.out.println("Rankings");
		System.out.println(adelaideCrows.getName() + ": "+adelaideCrows.ranking());
		System.out.println(melbourne.getName() + ": "+melbourne.ranking());
		System.out.println(fremantle.getName() +": "+fremantle.ranking());
		System.out.println(hawthorn.getName() +": "+hawthorn.ranking());
		System.out.println("========================================");
		
		System.out.println(adelaideCrows.compareTo(melbourne));
		System.out.println(adelaideCrows.compareTo(hawthorn));
		System.out.println(hawthorn.compareTo(adelaideCrows));
		System.out.println(melbourne.compareTo(fremantle));
		
		
		
		
		
		
	}

}
