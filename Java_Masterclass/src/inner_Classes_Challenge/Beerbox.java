package inner_Classes_Challenge;

import java.util.ArrayList;

public class Beerbox implements IActions{
	
	private ArrayList<Beer> beers;
	private String boxName;
	private int maxBeers;
	private int beersInBox;
	
	public Beerbox(String boxName, int maxBeers){
		this.boxName = boxName;
		this.maxBeers = maxBeers;
		this.beers = new ArrayList<>();
		this.beersInBox = 0;	
	}
	
	public void addBeer(String name, String type){
		if(beersInBox < maxBeers){
			this.beers.add(new Beer(name, type));
			this.beersInBox += 1;
			System.out.println("Beer "+name+" added.");
			System.out.println("In the beerbox "+boxName+" size "+maxBeers+" is now "+beersInBox+" beers.");
			if(beersInBox == maxBeers){
				System.out.println("Beerbox "+boxName+" is now full.");
			}
			System.out.println("====================\n");
		}else{
			System.out.println("No room for new beer "+name+".");
			System.out.println("====================\n");
		}
	}
	
	public ArrayList<Beer> getBeerboxStatus(){
		int room = (maxBeers - beersInBox);
		System.out.println("In beerbox "+boxName+" there is room for "+room+" beers.");
		toString();
		if(beersInBox == 0){
			System.out.println("Beerbox "+boxName+" is empty.");
		}else{
			for(int i=0; i<beers.size(); i++){
				System.out.println("Beer number "+(1+i)+" is "+beers.get(i));
			}
		}

	System.out.println("====================\n");
	return beers;

}

	@Override
	public void drinkBeer(String name) {
		beers.remove(name);
		this.beersInBox -= 1;
		System.out.println("Beer "+name+" drinked.");
		System.out.println("In the beerbox "+boxName+" size "+maxBeers+" is now "+beersInBox+" beers.");
		if(beersInBox == 0){
			System.out.println("Beerbox "+boxName+" is now empty.");
		}
		System.out.println("====================\n");
	}
	
	private class Beer{
		
		private String name;
		private String type;
		
		public Beer(String name, String type){
			this.name = name;
			this.type = type;
		}
		
		@Override
		public String toString() {
		    return name+" "+type;
		}
	}
}