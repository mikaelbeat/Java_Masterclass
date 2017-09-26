
public class Methods {

	public static void main(String[] args) {
		
		calculateScore(true ,800, 5, 100);
		calculateScore(true, 10000, 8, 200);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
			System.out.println("");
			return finalScore;
		}
			return 0;
		}
	}
	
