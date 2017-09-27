import java.util.Scanner;

public class Method_Task {

	
	static Scanner name = new Scanner(System.in);
	static Scanner score = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		System.out.print("Enter player name: ");
		String pName = name.next();
		System.out.print("Enter player score: ");
		int pScore = score.nextInt();
		
		int highScorePosition = calculateHighScorePosition(pScore);
		displayHighScorePositon(pName, highScorePosition);
		
	}
		
	public  static void displayHighScorePositon(String pName, int highScorePosition){
		System.out.println(pName + " managed to get position "
				+ highScorePosition + " on the high score table with score.");
	}
	
	public static int calculateHighScorePosition(int pScore){
		if(pScore >= 1000){
			return 1;
		}else if(pScore >= 500 && pScore < 1000){
			return 2;
		}else if(pScore  >= 100 && pScore < 500){
			return 3;
		}else {
			return 4;
		}
	}
}
