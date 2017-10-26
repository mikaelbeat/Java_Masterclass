package inner_Classes_Challenge;

public class Main {

	public static void main(String[] args) {
		
		Beerbox box = new Beerbox("Best of the beers!", 3);
		box.addBeer("Sunny Valley","IPA");
		box.addBeer("Scottish Brawler","Stout");
		box.addBeer("Celtic Golden Showers","Wheat");
		box.addBeer("Nigerian Sun", "Pilsner");
		box.getBeerboxStatus();
		box.drinkBeer("Sunny Valley");
		box.drinkBeer("Scottish Brawler");
		box.drinkBeer("Celtic Golden Showers");
		box.getBeerboxStatus();
	}
}
