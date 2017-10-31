package generics_Training;

public class Main {

	public static void main(String[] args) {
		
		// Add league
		League<Team<FootballTeam>> footballLeague = new League<>("AFL");
		System.out.println("===================================");
		
		// Add teams
		Team<FootballTeam> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballTeam> melbourne = new Team<>("Melbourne");
		Team<FootballTeam> hawthorn = new Team<>("Hawthorn");
		Team<FootballTeam> fremantle = new Team<>("Fremantle");
		
		Team<BaseballTeam> baseballTeam = new Team<>("Chicago Cubs");
		
		// Adding teams to league
		footballLeague.add(adelaideCrows);
		footballLeague.add(melbourne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);
		System.out.println("===================================");
		
//		footballLeague.add(baseballTeam);
		footballLeague.showLeagueTable();
		System.out.println("===================================");
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		adelaideCrows.matchResult(fremantle, 2, 1);
		System.out.println("===================================");
		footballLeague.showLeagueTable();
		System.out.println("===================================");

	}

}
