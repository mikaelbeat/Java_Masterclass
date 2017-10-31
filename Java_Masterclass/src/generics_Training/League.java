package generics_Training;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	
	public String name;
	private ArrayList<T> league = new ArrayList<T>();
	
	public League(String name){
		this.name = name;
		System.out.println(name+" league added.");
	}
	
	public String getLeagueName(){
		return this.name;
	}
	
	public boolean add(T team){
		
		if(league.contains(team)){
			toString();
			System.out.println("League "+name+" already contains team.");
			return false;
		}
		league.add(team);
		toString();
		System.out.println("Team "+team+" added to league "+name+".");
		return true;
	}
	
	public void showLeagueTable(){
		System.out.println("League ranking list");
		Collections.sort(league);
		for(T t : league){
			System.out.println(t.getName() + ": "+ t.ranking());
			
		}
	}

}
