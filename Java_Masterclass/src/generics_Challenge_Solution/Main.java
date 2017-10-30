package generics_Challenge_Solution;

public class Main {

	public static void main(String[] args) {
		
		// Add league
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
		
		// Add teams
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		
		// Adding teams to league
		footballLeague.add(adelaideCrows);
		footballLeague.add(melbourne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);
		
//		footballLeague.add(baseballTeam);
		
		System.out.println("===================================");
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
