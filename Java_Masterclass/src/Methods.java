
public class Methods {

	public static void main(String[] args) {
		
//		calculateScore(true ,800, 5, 100);
//		calculateScore(true, 10000, 8, 200);
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		System.out.println("----------------------------------------");
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePositon("Tim", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePositon("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePositon("Percy", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePositon("Mac", highScorePosition);
		
	}
		
	public  static void displayHighScorePositon(String playerName, int highScorePosition){
		System.out.println(playerName + " managed to get position "
				+ highScorePosition + " on the high  score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore){
		if(playerScore >= 1000){
			return 1;
		}else if(playerScore >= 500 && playerScore < 1000){
			return 2;
		}else if(playerScore  >= 100 && playerScore < 500){
			return 3;
		}else {
			return 4;
		}
	}
	
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("");
			return finalScore;
		}
			return 0;
		}
	
}
	

	
