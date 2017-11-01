package scope_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class X {
	
	private Scanner scanner = new Scanner(System.in);
	
	private ArrayList<Integer> x = new ArrayList<Integer>();
	
	X(){
		this.x = new ArrayList<Integer>();
	}
	
	public void x(){
		for(int x=0; this.x.size()<3; x++){
			System.out.print("Enter number "+(x+1)+": ");
			int number = scanner.nextInt();
			this.x.add(number);
		}
		System.out.println("Thanks for numbers!");
		for(int x : this.x){
			System.out.println(x);
		}
	}

}
