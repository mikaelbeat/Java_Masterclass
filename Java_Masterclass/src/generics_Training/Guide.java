package generics_Training;

public class Guide {

	public static void main(String[] args) {

		String[] a1 = {"First","Second","Third"};
		Integer[] a2 = {1,2,3};
		Double[] a3 = {1.1,2.2,3.3};
		
		print(a1);
		print(a2);
		print(a3);
	}
	
	public static <T>void print(T[] array){
		for(T i: array){
			System.out.println(i);
		}
		System.out.println("==========================");
		
	}

}
