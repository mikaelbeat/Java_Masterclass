package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] values = getValues(5);
		int[] sorted = sortValues(values);
		
		printArray(sorted);
		
		System.out.println("");
		
		printOriginal(values);

	}
	
	public static int[] getValues(int numbers){
		System.out.println("Enter "+numbers+" numbers:");
		int[] values = new int[numbers];
		
		for(int i=0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printOriginal(int[] values){
		for(int i=0; i<values.length; i++){
			System.out.println("Element "+i+" value is: "+values[i]);
		}
	}
	
	public static void printArray(int[] values){
		for(int i=0; i<values.length; i++){
			System.out.println("Element "+i+" contents "+values[i]);
		}
	}
	
	public static int[] sortValues(int[]values){
//		Copy array
//		int[] sortedArray = new int[values.length];
//		for(int i=0; i<values.length; i++){
//			sortedArray[i] = values[i];
//		}
		
		int[] sortedArray = Arrays.copyOf(values, values.length);
		
		boolean flag = true;
		int temp;
		while(flag){
			flag  = false;
			
			// element 0 - 160
			// element 1 - 50
			// element 2 - 40
			
		for(int i=0; i<sortedArray.length-1; i++){
			if(sortedArray[i] < sortedArray[i+1]){
				temp = sortedArray[i];
				sortedArray[i] = sortedArray[i+1];
				sortedArray[i+1] = temp;
				flag = true;
			}
		}
		}
		return sortedArray;
	}
	


}
