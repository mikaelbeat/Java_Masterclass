
public class While_Loop {

	public static void main(String[] args) {

		isEvenNumberMyVersion(8);

//		int count = 1;
//		while(count !=6){
//			System.out.println("Count value is "+count);
//			count++;
//		}
//		
//		System.out.println("");
//		
//		count = 1;
//		while(true){
//			if(count ==6){
//				break;
//			}
//			System.out.println("Count value is "+count);
//			count++;
//		}
//		
//		System.out.println("");
//		
//		count = 1;
//		do {
//			System.out.println("Count value was " +  count);
//			count++;
//		}while(count !=6);
		
		int evenNumbersFoud = 0;
		int number = 5;
		int finishNumber = 20;
		while(number <= finishNumber){
			if(!isEvenNumber(number)){
				number++;
				continue;
			}
			System.out.println("Even number " + number);
			number++;
			
			evenNumbersFoud++;
			if(evenNumbersFoud >=5){
				break;
			}
			
		}
		System.out.println("Total even numbers found = " +evenNumbersFoud);
	}
	
	public static int isEvenNumberMyVersion(int value){
		int result = value % 2;
		while(result == 0){
			System.out.println(value +" is even number.");
			System.out.println("");
			break;
		}if(result !=0){
			System.out.println(value + " is not even number.");
			System.out.println("");
		}
		return result;
	}
	
	public static boolean isEvenNumber(int number){
		if((number % 2) ==0){
			return true;
		}else{
			return false;
		}
	}
	


}


