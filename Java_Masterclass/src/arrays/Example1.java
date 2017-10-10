package arrays;

import org.omg.Messaging.SyncScopeHelper;

public class Example1 {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[5];// {1,2,3,4,5,6,7,8,9,10};

		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i * 10;
		}
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println("Element " + i + ", value is " + myIntArray[i]);
		}

	}

}
