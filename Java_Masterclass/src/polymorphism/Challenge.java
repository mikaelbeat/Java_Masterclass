package polymorphism;

class Auto{
	
	private String name;
	private int cylinders;
	private int wheels;
	
	public Auto(int wheels){
		this.name = "Default";
		this.cylinders = 0;
		this.wheels = wheels;
	}
	
	public String getName(){
		System.out.println("Name is: "+name);
		return name;
	}
	
	public int getCylinders(){
		System.out.println("Number of cylinders is: "+cylinders);
		return cylinders;
	}
	
	public int getWheels(){
		System.out.println("Number of wheels is: "+wheels);
		return wheels;
	}

	public void startEngine(){
		System.out.println("Default engine started.");
	}
}

class Holden extends Auto{

	public Holden(int wheels) {
		super(wheels);
		
	}
	
	@Override
	public String getName(){
		System.out.println("Name is: Holden");
		return name;
	}
	
	@Override
	public void startEngine(){
		System.out.println("Holden engine started.");
	}
}


public class Challenge {
	
	public static void main(String[] args) {
		
		Auto car = new Auto(5);
		car.getName();
		car.getCylinders();
		car.getWheels();
		
		System.out.println("");
		
		Auto holden = new Auto(6);
		holden.getName();
		
		
		
	}

}
