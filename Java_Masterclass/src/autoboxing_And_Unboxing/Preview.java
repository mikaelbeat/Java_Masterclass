package autoboxing_And_Unboxing;

import java.util.ArrayList;

	class IntClass {
		private int myValue;
		
		public IntClass(int myValue){
			this.myValue = myValue;
		}
		
		public int getMyvalue(){
			return myValue;
		}
		
		public void setMyValue(int myValue){
			this.myValue = myValue;
		}
	}

public class Preview {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];
		
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Tim");
		
		ArrayList<IntClass> intClassArrayList = new ArrayList<>();
		intClassArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i=0; i<=10; i++){
			// Autoboxing, converts int to Integer
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i=0; i<=10; i++){
			// Unboxing, converts Integer value to int
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		
		System.out.println("------------------------------------------");
		
		Integer myIntValue = 56;
		int myInt = myIntValue;
		
		ArrayList<Double> myDoubleValues  = new ArrayList<Double>();
		for(double dbl=0.0; dbl<=10.00; dbl += 0.5){
			myDoubleValues.add(dbl);
		}
		
		for(int i=0; i<myDoubleValues.size(); i++){
			double value = myDoubleValues.get(i);
			System.out.println(i+" --> "+ value);
		}
		
		
		
		
		
		
		
		
		

	}

}
