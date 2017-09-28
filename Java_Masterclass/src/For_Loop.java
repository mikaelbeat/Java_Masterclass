

public class For_Loop {
	


	public static void main(String[] args) {
		
//		for(int i=2; i<9; i++){
//			System.out.println("10,000 at "+ i + " interest = " + String.format("%.2f",calculateInterest(10000,i)));
//		}
		
		System.out.println("");
		
		for(int i=8; i>=2; i--){
			System.out.println("10,000 at "+ i + " interest = " + String.format("%.2f",calculateInterest(10000,i)));
		}
		
		System.out.println("");
		
		int count = 0;
		for(int i=10; i<50; i++){
			if(isPrime(i)){
				count++;
				System.out.println("Number "+i+" Is prime number.");
				if(count == 3){
					System.out.println("Exiting loop");
					break;
				}
			}
		}
	}
	
	public static boolean isPrime(int n){
		if(n == 1){
			return false;
		}
		for(int i=2; i <= n/2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static double calculateInterest(double amount, double interestRate){
		return(amount * (interestRate/100));
	}
}
