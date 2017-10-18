package linkedList;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
	ArrayList<String> nimet = new ArrayList<String>();
	
	nimet.add("Eka");
	nimet.add("Toka");
	nimet.add("Kolmas");
	
	for(int i=0; i<nimet.size(); i++){
		System.out.println(i+": "+nimet.get(i));
	}
	
	}
}
