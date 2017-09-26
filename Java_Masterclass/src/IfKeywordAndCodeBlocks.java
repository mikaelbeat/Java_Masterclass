
public class IfKeywordAndCodeBlocks {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int scoreRound2 = 10000;
		int levelCompleted = 5;
		int LevelCompletedRound2 = 8;
		int bonus = 100;
		int bonusRoud2 = 200;
		
		
		
		
		if(score < 5000 && score >1000){
			System.out.println("Your score was " + score + " which is less than 5000.");
		} else if(score < 1000){
			System.out.println("Your score was " + score + " thats so lame.");
		} else {
			System.out.println("Your score was " + score +" which is more than 5000");
		}
		
		System.out.println("");
		
		// This also means that gameOver is true
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
			System.out.println("");
		}
		
		if(gameOver){
			int finalScoreRound2 = scoreRound2 + (LevelCompletedRound2 * bonusRoud2);
			System.out.println("Round 2 final score was " + finalScoreRound2);
		}
		
			

	}

}
