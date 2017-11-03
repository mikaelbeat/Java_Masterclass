package collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<String, String> lanquages = new HashMap<>();
		if(lanquages.containsKey("Java")){
			System.out.println("Java already exists.");
		}else{
			lanquages.put("Java", "a compiled high level, object-oriented, platform independant language.");
			System.out.println("Java added successfully.");
			}
		lanquages.put("Python", "an intepreted object-oriented, high-level programmin laguage with dynamic semantics.");
		lanquages.put("Algol", "an algorithmic lanquage.");
		System.out.println(lanquages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code."));
		System.out.println(lanquages.put("Lisp", "Therein lies madness."));
		
		if(lanquages.containsKey("Java")){
			System.out.println("Java already in the map.");
		}else{
			lanquages.put("Java", "this course is about Java.");
		}
		
		System.out.println("============================================");
		
//		lanquages.remove("Lisp");
		if(lanquages.remove("Algol", "an algorithmic lanquage.")){
			System.out.println("Algol removed.");
		}else{
			System.out.println("Algol not removed,  key / value pair not found.");
		}

		if(lanquages.replace("Lisp", "Therein lies madness.","a functional programming language.")){
			System.out.println("Lisp replaced.");
		}else{
			System.out.println("Lisp was not replaced.");
		}
//		System.out.println(lanquages.replace("Scala", "this will not be added."));
		
		for(String key: lanquages.keySet()){
			System.out.println(key+" : "+lanquages.get(key));
		}
	}

}
